/**
 */
package figurPlotter.impl;

import figurPlotter.Figur;
import figurPlotter.FigurPlotterPackage;
import figurPlotter.Plotter;

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
 * An implementation of the model object '<em><b>Plotter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.impl.PlotterImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link figurPlotter.impl.PlotterImpl#getCanvasLength <em>Canvas Length</em>}</li>
 *   <li>{@link figurPlotter.impl.PlotterImpl#getCanvasWidth <em>Canvas Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlotterImpl extends MinimalEObjectImpl.Container implements Plotter {
	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<Figur> figures;

	/**
	 * The default value of the '{@link #getCanvasLength() <em>Canvas Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvasLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CANVAS_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanvasLength() <em>Canvas Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvasLength()
	 * @generated
	 * @ordered
	 */
	protected Integer canvasLength = CANVAS_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanvasWidth() <em>Canvas Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvasWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CANVAS_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanvasWidth() <em>Canvas Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvasWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer canvasWidth = CANVAS_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlotterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.PLOTTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Figur> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentEList<Figur>(Figur.class, this, FigurPlotterPackage.PLOTTER__FIGURES);
		}
		return figures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCanvasLength() {
		return canvasLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanvasLength(Integer newCanvasLength) {
		Integer oldCanvasLength = canvasLength;
		canvasLength = newCanvasLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.PLOTTER__CANVAS_LENGTH, oldCanvasLength, canvasLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCanvasWidth() {
		return canvasWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanvasWidth(Integer newCanvasWidth) {
		Integer oldCanvasWidth = canvasWidth;
		canvasWidth = newCanvasWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.PLOTTER__CANVAS_WIDTH, oldCanvasWidth, canvasWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FigurPlotterPackage.PLOTTER__FIGURES:
				return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
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
			case FigurPlotterPackage.PLOTTER__FIGURES:
				return getFigures();
			case FigurPlotterPackage.PLOTTER__CANVAS_LENGTH:
				return getCanvasLength();
			case FigurPlotterPackage.PLOTTER__CANVAS_WIDTH:
				return getCanvasWidth();
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
			case FigurPlotterPackage.PLOTTER__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends Figur>)newValue);
				return;
			case FigurPlotterPackage.PLOTTER__CANVAS_LENGTH:
				setCanvasLength((Integer)newValue);
				return;
			case FigurPlotterPackage.PLOTTER__CANVAS_WIDTH:
				setCanvasWidth((Integer)newValue);
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
			case FigurPlotterPackage.PLOTTER__FIGURES:
				getFigures().clear();
				return;
			case FigurPlotterPackage.PLOTTER__CANVAS_LENGTH:
				setCanvasLength(CANVAS_LENGTH_EDEFAULT);
				return;
			case FigurPlotterPackage.PLOTTER__CANVAS_WIDTH:
				setCanvasWidth(CANVAS_WIDTH_EDEFAULT);
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
			case FigurPlotterPackage.PLOTTER__FIGURES:
				return figures != null && !figures.isEmpty();
			case FigurPlotterPackage.PLOTTER__CANVAS_LENGTH:
				return CANVAS_LENGTH_EDEFAULT == null ? canvasLength != null : !CANVAS_LENGTH_EDEFAULT.equals(canvasLength);
			case FigurPlotterPackage.PLOTTER__CANVAS_WIDTH:
				return CANVAS_WIDTH_EDEFAULT == null ? canvasWidth != null : !CANVAS_WIDTH_EDEFAULT.equals(canvasWidth);
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
		result.append(" (canvasLength: ");
		result.append(canvasLength);
		result.append(", canvasWidth: ");
		result.append(canvasWidth);
		result.append(')');
		return result.toString();
	}

} //PlotterImpl
