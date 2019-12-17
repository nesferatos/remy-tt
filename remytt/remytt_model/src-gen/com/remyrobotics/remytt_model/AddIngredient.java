/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.AddIngredient#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAddIngredient()
 * @model
 * @generated
 */
public interface AddIngredient extends com.remyrobotics.remytt_model.Process {
	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link com.remyrobotics.remytt_model.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#getAddIngredient_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingredient> getIngredient();

} // AddIngredient
