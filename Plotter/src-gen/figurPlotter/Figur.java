/**
 */
package figurPlotter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link figurPlotter.Figur#getName <em>Name</em>}</li>
 *   <li>{@link figurPlotter.Figur#getColor <em>Color</em>}</li>
 *   <li>{@link figurPlotter.Figur#isFilled <em>Filled</em>}</li>
 *   <li>{@link figurPlotter.Figur#getStrokeWeight <em>Stroke Weight</em>}</li>
 *   <li>{@link figurPlotter.Figur#getDegree <em>Degree</em>}</li>
 *   <li>{@link figurPlotter.Figur#getCenter <em>Center</em>}</li>
 *   <li>{@link figurPlotter.Figur#getFigures <em>Figures</em>}</li>
 *   <li>{@link figurPlotter.Figur#isDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see figurPlotter.FigurPlotterPackage#getFigur()
 * @model abstract="true"
 * @generated
 */
public interface Figur extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"FF00cc2c"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Color()
	 * @model default="FF00cc2c"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filled</em>' attribute.
	 * @see #setFilled(boolean)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Filled()
	 * @model
	 * @generated
	 */
	boolean isFilled();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#isFilled <em>Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filled</em>' attribute.
	 * @see #isFilled()
	 * @generated
	 */
	void setFilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Stroke Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Weight</em>' attribute.
	 * @see #setStrokeWeight(int)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_StrokeWeight()
	 * @model default="1"
	 * @generated
	 */
	int getStrokeWeight();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#getStrokeWeight <em>Stroke Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Weight</em>' attribute.
	 * @see #getStrokeWeight()
	 * @generated
	 */
	void setStrokeWeight(int value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(int)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Degree()
	 * @model
	 * @generated
	 */
	int getDegree();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(int value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(Point)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Center()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link figurPlotter.Figur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see figurPlotter.FigurPlotterPackage#getFigur_Figures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Figur> getFigures();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(boolean)
	 * @see figurPlotter.FigurPlotterPackage#getFigur_DisplayName()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDisplayName();

	/**
	 * Sets the value of the '{@link figurPlotter.Figur#isDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #isDisplayName()
	 * @generated
	 */
	void setDisplayName(boolean value);

} // Figur
