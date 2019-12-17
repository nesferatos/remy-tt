/**
 */
package com.remyrobotics.remytt_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.remyrobotics.remytt_model.Remytt_modelPackage
 * @generated
 */
public interface Remytt_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Remytt_modelFactory eINSTANCE = com.remyrobotics.remytt_model.impl.Remytt_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen</em>'.
	 * @generated
	 */
	Kitchen createKitchen();

	/**
	 * Returns a new object of class '<em>Axis Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axis Robot</em>'.
	 * @generated
	 */
	AxisRobot createAxisRobot();

	/**
	 * Returns a new object of class '<em>Oven Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oven Conveyor</em>'.
	 * @generated
	 */
	OvenConveyor createOvenConveyor();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Mozzarella</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mozzarella</em>'.
	 * @generated
	 */
	Mozzarella createMozzarella();

	/**
	 * Returns a new object of class '<em>Tomato Sauce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tomato Sauce</em>'.
	 * @generated
	 */
	TomatoSauce createTomatoSauce();

	/**
	 * Returns a new object of class '<em>Pizza Crust</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizza Crust</em>'.
	 * @generated
	 */
	PizzaCrust createPizzaCrust();

	/**
	 * Returns a new object of class '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box</em>'.
	 * @generated
	 */
	Box createBox();

	/**
	 * Returns a new object of class '<em>Mozzarella Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mozzarella Dispenser</em>'.
	 * @generated
	 */
	MozzarellaDispenser createMozzarellaDispenser();

	/**
	 * Returns a new object of class '<em>Sauce Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sauce Dispenser</em>'.
	 * @generated
	 */
	SauceDispenser createSauceDispenser();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Bake</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bake</em>'.
	 * @generated
	 */
	Bake createBake();

	/**
	 * Returns a new object of class '<em>Add Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Ingredient</em>'.
	 * @generated
	 */
	AddIngredient createAddIngredient();

	/**
	 * Returns a new object of class '<em>Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cut</em>'.
	 * @generated
	 */
	Cut createCut();

	/**
	 * Returns a new object of class '<em>Cutter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cutter</em>'.
	 * @generated
	 */
	Cutter createCutter();

	/**
	 * Returns a new object of class '<em>No Pizza Crust</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Pizza Crust</em>'.
	 * @generated
	 */
	NoPizzaCrust createNoPizzaCrust();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Remytt_modelPackage getRemytt_modelPackage();

} //Remytt_modelFactory
