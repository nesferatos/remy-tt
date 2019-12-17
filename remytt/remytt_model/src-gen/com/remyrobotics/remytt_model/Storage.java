/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.Storage#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.Storage#getCrusts <em>Crusts</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends EObject {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.Box}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getStorage_Boxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Box> getBoxes();

	/**
	 * Returns the value of the '<em><b>Crusts</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.PizzaCrust}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crusts</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getStorage_Crusts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PizzaCrust> getCrusts();

} // Storage
