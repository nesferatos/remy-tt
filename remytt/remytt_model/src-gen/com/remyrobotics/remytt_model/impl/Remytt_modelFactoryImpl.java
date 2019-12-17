/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.AddIngredient;
import com.remyrobotics.remytt_model.AxisRobot;
import com.remyrobotics.remytt_model.Bake;
import com.remyrobotics.remytt_model.Box;
import com.remyrobotics.remytt_model.Cut;
import com.remyrobotics.remytt_model.Cutter;
import com.remyrobotics.remytt_model.Kitchen;
import com.remyrobotics.remytt_model.Mozzarella;
import com.remyrobotics.remytt_model.MozzarellaDispenser;
import com.remyrobotics.remytt_model.NoPizzaCrust;
import com.remyrobotics.remytt_model.OvenConveyor;
import com.remyrobotics.remytt_model.PizzaCrust;
import com.remyrobotics.remytt_model.Remytt_modelFactory;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.SauceDispenser;
import com.remyrobotics.remytt_model.Storage;
import com.remyrobotics.remytt_model.Table;
import com.remyrobotics.remytt_model.TomatoSauce;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Remytt_modelFactoryImpl extends EFactoryImpl implements Remytt_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Remytt_modelFactory init() {
		try {
			Remytt_modelFactory theRemytt_modelFactory = (Remytt_modelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Remytt_modelPackage.eNS_URI);
			if (theRemytt_modelFactory != null) {
				return theRemytt_modelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Remytt_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remytt_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Remytt_modelPackage.KITCHEN:
			return createKitchen();
		case Remytt_modelPackage.AXIS_ROBOT:
			return createAxisRobot();
		case Remytt_modelPackage.OVEN_CONVEYOR:
			return createOvenConveyor();
		case Remytt_modelPackage.TABLE:
			return createTable();
		case Remytt_modelPackage.MOZZARELLA:
			return createMozzarella();
		case Remytt_modelPackage.TOMATO_SAUCE:
			return createTomatoSauce();
		case Remytt_modelPackage.PIZZA_CRUST:
			return createPizzaCrust();
		case Remytt_modelPackage.BOX:
			return createBox();
		case Remytt_modelPackage.MOZZARELLA_DISPENSER:
			return createMozzarellaDispenser();
		case Remytt_modelPackage.SAUCE_DISPENSER:
			return createSauceDispenser();
		case Remytt_modelPackage.STORAGE:
			return createStorage();
		case Remytt_modelPackage.BAKE:
			return createBake();
		case Remytt_modelPackage.ADD_INGREDIENT:
			return createAddIngredient();
		case Remytt_modelPackage.CUT:
			return createCut();
		case Remytt_modelPackage.CUTTER:
			return createCutter();
		case Remytt_modelPackage.NO_PIZZA_CRUST:
			return createNoPizzaCrust();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kitchen createKitchen() {
		KitchenImpl kitchen = new KitchenImpl();
		return kitchen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisRobot createAxisRobot() {
		AxisRobotImpl axisRobot = new AxisRobotImpl();
		return axisRobot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OvenConveyor createOvenConveyor() {
		OvenConveyorImpl ovenConveyor = new OvenConveyorImpl();
		return ovenConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mozzarella createMozzarella() {
		MozzarellaImpl mozzarella = new MozzarellaImpl();
		return mozzarella;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TomatoSauce createTomatoSauce() {
		TomatoSauceImpl tomatoSauce = new TomatoSauceImpl();
		return tomatoSauce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PizzaCrust createPizzaCrust() {
		PizzaCrustImpl pizzaCrust = new PizzaCrustImpl();
		return pizzaCrust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MozzarellaDispenser createMozzarellaDispenser() {
		MozzarellaDispenserImpl mozzarellaDispenser = new MozzarellaDispenserImpl();
		return mozzarellaDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SauceDispenser createSauceDispenser() {
		SauceDispenserImpl sauceDispenser = new SauceDispenserImpl();
		return sauceDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bake createBake() {
		BakeImpl bake = new BakeImpl();
		return bake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddIngredient createAddIngredient() {
		AddIngredientImpl addIngredient = new AddIngredientImpl();
		return addIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cut createCut() {
		CutImpl cut = new CutImpl();
		return cut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cutter createCutter() {
		CutterImpl cutter = new CutterImpl();
		return cutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoPizzaCrust createNoPizzaCrust() {
		NoPizzaCrustImpl noPizzaCrust = new NoPizzaCrustImpl();
		return noPizzaCrust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Remytt_modelPackage getRemytt_modelPackage() {
		return (Remytt_modelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Remytt_modelPackage getPackage() {
		return Remytt_modelPackage.eINSTANCE;
	}

} //Remytt_modelFactoryImpl
