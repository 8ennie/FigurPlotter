/**
 */
package figurPlotter.impl;

import figurPlotter.Arrow;
import figurPlotter.FigurPlotterPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.impl.ArrowImpl#isArrowheadRight <em>Arrowhead Right</em>}</li>
 *   <li>{@link figurPlotter.impl.ArrowImpl#isArrowheadLeft <em>Arrowhead Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowImpl extends LineImpl implements Arrow {
	/**
	 * The default value of the '{@link #isArrowheadRight() <em>Arrowhead Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrowheadRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARROWHEAD_RIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArrowheadRight() <em>Arrowhead Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrowheadRight()
	 * @generated
	 * @ordered
	 */
	protected boolean arrowheadRight = ARROWHEAD_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isArrowheadLeft() <em>Arrowhead Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrowheadLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARROWHEAD_LEFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArrowheadLeft() <em>Arrowhead Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrowheadLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean arrowheadLeft = ARROWHEAD_LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.ARROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArrowheadRight() {
		return arrowheadRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrowheadRight(boolean newArrowheadRight) {
		boolean oldArrowheadRight = arrowheadRight;
		arrowheadRight = newArrowheadRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.ARROW__ARROWHEAD_RIGHT, oldArrowheadRight, arrowheadRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArrowheadLeft() {
		return arrowheadLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrowheadLeft(boolean newArrowheadLeft) {
		boolean oldArrowheadLeft = arrowheadLeft;
		arrowheadLeft = newArrowheadLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.ARROW__ARROWHEAD_LEFT, oldArrowheadLeft, arrowheadLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FigurPlotterPackage.ARROW__ARROWHEAD_RIGHT:
				return isArrowheadRight();
			case FigurPlotterPackage.ARROW__ARROWHEAD_LEFT:
				return isArrowheadLeft();
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
			case FigurPlotterPackage.ARROW__ARROWHEAD_RIGHT:
				setArrowheadRight((Boolean)newValue);
				return;
			case FigurPlotterPackage.ARROW__ARROWHEAD_LEFT:
				setArrowheadLeft((Boolean)newValue);
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
			case FigurPlotterPackage.ARROW__ARROWHEAD_RIGHT:
				setArrowheadRight(ARROWHEAD_RIGHT_EDEFAULT);
				return;
			case FigurPlotterPackage.ARROW__ARROWHEAD_LEFT:
				setArrowheadLeft(ARROWHEAD_LEFT_EDEFAULT);
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
			case FigurPlotterPackage.ARROW__ARROWHEAD_RIGHT:
				return arrowheadRight != ARROWHEAD_RIGHT_EDEFAULT;
			case FigurPlotterPackage.ARROW__ARROWHEAD_LEFT:
				return arrowheadLeft != ARROWHEAD_LEFT_EDEFAULT;
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
		result.append(" (arrowheadRight: ");
		result.append(arrowheadRight);
		result.append(", arrowheadLeft: ");
		result.append(arrowheadLeft);
		result.append(')');
		return result.toString();
	}

} //ArrowImpl
