/**
 */
package figurPlotter.impl;

import figurPlotter.FigurPlotterPackage;
import figurPlotter.Square;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.impl.SquareImpl#getSizeA <em>Size A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends FigurImpl implements Square {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.SQUARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.SQUARE__SIZE_A, oldSizeA, sizeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FigurPlotterPackage.SQUARE__SIZE_A:
				return getSizeA();
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
			case FigurPlotterPackage.SQUARE__SIZE_A:
				setSizeA((Double)newValue);
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
			case FigurPlotterPackage.SQUARE__SIZE_A:
				setSizeA(SIZE_A_EDEFAULT);
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
			case FigurPlotterPackage.SQUARE__SIZE_A:
				return sizeA != SIZE_A_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //SquareImpl
