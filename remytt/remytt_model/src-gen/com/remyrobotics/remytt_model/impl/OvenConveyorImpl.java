/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.OvenConveyor;
import com.remyrobotics.remytt_model.PizzaCrust;
import com.remyrobotics.remytt_model.Remytt_modelPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Oven Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.OvenConveyorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.OvenConveyorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.OvenConveyorImpl#getBaking <em>Baking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OvenConveyorImpl extends MinimalEObjectImpl.Container implements OvenConveyor {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<PizzaCrust> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<PizzaCrust> output;

	/**
	 * The cached value of the '{@link #getBaking() <em>Baking</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaking()
	 * @generated
	 * @ordered
	 */
	protected EList<PizzaCrust> baking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OvenConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.OVEN_CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PizzaCrust> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<PizzaCrust>(PizzaCrust.class, this,
					Remytt_modelPackage.OVEN_CONVEYOR__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PizzaCrust> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<PizzaCrust>(PizzaCrust.class, this,
					Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PizzaCrust> getBaking() {
		if (baking == null) {
			baking = new EObjectContainmentEList<PizzaCrust>(PizzaCrust.class, this,
					Remytt_modelPackage.OVEN_CONVEYOR__BAKING);
		}
		return baking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PizzaCrust waitForPizza() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.OVEN_CONVEYOR__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.OVEN_CONVEYOR__BAKING:
			return ((InternalEList<?>) getBaking()).basicRemove(otherEnd, msgs);
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
		case Remytt_modelPackage.OVEN_CONVEYOR__INPUT:
			return getInput();
		case Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT:
			return getOutput();
		case Remytt_modelPackage.OVEN_CONVEYOR__BAKING:
			return getBaking();
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
		case Remytt_modelPackage.OVEN_CONVEYOR__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends PizzaCrust>) newValue);
			return;
		case Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends PizzaCrust>) newValue);
			return;
		case Remytt_modelPackage.OVEN_CONVEYOR__BAKING:
			getBaking().clear();
			getBaking().addAll((Collection<? extends PizzaCrust>) newValue);
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
		case Remytt_modelPackage.OVEN_CONVEYOR__INPUT:
			getInput().clear();
			return;
		case Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT:
			getOutput().clear();
			return;
		case Remytt_modelPackage.OVEN_CONVEYOR__BAKING:
			getBaking().clear();
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
		case Remytt_modelPackage.OVEN_CONVEYOR__INPUT:
			return input != null && !input.isEmpty();
		case Remytt_modelPackage.OVEN_CONVEYOR__OUTPUT:
			return output != null && !output.isEmpty();
		case Remytt_modelPackage.OVEN_CONVEYOR__BAKING:
			return baking != null && !baking.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Remytt_modelPackage.OVEN_CONVEYOR___WAIT_FOR_PIZZA:
			return waitForPizza();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OvenConveyorImpl
