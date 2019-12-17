/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.SauceDispenser;
import com.remyrobotics.remytt_model.TomatoSauce;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sauce Dispenser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.SauceDispenserImpl#getTomatoSauce <em>Tomato Sauce</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SauceDispenserImpl extends MinimalEObjectImpl.Container implements SauceDispenser {
	/**
	 * The cached value of the '{@link #getTomatoSauce() <em>Tomato Sauce</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTomatoSauce()
	 * @generated
	 * @ordered
	 */
	protected EList<TomatoSauce> tomatoSauce;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SauceDispenserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.SAUCE_DISPENSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TomatoSauce> getTomatoSauce() {
		if (tomatoSauce == null) {
			tomatoSauce = new EObjectContainmentEList<TomatoSauce>(TomatoSauce.class, this,
					Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE);
		}
		return tomatoSauce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE:
			return ((InternalEList<?>) getTomatoSauce()).basicRemove(otherEnd, msgs);
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
		case Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE:
			return getTomatoSauce();
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
		case Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE:
			getTomatoSauce().clear();
			getTomatoSauce().addAll((Collection<? extends TomatoSauce>) newValue);
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
		case Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE:
			getTomatoSauce().clear();
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
		case Remytt_modelPackage.SAUCE_DISPENSER__TOMATO_SAUCE:
			return tomatoSauce != null && !tomatoSauce.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SauceDispenserImpl
