/**
 */
package figurPlotter.provider;


import figurPlotter.Figur;
import figurPlotter.FigurPlotterFactory;
import figurPlotter.FigurPlotterPackage;

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
 * This is the item provider adapter for a {@link figurPlotter.Figur} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FigurItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigurItemProvider(AdapterFactory adapterFactory) {
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
			addColorPropertyDescriptor(object);
			addFilledPropertyDescriptor(object);
			addStrokeWeightPropertyDescriptor(object);
			addDegreePropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_name_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_color_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_filled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_filled_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__FILLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_strokeWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_strokeWeight_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__STROKE_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Degree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDegreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_degree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_degree_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__DEGREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figur_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figur_displayName_feature", "_UI_Figur_type"),
				 FigurPlotterPackage.Literals.FIGUR__DISPLAY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FigurPlotterPackage.Literals.FIGUR__CENTER);
			childrenFeatures.add(FigurPlotterPackage.Literals.FIGUR__FIGURES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Figur)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Figur_type") :
			getString("_UI_Figur_type") + " " + label;
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

		switch (notification.getFeatureID(Figur.class)) {
			case FigurPlotterPackage.FIGUR__NAME:
			case FigurPlotterPackage.FIGUR__COLOR:
			case FigurPlotterPackage.FIGUR__FILLED:
			case FigurPlotterPackage.FIGUR__STROKE_WEIGHT:
			case FigurPlotterPackage.FIGUR__DEGREE:
			case FigurPlotterPackage.FIGUR__DISPLAY_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FigurPlotterPackage.FIGUR__CENTER:
			case FigurPlotterPackage.FIGUR__FIGURES:
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

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__CENTER,
				 FigurPlotterFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createArrow()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createCircle()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createSquare()));

		newChildDescriptors.add
			(createChildParameter
				(FigurPlotterPackage.Literals.FIGUR__FIGURES,
				 FigurPlotterFactory.eINSTANCE.createPolygon()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlotterEditPlugin.INSTANCE;
	}

}
