/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getName <em>Name</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getOvenConveyors <em>Oven Conveyors</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getGiverRobots <em>Giver Robots</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getTakerRobots <em>Taker Robots</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getWorkTable <em>Work Table</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Kitchen#getWaitTable <em>Wait Table</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen()
 * @model
 * @generated
 */
public interface Kitchen extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.Kitchen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference.
	 * @see #setStorage(Storage)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_Storage()
	 * @model containment="true"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.Kitchen#getStorage <em>Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' containment reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

	/**
	 * Returns the value of the '<em><b>Oven Conveyors</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.OvenConveyor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oven Conveyors</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_OvenConveyors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OvenConveyor> getOvenConveyors();

	/**
	 * Returns the value of the '<em><b>Giver Robots</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.AxisRobot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Giver Robots</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_GiverRobots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AxisRobot> getGiverRobots();

	/**
	 * Returns the value of the '<em><b>Taker Robots</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.AxisRobot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taker Robots</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_TakerRobots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AxisRobot> getTakerRobots();

	/**
	 * Returns the value of the '<em><b>Work Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Table</em>' containment reference.
	 * @see #setWorkTable(Table)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_WorkTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getWorkTable();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.Kitchen#getWorkTable <em>Work Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Table</em>' containment reference.
	 * @see #getWorkTable()
	 * @generated
	 */
	void setWorkTable(Table value);

	/**
	 * Returns the value of the '<em><b>Wait Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Table</em>' containment reference.
	 * @see #setWaitTable(Table)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getKitchen_WaitTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getWaitTable();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.Kitchen#getWaitTable <em>Wait Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Table</em>' containment reference.
	 * @see #getWaitTable()
	 * @generated
	 */
	void setWaitTable(Table value);

} // Kitchen
