/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oven Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.OvenConveyor#getInput <em>Input</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.OvenConveyor#getOutput <em>Output</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.OvenConveyor#getBaking <em>Baking</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getOvenConveyor()
 * @model
 * @generated
 */
public interface OvenConveyor extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.PizzaCrust}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getOvenConveyor_Input()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<PizzaCrust> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.PizzaCrust}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getOvenConveyor_Output()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<PizzaCrust> getOutput();

	/**
	 * Returns the value of the '<em><b>Baking</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.PizzaCrust}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baking</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getOvenConveyor_Baking()
	 * @model containment="true" upper="12"
	 * @generated
	 */
	EList<PizzaCrust> getBaking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PizzaCrust waitForPizza();

} // OvenConveyor
