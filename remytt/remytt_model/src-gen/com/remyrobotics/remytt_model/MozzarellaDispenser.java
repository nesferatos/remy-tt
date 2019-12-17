/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mozzarella Dispenser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.MozzarellaDispenser#getMozzarella <em>Mozzarella</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getMozzarellaDispenser()
 * @model
 * @generated
 */
public interface MozzarellaDispenser extends EObject {
	/**
	 * Returns the value of the '<em><b>Mozzarella</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.Mozzarella}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mozzarella</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getMozzarellaDispenser_Mozzarella()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mozzarella> getMozzarella();

} // MozzarellaDispenser
