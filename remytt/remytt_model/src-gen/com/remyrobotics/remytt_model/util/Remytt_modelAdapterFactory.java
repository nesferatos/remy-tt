/**
 */
package com.remyrobotics.remytt_model.util;

import com.remyrobotics.remytt_model.AddIngredient;
import com.remyrobotics.remytt_model.AxisRobot;
import com.remyrobotics.remytt_model.Bake;
import com.remyrobotics.remytt_model.Box;
import com.remyrobotics.remytt_model.Cut;
import com.remyrobotics.remytt_model.Cutter;
import com.remyrobotics.remytt_model.Holdable;
import com.remyrobotics.remytt_model.Ingredient;
import com.remyrobotics.remytt_model.Kitchen;
import com.remyrobotics.remytt_model.Mozzarella;
import com.remyrobotics.remytt_model.MozzarellaDispenser;
import com.remyrobotics.remytt_model.NoPizzaCrust;
import com.remyrobotics.remytt_model.OvenConveyor;
import com.remyrobotics.remytt_model.PizzaCrust;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.SauceDispenser;
import com.remyrobotics.remytt_model.Storage;
import com.remyrobotics.remytt_model.Table;
import com.remyrobotics.remytt_model.TomatoSauce;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage
 * @generated
 */
public class Remytt_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Remytt_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remytt_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Remytt_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Remytt_modelSwitch<Adapter> modelSwitch = new Remytt_modelSwitch<Adapter>() {
		@Override
		public Adapter caseKitchen(Kitchen object) {
			return createKitchenAdapter();
		}

		@Override
		public Adapter caseAxisRobot(AxisRobot object) {
			return createAxisRobotAdapter();
		}

		@Override
		public Adapter caseIngredient(Ingredient object) {
			return createIngredientAdapter();
		}

		@Override
		public Adapter caseOvenConveyor(OvenConveyor object) {
			return createOvenConveyorAdapter();
		}

		@Override
		public Adapter caseProcess(com.remyrobotics.remytt_model.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseMozzarella(Mozzarella object) {
			return createMozzarellaAdapter();
		}

		@Override
		public Adapter caseTomatoSauce(TomatoSauce object) {
			return createTomatoSauceAdapter();
		}

		@Override
		public Adapter casePizzaCrust(PizzaCrust object) {
			return createPizzaCrustAdapter();
		}

		@Override
		public Adapter caseBox(Box object) {
			return createBoxAdapter();
		}

		@Override
		public Adapter caseMozzarellaDispenser(MozzarellaDispenser object) {
			return createMozzarellaDispenserAdapter();
		}

		@Override
		public Adapter caseSauceDispenser(SauceDispenser object) {
			return createSauceDispenserAdapter();
		}

		@Override
		public Adapter caseHoldable(Holdable object) {
			return createHoldableAdapter();
		}

		@Override
		public Adapter caseStorage(Storage object) {
			return createStorageAdapter();
		}

		@Override
		public Adapter caseBake(Bake object) {
			return createBakeAdapter();
		}

		@Override
		public Adapter caseAddIngredient(AddIngredient object) {
			return createAddIngredientAdapter();
		}

		@Override
		public Adapter caseCut(Cut object) {
			return createCutAdapter();
		}

		@Override
		public Adapter caseCutter(Cutter object) {
			return createCutterAdapter();
		}

		@Override
		public Adapter caseNoPizzaCrust(NoPizzaCrust object) {
			return createNoPizzaCrustAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Kitchen
	 * @generated
	 */
	public Adapter createKitchenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.AxisRobot <em>Axis Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.AxisRobot
	 * @generated
	 */
	public Adapter createAxisRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Ingredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.OvenConveyor <em>Oven Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.OvenConveyor
	 * @generated
	 */
	public Adapter createOvenConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Mozzarella <em>Mozzarella</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Mozzarella
	 * @generated
	 */
	public Adapter createMozzarellaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.TomatoSauce <em>Tomato Sauce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.TomatoSauce
	 * @generated
	 */
	public Adapter createTomatoSauceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.PizzaCrust <em>Pizza Crust</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.PizzaCrust
	 * @generated
	 */
	public Adapter createPizzaCrustAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.MozzarellaDispenser <em>Mozzarella Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.MozzarellaDispenser
	 * @generated
	 */
	public Adapter createMozzarellaDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.SauceDispenser <em>Sauce Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.SauceDispenser
	 * @generated
	 */
	public Adapter createSauceDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Holdable <em>Holdable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Holdable
	 * @generated
	 */
	public Adapter createHoldableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Bake <em>Bake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Bake
	 * @generated
	 */
	public Adapter createBakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.AddIngredient <em>Add Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.AddIngredient
	 * @generated
	 */
	public Adapter createAddIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Cut <em>Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Cut
	 * @generated
	 */
	public Adapter createCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.Cutter <em>Cutter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.Cutter
	 * @generated
	 */
	public Adapter createCutterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remyrobotics.remytt_model.NoPizzaCrust <em>No Pizza Crust</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remyrobotics.remytt_model.NoPizzaCrust
	 * @generated
	 */
	public Adapter createNoPizzaCrustAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Remytt_modelAdapterFactory
