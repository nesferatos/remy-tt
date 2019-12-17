package com.remyrobotics.remytt_model;

import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;

public class RoboDemo {

	private static ExecutorService threadPool = Executors.newCachedThreadPool(new ThreadFactory() {
		@Override
		public Thread newThread(Runnable r) {
			Thread t = Executors.defaultThreadFactory().newThread(r);
			// t.setDaemon(true);
			return t;
		}
	});

	private int orderId;

	private void robotWorking(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	final int inputUpper = Remytt_modelPackage.eINSTANCE.getOvenConveyor_Input().getUpperBound();
	final int bakeUpper = Remytt_modelPackage.eINSTANCE.getOvenConveyor_Baking().getUpperBound();
	final int outputUpper = Remytt_modelPackage.eINSTANCE.getOvenConveyor_Output().getUpperBound();

	public void run(Kitchen kitchen) {
		Job job = Job.create("roboDemo", (ICoreRunnable) monitor -> {

			for (OvenConveyor oven : kitchen.getOvenConveyors()) {
				synchronized (oven.getInput()) {
					synchronized (oven.getOutput()) {
						while (0 < inputUpper - oven.getInput().size()) {
							oven.getInput().add(Remytt_modelFactory.eINSTANCE.createNoPizzaCrust());
						}

						while (0 < bakeUpper - oven.getBaking().size()) {
							oven.getBaking().add(Remytt_modelFactory.eINSTANCE.createNoPizzaCrust());
						}

						while (0 < outputUpper - oven.getOutput().size()) {
							oven.getOutput().add(Remytt_modelFactory.eINSTANCE.createNoPizzaCrust());
						}
					}
				}

				threadPool.submit(() -> {
					try {
						while (true) {
							synchronized (oven) {
								PizzaCrust transInp = oven.getInput().remove(inputUpper - 1);

								PizzaCrust transBak = oven.getBaking().remove(bakeUpper - 1);
								if (!(transBak instanceof NoPizzaCrust)) {
									transBak.getProcesses().add(Remytt_modelFactory.eINSTANCE.createBake());
								}

								if (!(oven.getOutput().get(outputUpper - 1) instanceof NoPizzaCrust)) {
									System.out.println("pizza fell! " + oven.getOutput().get(outputUpper - 1));
								}

								oven.getOutput().remove(outputUpper - 1);

								oven.getInput().add(0, Remytt_modelFactory.eINSTANCE.createNoPizzaCrust());
								oven.getBaking().add(0, transInp);
								oven.getOutput().add(0, transBak);

							}

							Thread.sleep(3000);

							synchronized (oven) {
								oven.notifyAll();
								
							}


						}
					} catch (Exception e) {
						System.out.println(oven + " oven failed");
						e.printStackTrace();
					}

				});
			}

			for (int robotNum = 0; robotNum < kitchen.getGiverRobots().size(); robotNum++) {

				AxisRobot robot = kitchen.getGiverRobots().get(robotNum);

				final int fRobotNum = robotNum;

				threadPool.submit(() -> {
					try {
						int i = 0;
						while (!kitchen.getStorage().getCrusts().isEmpty()) {
							robotWorking(400);
							PizzaCrust crust;
							synchronized (kitchen.getStorage().getCrusts()) {
								if (kitchen.getStorage().getCrusts().isEmpty()
										|| robot.getMozzarellaDispenser().getMozzarella().isEmpty()
										|| robot.getSauceDispenser().getTomatoSauce().isEmpty()) {
									return;
								}
								crust = kitchen.getStorage().getCrusts()
										.get(kitchen.getStorage().getCrusts().size() - 1);
								robot.setHolds(crust);
								crust.setOrderId("#" + orderId);
								orderId++;
								System.out.println("robot " + robot.getName() + " started cooking order " + orderId);
							}
							robotWorking(400);
							synchronized (kitchen.getWorkTable()) {
								kitchen.getWorkTable().getThings().add(crust);
							}

							AddIngredient ingredientAddProcess = Remytt_modelFactory.eINSTANCE.createAddIngredient();

							ingredientAddProcess.getIngredient().add(robot.getSauceDispenser().getTomatoSauce()
									.get(robot.getSauceDispenser().getTomatoSauce().size() - 1));

							ingredientAddProcess.getIngredient().add(robot.getMozzarellaDispenser().getMozzarella()
									.get(robot.getMozzarellaDispenser().getMozzarella().size() - 1));

							robotWorking(1000);
							crust.getProcesses().add(ingredientAddProcess);

							robotWorking(200);
							robot.setHolds(crust);
							

							int ovenNum = fRobotNum % kitchen.getOvenConveyors().size();
							OvenConveyor oven = kitchen.getOvenConveyors().get(ovenNum);
							synchronized (oven) {
								oven.wait();
								for (int pizzaPlace = 0; pizzaPlace < inputUpper; pizzaPlace++) {
									PizzaCrust crustIter = oven.getInput().get(pizzaPlace);
									if (crustIter instanceof NoPizzaCrust) {
										synchronized (crustIter) {
											robotWorking(200);
											oven.getInput().set(pizzaPlace, crust);
											break;
										}

									}
								}
							}

						}
					} catch (Exception e) {
						System.out.println("!" + robot.getName() + " failed");
						e.printStackTrace();
					}

				});

			}

		});

		for (int robotNum = 0; robotNum < kitchen.getTakerRobots().size(); robotNum++) {

			AxisRobot robot = kitchen.getTakerRobots().get(robotNum);

			final int fRobotNum = robotNum;

			threadPool.submit(() -> {
				try {
					int ovenNum = fRobotNum % kitchen.getOvenConveyors().size();
					OvenConveyor oven = kitchen.getOvenConveyors().get(ovenNum);
					while (true) {
						synchronized (oven) {
							oven.wait();
							for (int i = 0; i < oven.getOutput().size(); i++) {
								PizzaCrust crust = oven.getOutput().get(i);
								if (!(crust instanceof NoPizzaCrust)) {
									robotWorking(200);
									synchronized(oven) {
										robot.setHolds(crust);
										oven.getOutput().add(i, Remytt_modelFactory.eINSTANCE.createNoPizzaCrust());
									}
								}
							}
						}
						PizzaCrust pizzaCrust = (PizzaCrust) robot.getHolds();
						if (pizzaCrust != null) {
							robotWorking(100);
							synchronized (kitchen.getWaitTable()) {
								kitchen.getWaitTable().getThings().add(robot.getHolds());
							}
							robotWorking(100);
							synchronized (kitchen.getStorage().getBoxes()) {
								robot.setHolds(kitchen.getStorage().getBoxes()
										.get(kitchen.getStorage().getBoxes().size() - 1));
							}
							robotWorking(100);

							AddIngredient pack = Remytt_modelFactory.eINSTANCE.createAddIngredient();
							pack.getIngredient().add((Ingredient) robot.getHolds());

							robotWorking(100);
							pizzaCrust.getProcesses().add(pack);

							robotWorking(100);
							pizzaCrust.getProcesses().add(Remytt_modelFactory.eINSTANCE.createCut());

							System.out.println(pizzaCrust.getOrderId() + " finished by robot " + robot.getName());
						}

					}
				} catch (Exception e) {
					System.out.println("!" + robot.getName() + " failed");
					e.printStackTrace();
				}

			});

		}

		job.schedule();

	}

}
