/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sauce Dispenser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.SauceDispenser#getTomatoSauce <em>Tomato Sauce</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getSauceDispenser()
 * @model
 * @generated
 */
public interface SauceDispenser extends EObject {
	/**
	 * Returns the value of the '<em><b>Tomato Sauce</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.TomatoSauce}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tomato Sauce</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getSauceDispenser_TomatoSauce()
	 * @model containment="true"
	 * @generated
	 */
	EList<TomatoSauce> getTomatoSauce();

} // SauceDispenser
