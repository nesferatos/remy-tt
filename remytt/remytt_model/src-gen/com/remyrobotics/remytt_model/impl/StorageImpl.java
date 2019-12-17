/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.Box;
import com.remyrobotics.remytt_model.PizzaCrust;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.Storage;

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
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.StorageImpl#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.StorageImpl#getCrusts <em>Crusts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends MinimalEObjectImpl.Container implements Storage {
	/**
	 * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Box> boxes;

	/**
	 * The cached value of the '{@link #getCrusts() <em>Crusts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrusts()
	 * @generated
	 * @ordered
	 */
	protected EList<PizzaCrust> crusts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Box> getBoxes() {
		if (boxes == null) {
			boxes = new EObjectContainmentEList<Box>(Box.class, this, Remytt_modelPackage.STORAGE__BOXES);
		}
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PizzaCrust> getCrusts() {
		if (crusts == null) {
			crusts = new EObjectContainmentEList<PizzaCrust>(PizzaCrust.class, this,
					Remytt_modelPackage.STORAGE__CRUSTS);
		}
		return crusts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.STORAGE__BOXES:
			return ((InternalEList<?>) getBoxes()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.STORAGE__CRUSTS:
			return ((InternalEList<?>) getCrusts()).basicRemove(otherEnd, msgs);
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
		case Remytt_modelPackage.STORAGE__BOXES:
			return getBoxes();
		case Remytt_modelPackage.STORAGE__CRUSTS:
			return getCrusts();
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
		case Remytt_modelPackage.STORAGE__BOXES:
			getBoxes().clear();
			getBoxes().addAll((Collection<? extends Box>) newValue);
			return;
		case Remytt_modelPackage.STORAGE__CRUSTS:
			getCrusts().clear();
			getCrusts().addAll((Collection<? extends PizzaCrust>) newValue);
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
		case Remytt_modelPackage.STORAGE__BOXES:
			getBoxes().clear();
			return;
		case Remytt_modelPackage.STORAGE__CRUSTS:
			getCrusts().clear();
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
		case Remytt_modelPackage.STORAGE__BOXES:
			return boxes != null && !boxes.isEmpty();
		case Remytt_modelPackage.STORAGE__CRUSTS:
			return crusts != null && !crusts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageImpl
