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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage
 * @generated
 */
public class Remytt_modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Remytt_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remytt_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Remytt_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Remytt_modelPackage.KITCHEN: {
			Kitchen kitchen = (Kitchen) theEObject;
			T result = caseKitchen(kitchen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.AXIS_ROBOT: {
			AxisRobot axisRobot = (AxisRobot) theEObject;
			T result = caseAxisRobot(axisRobot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.INGREDIENT: {
			Ingredient ingredient = (Ingredient) theEObject;
			T result = caseIngredient(ingredient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.OVEN_CONVEYOR: {
			OvenConveyor ovenConveyor = (OvenConveyor) theEObject;
			T result = caseOvenConveyor(ovenConveyor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.PROCESS: {
			com.remyrobotics.remytt_model.Process process = (com.remyrobotics.remytt_model.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.MOZZARELLA: {
			Mozzarella mozzarella = (Mozzarella) theEObject;
			T result = caseMozzarella(mozzarella);
			if (result == null)
				result = caseIngredient(mozzarella);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.TOMATO_SAUCE: {
			TomatoSauce tomatoSauce = (TomatoSauce) theEObject;
			T result = caseTomatoSauce(tomatoSauce);
			if (result == null)
				result = caseIngredient(tomatoSauce);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.PIZZA_CRUST: {
			PizzaCrust pizzaCrust = (PizzaCrust) theEObject;
			T result = casePizzaCrust(pizzaCrust);
			if (result == null)
				result = caseHoldable(pizzaCrust);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.BOX: {
			Box box = (Box) theEObject;
			T result = caseBox(box);
			if (result == null)
				result = caseIngredient(box);
			if (result == null)
				result = caseHoldable(box);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.MOZZARELLA_DISPENSER: {
			MozzarellaDispenser mozzarellaDispenser = (MozzarellaDispenser) theEObject;
			T result = caseMozzarellaDispenser(mozzarellaDispenser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.SAUCE_DISPENSER: {
			SauceDispenser sauceDispenser = (SauceDispenser) theEObject;
			T result = caseSauceDispenser(sauceDispenser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.HOLDABLE: {
			Holdable holdable = (Holdable) theEObject;
			T result = caseHoldable(holdable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.STORAGE: {
			Storage storage = (Storage) theEObject;
			T result = caseStorage(storage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.BAKE: {
			Bake bake = (Bake) theEObject;
			T result = caseBake(bake);
			if (result == null)
				result = caseProcess(bake);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.ADD_INGREDIENT: {
			AddIngredient addIngredient = (AddIngredient) theEObject;
			T result = caseAddIngredient(addIngredient);
			if (result == null)
				result = caseProcess(addIngredient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.CUT: {
			Cut cut = (Cut) theEObject;
			T result = caseCut(cut);
			if (result == null)
				result = caseProcess(cut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.CUTTER: {
			Cutter cutter = (Cutter) theEObject;
			T result = caseCutter(cutter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Remytt_modelPackage.NO_PIZZA_CRUST: {
			NoPizzaCrust noPizzaCrust = (NoPizzaCrust) theEObject;
			T result = caseNoPizzaCrust(noPizzaCrust);
			if (result == null)
				result = casePizzaCrust(noPizzaCrust);
			if (result == null)
				result = caseHoldable(noPizzaCrust);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kitchen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKitchen(Kitchen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisRobot(AxisRobot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIngredient(Ingredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oven Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oven Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOvenConveyor(OvenConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(com.remyrobotics.remytt_model.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mozzarella</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mozzarella</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMozzarella(Mozzarella object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tomato Sauce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tomato Sauce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTomatoSauce(TomatoSauce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pizza Crust</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pizza Crust</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePizzaCrust(PizzaCrust object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBox(Box object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mozzarella Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mozzarella Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMozzarellaDispenser(MozzarellaDispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sauce Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sauce Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSauceDispenser(SauceDispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Holdable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Holdable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoldable(Holdable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bake</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bake</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBake(Bake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddIngredient(AddIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCut(Cut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cutter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cutter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutter(Cutter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Pizza Crust</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Pizza Crust</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoPizzaCrust(NoPizzaCrust object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Remytt_modelSwitch
