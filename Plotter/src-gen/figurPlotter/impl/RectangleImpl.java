/**
 */
package figurPlotter.impl;

import figurPlotter.FigurPlotterPackage;
import figurPlotter.Rectangle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.impl.RectangleImpl#getSizeA <em>Size A</em>}</li>
 *   <li>{@link figurPlotter.impl.RectangleImpl#getSizeB <em>Size B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleImpl extends FigurImpl implements Rectangle {
	/**
	 * The default value of the '{@link #getSizeA() <em>Size A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeA()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeA() <em>Size A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeA()
	 * @generated
	 * @ordered
	 */
	protected double sizeA = SIZE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeB() <em>Size B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeB()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeB() <em>Size B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeB()
	 * @generated
	 * @ordered
	 */
	protected double sizeB = SIZE_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSizeA() {
		return sizeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeA(double newSizeA) {
		double oldSizeA = sizeA;
		sizeA = newSizeA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.RECTANGLE__SIZE_A, oldSizeA, sizeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSizeB() {
		return sizeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeB(double newSizeB) {
		double oldSizeB = sizeB;
		sizeB = newSizeB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.RECTANGLE__SIZE_B, oldSizeB, sizeB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FigurPlotterPackage.RECTANGLE__SIZE_A:
				return getSizeA();
			case FigurPlotterPackage.RECTANGLE__SIZE_B:
				return getSizeB();
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
			case FigurPlotterPackage.RECTANGLE__SIZE_A:
				setSizeA((Double)newValue);
				return;
			case FigurPlotterPackage.RECTANGLE__SIZE_B:
				setSizeB((Double)newValue);
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
			case FigurPlotterPackage.RECTANGLE__SIZE_A:
				setSizeA(SIZE_A_EDEFAULT);
				return;
			case FigurPlotterPackage.RECTANGLE__SIZE_B:
				setSizeB(SIZE_B_EDEFAULT);
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
			case FigurPlotterPackage.RECTANGLE__SIZE_A:
				return sizeA != SIZE_A_EDEFAULT;
			case FigurPlotterPackage.RECTANGLE__SIZE_B:
				return sizeB != SIZE_B_EDEFAULT;
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
		result.append(" (sizeA: ");
		result.append(sizeA);
		result.append(", sizeB: ");
		result.append(sizeB);
		result.append(')');
		return result.toString();
	}

} //RectangleImpl
