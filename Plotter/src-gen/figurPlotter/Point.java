/**
 */
package figurPlotter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.Point#getXPos <em>XPos</em>}</li>
 *   <li>{@link figurPlotter.Point#getYPos <em>YPos</em>}</li>
 * </ul>
 *
 * @see figurPlotter.FigurPlotterPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(double)
	 * @see figurPlotter.FigurPlotterPackage#getPoint_XPos()
	 * @model required="true"
	 * @generated
	 */
	double getXPos();

	/**
	 * Sets the value of the '{@link figurPlotter.Point#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(double value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(double)
	 * @see figurPlotter.FigurPlotterPackage#getPoint_YPos()
	 * @model required="true"
	 * @generated
	 */
	double getYPos();

	/**
	 * Sets the value of the '{@link figurPlotter.Point#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(double value);

} // Point
