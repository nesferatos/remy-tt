/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.Mozzarella;
import com.remyrobotics.remytt_model.MozzarellaDispenser;
import com.remyrobotics.remytt_model.Remytt_modelPackage;

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
 * An implementation of the model object '<em><b>Mozzarella Dispenser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.MozzarellaDispenserImpl#getMozzarella <em>Mozzarella</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MozzarellaDispenserImpl extends MinimalEObjectImpl.Container implements MozzarellaDispenser {
	/**
	 * The cached value of the '{@link #getMozzarella() <em>Mozzarella</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMozzarella()
	 * @generated
	 * @ordered
	 */
	protected EList<Mozzarella> mozzarella;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MozzarellaDispenserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.MOZZARELLA_DISPENSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mozzarella> getMozzarella() {
		if (mozzarella == null) {
			mozzarella = new EObjectContainmentEList<Mozzarella>(Mozzarella.class, this,
					Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA);
		}
		return mozzarella;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA:
			return ((InternalEList<?>) getMozzarella()).basicRemove(otherEnd, msgs);
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
		case Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA:
			return getMozzarella();
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
		case Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA:
			getMozzarella().clear();
			getMozzarella().addAll((Collection<? extends Mozzarella>) newValue);
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
		case Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA:
			getMozzarella().clear();
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
		case Remytt_modelPackage.MOZZARELLA_DISPENSER__MOZZARELLA:
			return mozzarella != null && !mozzarella.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MozzarellaDispenserImpl
