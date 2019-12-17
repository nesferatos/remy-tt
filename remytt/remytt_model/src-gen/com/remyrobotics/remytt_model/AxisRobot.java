/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.AxisRobot#getHolds <em>Holds</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.AxisRobot#getName <em>Name</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.AxisRobot#getMozzarellaDispenser <em>Mozzarella Dispenser</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.AxisRobot#getCutter <em>Cutter</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.AxisRobot#getSauceDispenser <em>Sauce Dispenser</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot()
 * @model
 * @generated
 */
public interface AxisRobot extends EObject {
	/**
	 * Returns the value of the '<em><b>Holds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' containment reference.
	 * @see #setHolds(Holdable)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot_Holds()
	 * @model containment="true"
	 * @generated
	 */
	Holdable getHolds();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.AxisRobot#getHolds <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holds</em>' containment reference.
	 * @see #getHolds()
	 * @generated
	 */
	void setHolds(Holdable value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.AxisRobot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mozzarella Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mozzarella Dispenser</em>' containment reference.
	 * @see #setMozzarellaDispenser(MozzarellaDispenser)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot_MozzarellaDispenser()
	 * @model containment="true"
	 * @generated
	 */
	MozzarellaDispenser getMozzarellaDispenser();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.AxisRobot#getMozzarellaDispenser <em>Mozzarella Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mozzarella Dispenser</em>' containment reference.
	 * @see #getMozzarellaDispenser()
	 * @generated
	 */
	void setMozzarellaDispenser(MozzarellaDispenser value);

	/**
	 * Returns the value of the '<em><b>Cutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutter</em>' containment reference.
	 * @see #setCutter(Cutter)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot_Cutter()
	 * @model containment="true"
	 * @generated
	 */
	Cutter getCutter();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.AxisRobot#getCutter <em>Cutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutter</em>' containment reference.
	 * @see #getCutter()
	 * @generated
	 */
	void setCutter(Cutter value);

	/**
	 * Returns the value of the '<em><b>Sauce Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sauce Dispenser</em>' containment reference.
	 * @see #setSauceDispenser(SauceDispenser)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAxisRobot_SauceDispenser()
	 * @model containment="true"
	 * @generated
	 */
	SauceDispenser getSauceDispenser();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.AxisRobot#getSauceDispenser <em>Sauce Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sauce Dispenser</em>' containment reference.
	 * @see #getSauceDispenser()
	 * @generated
	 */
	void setSauceDispenser(SauceDispenser value);

} // AxisRobot
