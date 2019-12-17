/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.AddIngredient;
import com.remyrobotics.remytt_model.Ingredient;
import com.remyrobotics.remytt_model.Remytt_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AddIngredientImpl#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddIngredientImpl extends ProcessImpl implements AddIngredient {
	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.ADD_INGREDIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ingredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<Ingredient>(Ingredient.class, this,
					Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT:
			return ((InternalEList<?>) getIngredient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT:
			return getIngredient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT:
			getIngredient().clear();
			getIngredient().addAll((Collection<? extends Ingredient>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT:
			getIngredient().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Remytt_modelPackage.ADD_INGREDIENT__INGREDIENT:
			return ingredient != null && !ingredient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddIngredientImpl
