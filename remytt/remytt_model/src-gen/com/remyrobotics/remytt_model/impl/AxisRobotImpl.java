/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.AxisRobot;
import com.remyrobotics.remytt_model.Cutter;
import com.remyrobotics.remytt_model.Holdable;
import com.remyrobotics.remytt_model.MozzarellaDispenser;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.SauceDispenser;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl#getHolds <em>Holds</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl#getMozzarellaDispenser <em>Mozzarella Dispenser</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl#getCutter <em>Cutter</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl#getSauceDispenser <em>Sauce Dispenser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisRobotImpl extends MinimalEObjectImpl.Container implements AxisRobot {
	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected Holdable holds;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMozzarellaDispenser() <em>Mozzarella Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMozzarellaDispenser()
	 * @generated
	 * @ordered
	 */
	protected MozzarellaDispenser mozzarellaDispenser;

	/**
	 * The cached value of the '{@link #getCutter() <em>Cutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutter()
	 * @generated
	 * @ordered
	 */
	protected Cutter cutter;

	/**
	 * The cached value of the '{@link #getSauceDispenser() <em>Sauce Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSauceDispenser()
	 * @generated
	 * @ordered
	 */
	protected SauceDispenser sauceDispenser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisRobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.AXIS_ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Holdable getHolds() {
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolds(Holdable newHolds, NotificationChain msgs) {
		Holdable oldHolds = holds;
		holds = newHolds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.AXIS_ROBOT__HOLDS, oldHolds, newHolds);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHolds(Holdable newHolds) {
		if (newHolds != holds) {
			NotificationChain msgs = null;
			if (holds != null)
				msgs = ((InternalEObject) holds).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__HOLDS, null, msgs);
			if (newHolds != null)
				msgs = ((InternalEObject) newHolds).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__HOLDS, null, msgs);
			msgs = basicSetHolds(newHolds, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.AXIS_ROBOT__HOLDS, newHolds,
					newHolds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.AXIS_ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MozzarellaDispenser getMozzarellaDispenser() {
		return mozzarellaDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMozzarellaDispenser(MozzarellaDispenser newMozzarellaDispenser,
			NotificationChain msgs) {
		MozzarellaDispenser oldMozzarellaDispenser = mozzarellaDispenser;
		mozzarellaDispenser = newMozzarellaDispenser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER, oldMozzarellaDispenser,
					newMozzarellaDispenser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMozzarellaDispenser(MozzarellaDispenser newMozzarellaDispenser) {
		if (newMozzarellaDispenser != mozzarellaDispenser) {
			NotificationChain msgs = null;
			if (mozzarellaDispenser != null)
				msgs = ((InternalEObject) mozzarellaDispenser).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER, null, msgs);
			if (newMozzarellaDispenser != null)
				msgs = ((InternalEObject) newMozzarellaDispenser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER, null, msgs);
			msgs = basicSetMozzarellaDispenser(newMozzarellaDispenser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER,
					newMozzarellaDispenser, newMozzarellaDispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cutter getCutter() {
		return cutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutter(Cutter newCutter, NotificationChain msgs) {
		Cutter oldCutter = cutter;
		cutter = newCutter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.AXIS_ROBOT__CUTTER, oldCutter, newCutter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutter(Cutter newCutter) {
		if (newCutter != cutter) {
			NotificationChain msgs = null;
			if (cutter != null)
				msgs = ((InternalEObject) cutter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__CUTTER, null, msgs);
			if (newCutter != null)
				msgs = ((InternalEObject) newCutter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__CUTTER, null, msgs);
			msgs = basicSetCutter(newCutter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.AXIS_ROBOT__CUTTER, newCutter,
					newCutter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SauceDispenser getSauceDispenser() {
		return sauceDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSauceDispenser(SauceDispenser newSauceDispenser, NotificationChain msgs) {
		SauceDispenser oldSauceDispenser = sauceDispenser;
		sauceDispenser = newSauceDispenser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER, oldSauceDispenser, newSauceDispenser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSauceDispenser(SauceDispenser newSauceDispenser) {
		if (newSauceDispenser != sauceDispenser) {
			NotificationChain msgs = null;
			if (sauceDispenser != null)
				msgs = ((InternalEObject) sauceDispenser).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER, null, msgs);
			if (newSauceDispenser != null)
				msgs = ((InternalEObject) newSauceDispenser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER, null, msgs);
			msgs = basicSetSauceDispenser(newSauceDispenser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER,
					newSauceDispenser, newSauceDispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.AXIS_ROBOT__HOLDS:
			return basicSetHolds(null, msgs);
		case Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER:
			return basicSetMozzarellaDispenser(null, msgs);
		case Remytt_modelPackage.AXIS_ROBOT__CUTTER:
			return basicSetCutter(null, msgs);
		case Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER:
			return basicSetSauceDispenser(null, msgs);
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
		case Remytt_modelPackage.AXIS_ROBOT__HOLDS:
			return getHolds();
		case Remytt_modelPackage.AXIS_ROBOT__NAME:
			return getName();
		case Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER:
			return getMozzarellaDispenser();
		case Remytt_modelPackage.AXIS_ROBOT__CUTTER:
			return getCutter();
		case Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER:
			return getSauceDispenser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Remytt_modelPackage.AXIS_ROBOT__HOLDS:
			setHolds((Holdable) newValue);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__NAME:
			setName((String) newValue);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER:
			setMozzarellaDispenser((MozzarellaDispenser) newValue);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__CUTTER:
			setCutter((Cutter) newValue);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER:
			setSauceDispenser((SauceDispenser) newValue);
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
		case Remytt_modelPackage.AXIS_ROBOT__HOLDS:
			setHolds((Holdable) null);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER:
			setMozzarellaDispenser((MozzarellaDispenser) null);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__CUTTER:
			setCutter((Cutter) null);
			return;
		case Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER:
			setSauceDispenser((SauceDispenser) null);
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
		case Remytt_modelPackage.AXIS_ROBOT__HOLDS:
			return holds != null;
		case Remytt_modelPackage.AXIS_ROBOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Remytt_modelPackage.AXIS_ROBOT__MOZZARELLA_DISPENSER:
			return mozzarellaDispenser != null;
		case Remytt_modelPackage.AXIS_ROBOT__CUTTER:
			return cutter != null;
		case Remytt_modelPackage.AXIS_ROBOT__SAUCE_DISPENSER:
			return sauceDispenser != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AxisRobotImpl
