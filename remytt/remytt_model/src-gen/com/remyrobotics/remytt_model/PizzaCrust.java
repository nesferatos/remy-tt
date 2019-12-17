/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizza Crust</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.PizzaCrust#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.PizzaCrust#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getPizzaCrust()
 * @model
 * @generated
 */
public interface PizzaCrust extends Holdable {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getPizzaCrust_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<com.remyrobotics.remytt_model.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getPizzaCrust_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.PizzaCrust#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

} // PizzaCrust
