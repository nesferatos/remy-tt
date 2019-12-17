/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.Table#getThings <em>Things</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Table#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Things</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.Holdable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Things</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getTable_Things()
	 * @model containment="true"
	 * @generated
	 */
	EList<Holdable> getThings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.remyrobotics.remytt_model.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Table
