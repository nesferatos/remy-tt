/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.AxisRobot;
import com.remyrobotics.remytt_model.Kitchen;
import com.remyrobotics.remytt_model.OvenConveyor;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.Storage;
import com.remyrobotics.remytt_model.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getOvenConveyors <em>Oven Conveyors</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getGiverRobots <em>Giver Robots</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getTakerRobots <em>Taker Robots</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getWorkTable <em>Work Table</em>}</li>
 *   <li>{@link com.remyrobotics.remytt_model.impl.KitchenImpl#getWaitTable <em>Wait Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KitchenImpl extends MinimalEObjectImpl.Container implements Kitchen {
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
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Storage storage;

	/**
	 * The cached value of the '{@link #getOvenConveyors() <em>Oven Conveyors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvenConveyors()
	 * @generated
	 * @ordered
	 */
	protected EList<OvenConveyor> ovenConveyors;

	/**
	 * The cached value of the '{@link #getGiverRobots() <em>Giver Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiverRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisRobot> giverRobots;

	/**
	 * The cached value of the '{@link #getTakerRobots() <em>Taker Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakerRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisRobot> takerRobots;

	/**
	 * The cached value of the '{@link #getWorkTable() <em>Work Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTable()
	 * @generated
	 * @ordered
	 */
	protected Table workTable;

	/**
	 * The cached value of the '{@link #getWaitTable() <em>Wait Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTable()
	 * @generated
	 * @ordered
	 */
	protected Table waitTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Remytt_modelPackage.Literals.KITCHEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.KITCHEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorage(Storage newStorage, NotificationChain msgs) {
		Storage oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.KITCHEN__STORAGE, oldStorage, newStorage);
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
	public void setStorage(Storage newStorage) {
		if (newStorage != storage) {
			NotificationChain msgs = null;
			if (storage != null)
				msgs = ((InternalEObject) storage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__STORAGE, null, msgs);
			if (newStorage != null)
				msgs = ((InternalEObject) newStorage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__STORAGE, null, msgs);
			msgs = basicSetStorage(newStorage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.KITCHEN__STORAGE, newStorage,
					newStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OvenConveyor> getOvenConveyors() {
		if (ovenConveyors == null) {
			ovenConveyors = new EObjectContainmentEList<OvenConveyor>(OvenConveyor.class, this,
					Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS);
		}
		return ovenConveyors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AxisRobot> getGiverRobots() {
		if (giverRobots == null) {
			giverRobots = new EObjectContainmentEList<AxisRobot>(AxisRobot.class, this,
					Remytt_modelPackage.KITCHEN__GIVER_ROBOTS);
		}
		return giverRobots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AxisRobot> getTakerRobots() {
		if (takerRobots == null) {
			takerRobots = new EObjectContainmentEList<AxisRobot>(AxisRobot.class, this,
					Remytt_modelPackage.KITCHEN__TAKER_ROBOTS);
		}
		return takerRobots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getWorkTable() {
		return workTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTable(Table newWorkTable, NotificationChain msgs) {
		Table oldWorkTable = workTable;
		workTable = newWorkTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.KITCHEN__WORK_TABLE, oldWorkTable, newWorkTable);
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
	public void setWorkTable(Table newWorkTable) {
		if (newWorkTable != workTable) {
			NotificationChain msgs = null;
			if (workTable != null)
				msgs = ((InternalEObject) workTable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__WORK_TABLE, null, msgs);
			if (newWorkTable != null)
				msgs = ((InternalEObject) newWorkTable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__WORK_TABLE, null, msgs);
			msgs = basicSetWorkTable(newWorkTable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.KITCHEN__WORK_TABLE, newWorkTable,
					newWorkTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getWaitTable() {
		return waitTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaitTable(Table newWaitTable, NotificationChain msgs) {
		Table oldWaitTable = waitTable;
		waitTable = newWaitTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Remytt_modelPackage.KITCHEN__WAIT_TABLE, oldWaitTable, newWaitTable);
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
	public void setWaitTable(Table newWaitTable) {
		if (newWaitTable != waitTable) {
			NotificationChain msgs = null;
			if (waitTable != null)
				msgs = ((InternalEObject) waitTable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__WAIT_TABLE, null, msgs);
			if (newWaitTable != null)
				msgs = ((InternalEObject) newWaitTable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Remytt_modelPackage.KITCHEN__WAIT_TABLE, null, msgs);
			msgs = basicSetWaitTable(newWaitTable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Remytt_modelPackage.KITCHEN__WAIT_TABLE, newWaitTable,
					newWaitTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Remytt_modelPackage.KITCHEN__STORAGE:
			return basicSetStorage(null, msgs);
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
			return ((InternalEList<?>) getOvenConveyors()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
			return ((InternalEList<?>) getGiverRobots()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
			return ((InternalEList<?>) getTakerRobots()).basicRemove(otherEnd, msgs);
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
			return basicSetWorkTable(null, msgs);
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			return basicSetWaitTable(null, msgs);
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
		case Remytt_modelPackage.KITCHEN__NAME:
			return getName();
		case Remytt_modelPackage.KITCHEN__STORAGE:
			return getStorage();
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
			return getOvenConveyors();
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
			return getGiverRobots();
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
			return getTakerRobots();
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
			return getWorkTable();
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			return getWaitTable();
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
		case Remytt_modelPackage.KITCHEN__NAME:
			setName((String) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__STORAGE:
			setStorage((Storage) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
			getOvenConveyors().clear();
			getOvenConveyors().addAll((Collection<? extends OvenConveyor>) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
			getGiverRobots().clear();
			getGiverRobots().addAll((Collection<? extends AxisRobot>) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
			getTakerRobots().clear();
			getTakerRobots().addAll((Collection<? extends AxisRobot>) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
			setWorkTable((Table) newValue);
			return;
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			setWaitTable((Table) newValue);
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
		case Remytt_modelPackage.KITCHEN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Remytt_modelPackage.KITCHEN__STORAGE:
			setStorage((Storage) null);
			return;
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
			getOvenConveyors().clear();
			return;
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
			getGiverRobots().clear();
			return;
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
			getTakerRobots().clear();
			return;
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
			setWorkTable((Table) null);
			return;
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			setWaitTable((Table) null);
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
		case Remytt_modelPackage.KITCHEN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Remytt_modelPackage.KITCHEN__STORAGE:
			return storage != null;
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
			return ovenConveyors != null && !ovenConveyors.isEmpty();
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
			return giverRobots != null && !giverRobots.isEmpty();
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
			return takerRobots != null && !takerRobots.isEmpty();
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
			return workTable != null;
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			return waitTable != null;
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

} //KitchenImpl
