/**
 */
package figurPlotter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.Polygon#getRadius <em>Radius</em>}</li>
 *   <li>{@link figurPlotter.Polygon#getNumberOfVertices <em>Number Of Vertices</em>}</li>
 * </ul>
 *
 * @see figurPlotter.FigurPlotterPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends Figur {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see figurPlotter.FigurPlotterPackage#getPolygon_Radius()
	 * @model required="true"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link figurPlotter.Polygon#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Vertices</em>' attribute.
	 * @see #setNumberOfVertices(int)
	 * @see figurPlotter.FigurPlotterPackage#getPolygon_NumberOfVertices()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfVertices();

	/**
	 * Sets the value of the '{@link figurPlotter.Polygon#getNumberOfVertices <em>Number Of Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Vertices</em>' attribute.
	 * @see #getNumberOfVertices()
	 * @generated
	 */
	void setNumberOfVertices(int value);

} // Polygon
