/**
 */
package com.remyrobotics.remytt_model.impl;

import com.remyrobotics.remytt_model.AddIngredient;
import com.remyrobotics.remytt_model.AxisRobot;
import com.remyrobotics.remytt_model.Bake;
import com.remyrobotics.remytt_model.Box;
import com.remyrobotics.remytt_model.Cut;
import com.remyrobotics.remytt_model.Cutter;
import com.remyrobotics.remytt_model.Holdable;
import com.remyrobotics.remytt_model.Ingredient;
import com.remyrobotics.remytt_model.Kitchen;
import com.remyrobotics.remytt_model.Mozzarella;
import com.remyrobotics.remytt_model.MozzarellaDispenser;
import com.remyrobotics.remytt_model.NoPizzaCrust;
import com.remyrobotics.remytt_model.OvenConveyor;
import com.remyrobotics.remytt_model.PizzaCrust;
import com.remyrobotics.remytt_model.Remytt_modelFactory;
import com.remyrobotics.remytt_model.Remytt_modelPackage;
import com.remyrobotics.remytt_model.SauceDispenser;
import com.remyrobotics.remytt_model.Storage;
import com.remyrobotics.remytt_model.Table;
import com.remyrobotics.remytt_model.TomatoSauce;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Remytt_modelPackageImpl extends EPackageImpl implements Remytt_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ovenConveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mozzarellaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomatoSauceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pizzaCrustEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mozzarellaDispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sauceDispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holdableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cutterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noPizzaCrustEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.remyrobotics.remytt_model.Remytt_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Remytt_modelPackageImpl() {
		super(eNS_URI, Remytt_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Remytt_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Remytt_modelPackage init() {
		if (isInited)
			return (Remytt_modelPackage) EPackage.Registry.INSTANCE.getEPackage(Remytt_modelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRemytt_modelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Remytt_modelPackageImpl theRemytt_modelPackage = registeredRemytt_modelPackage instanceof Remytt_modelPackageImpl
				? (Remytt_modelPackageImpl) registeredRemytt_modelPackage
				: new Remytt_modelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRemytt_modelPackage.createPackageContents();

		// Initialize created meta-data
		theRemytt_modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRemytt_modelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Remytt_modelPackage.eNS_URI, theRemytt_modelPackage);
		return theRemytt_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKitchen() {
		return kitchenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKitchen_Name() {
		return (EAttribute) kitchenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_Storage() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_OvenConveyors() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_GiverRobots() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_TakerRobots() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_WorkTable() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitchen_WaitTable() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxisRobot() {
		return axisRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisRobot_Holds() {
		return (EReference) axisRobotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxisRobot_Name() {
		return (EAttribute) axisRobotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisRobot_MozzarellaDispenser() {
		return (EReference) axisRobotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisRobot_Cutter() {
		return (EReference) axisRobotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisRobot_SauceDispenser() {
		return (EReference) axisRobotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOvenConveyor() {
		return ovenConveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOvenConveyor_Input() {
		return (EReference) ovenConveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOvenConveyor_Output() {
		return (EReference) ovenConveyorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOvenConveyor_Baking() {
		return (EReference) ovenConveyorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOvenConveyor__WaitForPizza() {
		return ovenConveyorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Things() {
		return (EReference) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Name() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMozzarella() {
		return mozzarellaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTomatoSauce() {
		return tomatoSauceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPizzaCrust() {
		return pizzaCrustEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPizzaCrust_Processes() {
		return (EReference) pizzaCrustEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPizzaCrust_OrderId() {
		return (EAttribute) pizzaCrustEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBox() {
		return boxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMozzarellaDispenser() {
		return mozzarellaDispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMozzarellaDispenser_Mozzarella() {
		return (EReference) mozzarellaDispenserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSauceDispenser() {
		return sauceDispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSauceDispenser_TomatoSauce() {
		return (EReference) sauceDispenserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoldable() {
		return holdableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_Boxes() {
		return (EReference) storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_Crusts() {
		return (EReference) storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBake() {
		return bakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddIngredient() {
		return addIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddIngredient_Ingredient() {
		return (EReference) addIngredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCut() {
		return cutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCutter() {
		return cutterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoPizzaCrust() {
		return noPizzaCrustEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Remytt_modelFactory getRemytt_modelFactory() {
		return (Remytt_modelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		kitchenEClass = createEClass(KITCHEN);
		createEAttribute(kitchenEClass, KITCHEN__NAME);
		createEReference(kitchenEClass, KITCHEN__STORAGE);
		createEReference(kitchenEClass, KITCHEN__OVEN_CONVEYORS);
		createEReference(kitchenEClass, KITCHEN__GIVER_ROBOTS);
		createEReference(kitchenEClass, KITCHEN__TAKER_ROBOTS);
		createEReference(kitchenEClass, KITCHEN__WORK_TABLE);
		createEReference(kitchenEClass, KITCHEN__WAIT_TABLE);

		axisRobotEClass = createEClass(AXIS_ROBOT);
		createEReference(axisRobotEClass, AXIS_ROBOT__HOLDS);
		createEAttribute(axisRobotEClass, AXIS_ROBOT__NAME);
		createEReference(axisRobotEClass, AXIS_ROBOT__MOZZARELLA_DISPENSER);
		createEReference(axisRobotEClass, AXIS_ROBOT__CUTTER);
		createEReference(axisRobotEClass, AXIS_ROBOT__SAUCE_DISPENSER);

		ingredientEClass = createEClass(INGREDIENT);

		ovenConveyorEClass = createEClass(OVEN_CONVEYOR);
		createEReference(ovenConveyorEClass, OVEN_CONVEYOR__INPUT);
		createEReference(ovenConveyorEClass, OVEN_CONVEYOR__OUTPUT);
		createEReference(ovenConveyorEClass, OVEN_CONVEYOR__BAKING);
		createEOperation(ovenConveyorEClass, OVEN_CONVEYOR___WAIT_FOR_PIZZA);

		processEClass = createEClass(PROCESS);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__THINGS);
		createEAttribute(tableEClass, TABLE__NAME);

		mozzarellaEClass = createEClass(MOZZARELLA);

		tomatoSauceEClass = createEClass(TOMATO_SAUCE);

		pizzaCrustEClass = createEClass(PIZZA_CRUST);
		createEReference(pizzaCrustEClass, PIZZA_CRUST__PROCESSES);
		createEAttribute(pizzaCrustEClass, PIZZA_CRUST__ORDER_ID);

		boxEClass = createEClass(BOX);

		mozzarellaDispenserEClass = createEClass(MOZZARELLA_DISPENSER);
		createEReference(mozzarellaDispenserEClass, MOZZARELLA_DISPENSER__MOZZARELLA);

		sauceDispenserEClass = createEClass(SAUCE_DISPENSER);
		createEReference(sauceDispenserEClass, SAUCE_DISPENSER__TOMATO_SAUCE);

		holdableEClass = createEClass(HOLDABLE);

		storageEClass = createEClass(STORAGE);
		createEReference(storageEClass, STORAGE__BOXES);
		createEReference(storageEClass, STORAGE__CRUSTS);

		bakeEClass = createEClass(BAKE);

		addIngredientEClass = createEClass(ADD_INGREDIENT);
		createEReference(addIngredientEClass, ADD_INGREDIENT__INGREDIENT);

		cutEClass = createEClass(CUT);

		cutterEClass = createEClass(CUTTER);

		noPizzaCrustEClass = createEClass(NO_PIZZA_CRUST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mozzarellaEClass.getESuperTypes().add(this.getIngredient());
		tomatoSauceEClass.getESuperTypes().add(this.getIngredient());
		pizzaCrustEClass.getESuperTypes().add(this.getHoldable());
		boxEClass.getESuperTypes().add(this.getIngredient());
		boxEClass.getESuperTypes().add(this.getHoldable());
		bakeEClass.getESuperTypes().add(this.getProcess());
		addIngredientEClass.getESuperTypes().add(this.getProcess());
		cutEClass.getESuperTypes().add(this.getProcess());
		noPizzaCrustEClass.getESuperTypes().add(this.getPizzaCrust());

		// Initialize classes, features, and operations; add parameters
		initEClass(kitchenEClass, Kitchen.class, "Kitchen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKitchen_Name(), ecorePackage.getEString(), "name", null, 0, 1, Kitchen.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_Storage(), this.getStorage(), null, "storage", null, 0, 1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_OvenConveyors(), this.getOvenConveyor(), null, "ovenConveyors", null, 1, -1,
				Kitchen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_GiverRobots(), this.getAxisRobot(), null, "giverRobots", null, 1, -1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_TakerRobots(), this.getAxisRobot(), null, "takerRobots", null, 1, -1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_WorkTable(), this.getTable(), null, "workTable", null, 1, 1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_WaitTable(), this.getTable(), null, "waitTable", null, 1, 1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisRobotEClass, AxisRobot.class, "AxisRobot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxisRobot_Holds(), this.getHoldable(), null, "holds", null, 0, 1, AxisRobot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisRobot_Name(), ecorePackage.getEString(), "name", null, 0, 1, AxisRobot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisRobot_MozzarellaDispenser(), this.getMozzarellaDispenser(), null, "mozzarellaDispenser",
				null, 0, 1, AxisRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisRobot_Cutter(), this.getCutter(), null, "cutter", null, 0, 1, AxisRobot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisRobot_SauceDispenser(), this.getSauceDispenser(), null, "sauceDispenser", null, 0, 1,
				AxisRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ovenConveyorEClass, OvenConveyor.class, "OvenConveyor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOvenConveyor_Input(), this.getPizzaCrust(), null, "input", null, 0, 6, OvenConveyor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOvenConveyor_Output(), this.getPizzaCrust(), null, "output", null, 0, 6, OvenConveyor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOvenConveyor_Baking(), this.getPizzaCrust(), null, "baking", null, 0, 12, OvenConveyor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOvenConveyor__WaitForPizza(), this.getPizzaCrust(), "waitForPizza", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(processEClass, com.remyrobotics.remytt_model.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Things(), this.getHoldable(), null, "things", null, 0, -1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mozzarellaEClass, Mozzarella.class, "Mozzarella", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tomatoSauceEClass, TomatoSauce.class, "TomatoSauce", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pizzaCrustEClass, PizzaCrust.class, "PizzaCrust", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPizzaCrust_Processes(), this.getProcess(), null, "processes", null, 0, -1, PizzaCrust.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPizzaCrust_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, PizzaCrust.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mozzarellaDispenserEClass, MozzarellaDispenser.class, "MozzarellaDispenser", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMozzarellaDispenser_Mozzarella(), this.getMozzarella(), null, "mozzarella", null, 0, -1,
				MozzarellaDispenser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sauceDispenserEClass, SauceDispenser.class, "SauceDispenser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSauceDispenser_TomatoSauce(), this.getTomatoSauce(), null, "tomatoSauce", null, 0, -1,
				SauceDispenser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(holdableEClass, Holdable.class, "Holdable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorage_Boxes(), this.getBox(), null, "boxes", null, 0, -1, Storage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStorage_Crusts(), this.getPizzaCrust(), null, "crusts", null, 0, -1, Storage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bakeEClass, Bake.class, "Bake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addIngredientEClass, AddIngredient.class, "AddIngredient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddIngredient_Ingredient(), this.getIngredient(), null, "ingredient", null, 0, -1,
				AddIngredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cutEClass, Cut.class, "Cut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cutterEClass, Cutter.class, "Cutter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noPizzaCrustEClass, NoPizzaCrust.class, "NoPizzaCrust", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Remytt_modelPackageImpl
