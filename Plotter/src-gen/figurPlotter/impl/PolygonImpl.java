/**
 */
package figurPlotter.impl;

import figurPlotter.FigurPlotterPackage;
import figurPlotter.Polygon;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.impl.PolygonImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link figurPlotter.impl.PolygonImpl#getNumberOfVertices <em>Number Of Vertices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonImpl extends FigurImpl implements Polygon {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfVertices() <em>Number Of Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVertices()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_VERTICES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfVertices() <em>Number Of Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVertices()
	 * @generated
	 * @ordered
	 */
	protected int numberOfVertices = NUMBER_OF_VERTICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.POLYGON__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfVertices(int newNumberOfVertices) {
		int oldNumberOfVertices = numberOfVertices;
		numberOfVertices = newNumberOfVertices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.POLYGON__NUMBER_OF_VERTICES, oldNumberOfVertices, numberOfVertices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FigurPlotterPackage.POLYGON__RADIUS:
				return getRadius();
			case FigurPlotterPackage.POLYGON__NUMBER_OF_VERTICES:
				return getNumberOfVertices();
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
			case FigurPlotterPackage.POLYGON__RADIUS:
				setRadius((Double)newValue);
				return;
			case FigurPlotterPackage.POLYGON__NUMBER_OF_VERTICES:
				setNumberOfVertices((Integer)newValue);
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
			case FigurPlotterPackage.POLYGON__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case FigurPlotterPackage.POLYGON__NUMBER_OF_VERTICES:
				setNumberOfVertices(NUMBER_OF_VERTICES_EDEFAULT);
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
			case FigurPlotterPackage.POLYGON__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case FigurPlotterPackage.POLYGON__NUMBER_OF_VERTICES:
				return numberOfVertices != NUMBER_OF_VERTICES_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (radius: ");
		result.append(radius);
		result.append(", numberOfVertices: ");
		result.append(numberOfVertices);
		result.append(')');
		return result.toString();
	}

} //PolygonImpl
