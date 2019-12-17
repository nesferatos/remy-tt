/**
 */
package com.remyrobotics.remytt_model.provider;

import com.remyrobotics.remytt_model.Kitchen;
import com.remyrobotics.remytt_model.Remytt_modelFactory;
import com.remyrobotics.remytt_model.Remytt_modelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.remyrobotics.remytt_model.Kitchen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KitchenItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addStoragePropertyDescriptor(object);
			addOvenConveyorsPropertyDescriptor(object);
			addGiverRobotsPropertyDescriptor(object);
			addTakerRobotsPropertyDescriptor(object);
			addWorkTablePropertyDescriptor(object);
			addWaitTablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_name_feature", "_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoragePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_storage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_storage_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__STORAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Oven Conveyors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOvenConveyorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_ovenConveyors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_ovenConveyors_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__OVEN_CONVEYORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Giver Robots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGiverRobotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_giverRobots_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_giverRobots_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__GIVER_ROBOTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Taker Robots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTakerRobotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_takerRobots_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_takerRobots_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__TAKER_ROBOTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Work Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_workTable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_workTable_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__WORK_TABLE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Wait Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Kitchen_waitTable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Kitchen_waitTable_feature",
								"_UI_Kitchen_type"),
						Remytt_modelPackage.Literals.KITCHEN__WAIT_TABLE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__STORAGE);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__OVEN_CONVEYORS);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__GIVER_ROBOTS);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__TAKER_ROBOTS);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__WORK_TABLE);
			childrenFeatures.add(Remytt_modelPackage.Literals.KITCHEN__WAIT_TABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Kitchen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Kitchen"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Kitchen) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Kitchen_type")
				: getString("_UI_Kitchen_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Kitchen.class)) {
		case Remytt_modelPackage.KITCHEN__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Remytt_modelPackage.KITCHEN__STORAGE:
		case Remytt_modelPackage.KITCHEN__OVEN_CONVEYORS:
		case Remytt_modelPackage.KITCHEN__GIVER_ROBOTS:
		case Remytt_modelPackage.KITCHEN__TAKER_ROBOTS:
		case Remytt_modelPackage.KITCHEN__WORK_TABLE:
		case Remytt_modelPackage.KITCHEN__WAIT_TABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__STORAGE,
				Remytt_modelFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__OVEN_CONVEYORS,
				Remytt_modelFactory.eINSTANCE.createOvenConveyor()));

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__GIVER_ROBOTS,
				Remytt_modelFactory.eINSTANCE.createAxisRobot()));

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__TAKER_ROBOTS,
				Remytt_modelFactory.eINSTANCE.createAxisRobot()));

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__WORK_TABLE,
				Remytt_modelFactory.eINSTANCE.createTable()));

		newChildDescriptors.add(createChildParameter(Remytt_modelPackage.Literals.KITCHEN__WAIT_TABLE,
				Remytt_modelFactory.eINSTANCE.createTable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == Remytt_modelPackage.Literals.KITCHEN__GIVER_ROBOTS
				|| childFeature == Remytt_modelPackage.Literals.KITCHEN__TAKER_ROBOTS
				|| childFeature == Remytt_modelPackage.Literals.KITCHEN__WORK_TABLE
				|| childFeature == Remytt_modelPackage.Literals.KITCHEN__WAIT_TABLE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Remytt_modelEditPlugin.INSTANCE;
	}

}
