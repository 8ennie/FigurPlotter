/**
 */
package figurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.Arrow#isArrowheadRight <em>Arrowhead Right</em>}</li>
 *   <li>{@link figurPlotter.Arrow#isArrowheadLeft <em>Arrowhead Left</em>}</li>
 * </ul>
 *
 * @see figurPlotter.FigurPlotterPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends Line {
	/**
	 * Returns the value of the '<em><b>Arrowhead Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowhead Right</em>' attribute.
	 * @see #setArrowheadRight(boolean)
	 * @see figurPlotter.FigurPlotterPackage#getArrow_ArrowheadRight()
	 * @model required="true"
	 * @generated
	 */
	boolean isArrowheadRight();

	/**
	 * Sets the value of the '{@link figurPlotter.Arrow#isArrowheadRight <em>Arrowhead Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrowhead Right</em>' attribute.
	 * @see #isArrowheadRight()
	 * @generated
	 */
	void setArrowheadRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Arrowhead Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowhead Left</em>' attribute.
	 * @see #setArrowheadLeft(boolean)
	 * @see figurPlotter.FigurPlotterPackage#getArrow_ArrowheadLeft()
	 * @model required="true"
	 * @generated
	 */
	boolean isArrowheadLeft();

	/**
	 * Sets the value of the '{@link figurPlotter.Arrow#isArrowheadLeft <em>Arrowhead Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrowhead Left</em>' attribute.
	 * @see #isArrowheadLeft()
	 * @generated
	 */
	void setArrowheadLeft(boolean value);

} // Arrow
