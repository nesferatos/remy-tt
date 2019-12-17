/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.remyrobotics.remytt_model.Remytt_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Remytt_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "remytt_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.remyrobotics.com/remytt_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.remyrobotics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Remytt_modelPackage eINSTANCE = com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.KitchenImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__STORAGE = 1;

	/**
	 * The feature id for the '<em><b>Oven Conveyors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__OVEN_CONVEYORS = 2;

	/**
	 * The feature id for the '<em><b>Giver Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__GIVER_ROBOTS = 3;

	/**
	 * The feature id for the '<em><b>Taker Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__TAKER_ROBOTS = 4;

	/**
	 * The feature id for the '<em><b>Work Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__WORK_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Wait Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__WAIT_TABLE = 6;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl <em>Axis Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.AxisRobotImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getAxisRobot()
	 * @generated
	 */
	int AXIS_ROBOT = 1;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT__HOLDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mozzarella Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT__MOZZARELLA_DISPENSER = 2;

	/**
	 * The feature id for the '<em><b>Cutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT__CUTTER = 3;

	/**
	 * The feature id for the '<em><b>Sauce Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT__SAUCE_DISPENSER = 4;

	/**
	 * The number of structural features of the '<em>Axis Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Axis Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.IngredientImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 2;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.OvenConveyorImpl <em>Oven Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.OvenConveyorImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getOvenConveyor()
	 * @generated
	 */
	int OVEN_CONVEYOR = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Baking</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR__BAKING = 2;

	/**
	 * The number of structural features of the '<em>Oven Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Wait For Pizza</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR___WAIT_FOR_PIZZA = 0;

	/**
	 * The number of operations of the '<em>Oven Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVEN_CONVEYOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.ProcessImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.TableImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 5;

	/**
	 * The feature id for the '<em><b>Things</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__THINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.MozzarellaImpl <em>Mozzarella</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.MozzarellaImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getMozzarella()
	 * @generated
	 */
	int MOZZARELLA = 6;

	/**
	 * The number of structural features of the '<em>Mozzarella</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOZZARELLA_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mozzarella</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOZZARELLA_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.TomatoSauceImpl <em>Tomato Sauce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.TomatoSauceImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getTomatoSauce()
	 * @generated
	 */
	int TOMATO_SAUCE = 7;

	/**
	 * The number of structural features of the '<em>Tomato Sauce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATO_SAUCE_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tomato Sauce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATO_SAUCE_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.Holdable <em>Holdable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.Holdable
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getHoldable()
	 * @generated
	 */
	int HOLDABLE = 12;

	/**
	 * The number of structural features of the '<em>Holdable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Holdable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.PizzaCrustImpl <em>Pizza Crust</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.PizzaCrustImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getPizzaCrust()
	 * @generated
	 */
	int PIZZA_CRUST = 8;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_CRUST__PROCESSES = HOLDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_CRUST__ORDER_ID = HOLDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pizza Crust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_CRUST_FEATURE_COUNT = HOLDABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pizza Crust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_CRUST_OPERATION_COUNT = HOLDABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.BoxImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 9;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.MozzarellaDispenserImpl <em>Mozzarella Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.MozzarellaDispenserImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getMozzarellaDispenser()
	 * @generated
	 */
	int MOZZARELLA_DISPENSER = 10;

	/**
	 * The feature id for the '<em><b>Mozzarella</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOZZARELLA_DISPENSER__MOZZARELLA = 0;

	/**
	 * The number of structural features of the '<em>Mozzarella Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOZZARELLA_DISPENSER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mozzarella Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOZZARELLA_DISPENSER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.SauceDispenserImpl <em>Sauce Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.SauceDispenserImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getSauceDispenser()
	 * @generated
	 */
	int SAUCE_DISPENSER = 11;

	/**
	 * The feature id for the '<em><b>Tomato Sauce</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE_DISPENSER__TOMATO_SAUCE = 0;

	/**
	 * The number of structural features of the '<em>Sauce Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE_DISPENSER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sauce Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE_DISPENSER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.StorageImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 13;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BOXES = 0;

	/**
	 * The feature id for the '<em><b>Crusts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CRUSTS = 1;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.BakeImpl <em>Bake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.BakeImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getBake()
	 * @generated
	 */
	int BAKE = 14;

	/**
	 * The number of structural features of the '<em>Bake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAKE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAKE_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.AddIngredientImpl <em>Add Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.AddIngredientImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getAddIngredient()
	 * @generated
	 */
	int ADD_INGREDIENT = 15;

	/**
	 * The feature id for the '<em><b>Ingredient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INGREDIENT__INGREDIENT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INGREDIENT_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INGREDIENT_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.CutImpl <em>Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.CutImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getCut()
	 * @generated
	 */
	int CUT = 16;

	/**
	 * The number of structural features of the '<em>Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUT_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.CutterImpl <em>Cutter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.CutterImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getCutter()
	 * @generated
	 */
	int CUTTER = 17;

	/**
	 * The number of structural features of the '<em>Cutter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUTTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cutter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUTTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remyrobotics.remytt_model.impl.NoPizzaCrustImpl <em>No Pizza Crust</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remyrobotics.remytt_model.impl.NoPizzaCrustImpl
	 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getNoPizzaCrust()
	 * @generated
	 */
	int NO_PIZZA_CRUST = 18;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PIZZA_CRUST__PROCESSES = PIZZA_CRUST__PROCESSES;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PIZZA_CRUST__ORDER_ID = PIZZA_CRUST__ORDER_ID;

	/**
	 * The number of structural features of the '<em>No Pizza Crust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PIZZA_CRUST_FEATURE_COUNT = PIZZA_CRUST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Pizza Crust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PIZZA_CRUST_OPERATION_COUNT = PIZZA_CRUST_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for the attribute '{@link com.remyrobotics.remytt_model.Kitchen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getName()
	 * @see #getKitchen()
	 * @generated
	 */
	EAttribute getKitchen_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.Kitchen#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getStorage()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_Storage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Kitchen#getOvenConveyors <em>Oven Conveyors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oven Conveyors</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getOvenConveyors()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_OvenConveyors();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Kitchen#getGiverRobots <em>Giver Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Giver Robots</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getGiverRobots()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_GiverRobots();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Kitchen#getTakerRobots <em>Taker Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taker Robots</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getTakerRobots()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_TakerRobots();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.Kitchen#getWorkTable <em>Work Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work Table</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getWorkTable()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_WorkTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.Kitchen#getWaitTable <em>Wait Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait Table</em>'.
	 * @see com.remyrobotics.remytt_model.Kitchen#getWaitTable()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_WaitTable();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.AxisRobot <em>Axis Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Robot</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot
	 * @generated
	 */
	EClass getAxisRobot();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.AxisRobot#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holds</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot#getHolds()
	 * @see #getAxisRobot()
	 * @generated
	 */
	EReference getAxisRobot_Holds();

	/**
	 * Returns the meta object for the attribute '{@link com.remyrobotics.remytt_model.AxisRobot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot#getName()
	 * @see #getAxisRobot()
	 * @generated
	 */
	EAttribute getAxisRobot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.AxisRobot#getMozzarellaDispenser <em>Mozzarella Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mozzarella Dispenser</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot#getMozzarellaDispenser()
	 * @see #getAxisRobot()
	 * @generated
	 */
	EReference getAxisRobot_MozzarellaDispenser();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.AxisRobot#getCutter <em>Cutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cutter</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot#getCutter()
	 * @see #getAxisRobot()
	 * @generated
	 */
	EReference getAxisRobot_Cutter();

	/**
	 * Returns the meta object for the containment reference '{@link com.remyrobotics.remytt_model.AxisRobot#getSauceDispenser <em>Sauce Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sauce Dispenser</em>'.
	 * @see com.remyrobotics.remytt_model.AxisRobot#getSauceDispenser()
	 * @see #getAxisRobot()
	 * @generated
	 */
	EReference getAxisRobot_SauceDispenser();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see com.remyrobotics.remytt_model.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.OvenConveyor <em>Oven Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oven Conveyor</em>'.
	 * @see com.remyrobotics.remytt_model.OvenConveyor
	 * @generated
	 */
	EClass getOvenConveyor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.OvenConveyor#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.remyrobotics.remytt_model.OvenConveyor#getInput()
	 * @see #getOvenConveyor()
	 * @generated
	 */
	EReference getOvenConveyor_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.OvenConveyor#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.remyrobotics.remytt_model.OvenConveyor#getOutput()
	 * @see #getOvenConveyor()
	 * @generated
	 */
	EReference getOvenConveyor_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.OvenConveyor#getBaking <em>Baking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baking</em>'.
	 * @see com.remyrobotics.remytt_model.OvenConveyor#getBaking()
	 * @see #getOvenConveyor()
	 * @generated
	 */
	EReference getOvenConveyor_Baking();

	/**
	 * Returns the meta object for the '{@link com.remyrobotics.remytt_model.OvenConveyor#waitForPizza() <em>Wait For Pizza</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Wait For Pizza</em>' operation.
	 * @see com.remyrobotics.remytt_model.OvenConveyor#waitForPizza()
	 * @generated
	 */
	EOperation getOvenConveyor__WaitForPizza();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see com.remyrobotics.remytt_model.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.remyrobotics.remytt_model.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Table#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Things</em>'.
	 * @see com.remyrobotics.remytt_model.Table#getThings()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Things();

	/**
	 * Returns the meta object for the attribute '{@link com.remyrobotics.remytt_model.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.remyrobotics.remytt_model.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Mozzarella <em>Mozzarella</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mozzarella</em>'.
	 * @see com.remyrobotics.remytt_model.Mozzarella
	 * @generated
	 */
	EClass getMozzarella();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.TomatoSauce <em>Tomato Sauce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomato Sauce</em>'.
	 * @see com.remyrobotics.remytt_model.TomatoSauce
	 * @generated
	 */
	EClass getTomatoSauce();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.PizzaCrust <em>Pizza Crust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizza Crust</em>'.
	 * @see com.remyrobotics.remytt_model.PizzaCrust
	 * @generated
	 */
	EClass getPizzaCrust();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.PizzaCrust#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see com.remyrobotics.remytt_model.PizzaCrust#getProcesses()
	 * @see #getPizzaCrust()
	 * @generated
	 */
	EReference getPizzaCrust_Processes();

	/**
	 * Returns the meta object for the attribute '{@link com.remyrobotics.remytt_model.PizzaCrust#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see com.remyrobotics.remytt_model.PizzaCrust#getOrderId()
	 * @see #getPizzaCrust()
	 * @generated
	 */
	EAttribute getPizzaCrust_OrderId();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see com.remyrobotics.remytt_model.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.MozzarellaDispenser <em>Mozzarella Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mozzarella Dispenser</em>'.
	 * @see com.remyrobotics.remytt_model.MozzarellaDispenser
	 * @generated
	 */
	EClass getMozzarellaDispenser();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.MozzarellaDispenser#getMozzarella <em>Mozzarella</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mozzarella</em>'.
	 * @see com.remyrobotics.remytt_model.MozzarellaDispenser#getMozzarella()
	 * @see #getMozzarellaDispenser()
	 * @generated
	 */
	EReference getMozzarellaDispenser_Mozzarella();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.SauceDispenser <em>Sauce Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sauce Dispenser</em>'.
	 * @see com.remyrobotics.remytt_model.SauceDispenser
	 * @generated
	 */
	EClass getSauceDispenser();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.SauceDispenser#getTomatoSauce <em>Tomato Sauce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tomato Sauce</em>'.
	 * @see com.remyrobotics.remytt_model.SauceDispenser#getTomatoSauce()
	 * @see #getSauceDispenser()
	 * @generated
	 */
	EReference getSauceDispenser_TomatoSauce();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Holdable <em>Holdable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holdable</em>'.
	 * @see com.remyrobotics.remytt_model.Holdable
	 * @generated
	 */
	EClass getHoldable();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see com.remyrobotics.remytt_model.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Storage#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see com.remyrobotics.remytt_model.Storage#getBoxes()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Boxes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.Storage#getCrusts <em>Crusts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crusts</em>'.
	 * @see com.remyrobotics.remytt_model.Storage#getCrusts()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Crusts();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Bake <em>Bake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bake</em>'.
	 * @see com.remyrobotics.remytt_model.Bake
	 * @generated
	 */
	EClass getBake();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.AddIngredient <em>Add Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Ingredient</em>'.
	 * @see com.remyrobotics.remytt_model.AddIngredient
	 * @generated
	 */
	EClass getAddIngredient();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remyrobotics.remytt_model.AddIngredient#getIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient</em>'.
	 * @see com.remyrobotics.remytt_model.AddIngredient#getIngredient()
	 * @see #getAddIngredient()
	 * @generated
	 */
	EReference getAddIngredient_Ingredient();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Cut <em>Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cut</em>'.
	 * @see com.remyrobotics.remytt_model.Cut
	 * @generated
	 */
	EClass getCut();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.Cutter <em>Cutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cutter</em>'.
	 * @see com.remyrobotics.remytt_model.Cutter
	 * @generated
	 */
	EClass getCutter();

	/**
	 * Returns the meta object for class '{@link com.remyrobotics.remytt_model.NoPizzaCrust <em>No Pizza Crust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Pizza Crust</em>'.
	 * @see com.remyrobotics.remytt_model.NoPizzaCrust
	 * @generated
	 */
	EClass getNoPizzaCrust();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Remytt_modelFactory getRemytt_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.KitchenImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITCHEN__NAME = eINSTANCE.getKitchen_Name();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__STORAGE = eINSTANCE.getKitchen_Storage();

		/**
		 * The meta object literal for the '<em><b>Oven Conveyors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__OVEN_CONVEYORS = eINSTANCE.getKitchen_OvenConveyors();

		/**
		 * The meta object literal for the '<em><b>Giver Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__GIVER_ROBOTS = eINSTANCE.getKitchen_GiverRobots();

		/**
		 * The meta object literal for the '<em><b>Taker Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__TAKER_ROBOTS = eINSTANCE.getKitchen_TakerRobots();

		/**
		 * The meta object literal for the '<em><b>Work Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__WORK_TABLE = eINSTANCE.getKitchen_WorkTable();

		/**
		 * The meta object literal for the '<em><b>Wait Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__WAIT_TABLE = eINSTANCE.getKitchen_WaitTable();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.AxisRobotImpl <em>Axis Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.AxisRobotImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getAxisRobot()
		 * @generated
		 */
		EClass AXIS_ROBOT = eINSTANCE.getAxisRobot();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_ROBOT__HOLDS = eINSTANCE.getAxisRobot_Holds();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_ROBOT__NAME = eINSTANCE.getAxisRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Mozzarella Dispenser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_ROBOT__MOZZARELLA_DISPENSER = eINSTANCE.getAxisRobot_MozzarellaDispenser();

		/**
		 * The meta object literal for the '<em><b>Cutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_ROBOT__CUTTER = eINSTANCE.getAxisRobot_Cutter();

		/**
		 * The meta object literal for the '<em><b>Sauce Dispenser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_ROBOT__SAUCE_DISPENSER = eINSTANCE.getAxisRobot_SauceDispenser();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.IngredientImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.OvenConveyorImpl <em>Oven Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.OvenConveyorImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getOvenConveyor()
		 * @generated
		 */
		EClass OVEN_CONVEYOR = eINSTANCE.getOvenConveyor();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVEN_CONVEYOR__INPUT = eINSTANCE.getOvenConveyor_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVEN_CONVEYOR__OUTPUT = eINSTANCE.getOvenConveyor_Output();

		/**
		 * The meta object literal for the '<em><b>Baking</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVEN_CONVEYOR__BAKING = eINSTANCE.getOvenConveyor_Baking();

		/**
		 * The meta object literal for the '<em><b>Wait For Pizza</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OVEN_CONVEYOR___WAIT_FOR_PIZZA = eINSTANCE.getOvenConveyor__WaitForPizza();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.ProcessImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.TableImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Things</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__THINGS = eINSTANCE.getTable_Things();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.MozzarellaImpl <em>Mozzarella</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.MozzarellaImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getMozzarella()
		 * @generated
		 */
		EClass MOZZARELLA = eINSTANCE.getMozzarella();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.TomatoSauceImpl <em>Tomato Sauce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.TomatoSauceImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getTomatoSauce()
		 * @generated
		 */
		EClass TOMATO_SAUCE = eINSTANCE.getTomatoSauce();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.PizzaCrustImpl <em>Pizza Crust</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.PizzaCrustImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getPizzaCrust()
		 * @generated
		 */
		EClass PIZZA_CRUST = eINSTANCE.getPizzaCrust();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZA_CRUST__PROCESSES = eINSTANCE.getPizzaCrust_Processes();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZA_CRUST__ORDER_ID = eINSTANCE.getPizzaCrust_OrderId();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.BoxImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.MozzarellaDispenserImpl <em>Mozzarella Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.MozzarellaDispenserImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getMozzarellaDispenser()
		 * @generated
		 */
		EClass MOZZARELLA_DISPENSER = eINSTANCE.getMozzarellaDispenser();

		/**
		 * The meta object literal for the '<em><b>Mozzarella</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOZZARELLA_DISPENSER__MOZZARELLA = eINSTANCE.getMozzarellaDispenser_Mozzarella();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.SauceDispenserImpl <em>Sauce Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.SauceDispenserImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getSauceDispenser()
		 * @generated
		 */
		EClass SAUCE_DISPENSER = eINSTANCE.getSauceDispenser();

		/**
		 * The meta object literal for the '<em><b>Tomato Sauce</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAUCE_DISPENSER__TOMATO_SAUCE = eINSTANCE.getSauceDispenser_TomatoSauce();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.Holdable <em>Holdable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.Holdable
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getHoldable()
		 * @generated
		 */
		EClass HOLDABLE = eINSTANCE.getHoldable();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.StorageImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__BOXES = eINSTANCE.getStorage_Boxes();

		/**
		 * The meta object literal for the '<em><b>Crusts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CRUSTS = eINSTANCE.getStorage_Crusts();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.BakeImpl <em>Bake</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.BakeImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getBake()
		 * @generated
		 */
		EClass BAKE = eINSTANCE.getBake();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.AddIngredientImpl <em>Add Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.AddIngredientImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getAddIngredient()
		 * @generated
		 */
		EClass ADD_INGREDIENT = eINSTANCE.getAddIngredient();

		/**
		 * The meta object literal for the '<em><b>Ingredient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_INGREDIENT__INGREDIENT = eINSTANCE.getAddIngredient_Ingredient();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.CutImpl <em>Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.CutImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getCut()
		 * @generated
		 */
		EClass CUT = eINSTANCE.getCut();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.CutterImpl <em>Cutter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.CutterImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getCutter()
		 * @generated
		 */
		EClass CUTTER = eINSTANCE.getCutter();

		/**
		 * The meta object literal for the '{@link com.remyrobotics.remytt_model.impl.NoPizzaCrustImpl <em>No Pizza Crust</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remyrobotics.remytt_model.impl.NoPizzaCrustImpl
		 * @see com.remyrobotics.remytt_model.impl.Remytt_modelPackageImpl#getNoPizzaCrust()
		 * @generated
		 */
		EClass NO_PIZZA_CRUST = eINSTANCE.getNoPizzaCrust();

	}

} //Remytt_modelPackage
