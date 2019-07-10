/**
 */
package figurPlotter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see figurPlotter.FigurPlotterFactory
 * @model kind="package"
 * @generated
 */
public interface FigurPlotterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "figurPlotter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/figurplotter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "figurplotter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FigurPlotterPackage eINSTANCE = figurPlotter.impl.FigurPlotterPackageImpl.init();

	/**
	 * The meta object id for the '{@link figurPlotter.impl.PlotterImpl <em>Plotter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.PlotterImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPlotter()
	 * @generated
	 */
	int PLOTTER = 0;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTTER__FIGURES = 0;

	/**
	 * The feature id for the '<em><b>Canvas Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTTER__CANVAS_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Canvas Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTTER__CANVAS_WIDTH = 2;

	/**
	 * The number of structural features of the '<em>Plotter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plotter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.PointImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XPOS = 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YPOS = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.FigurImpl <em>Figur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.FigurImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getFigur()
	 * @generated
	 */
	int FIGUR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__FILLED = 2;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__STROKE_WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__DEGREE = 4;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__CENTER = 5;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__FIGURES = 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR__DISPLAY_NAME = 7;

	/**
	 * The number of structural features of the '<em>Figur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Figur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.LineImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = FIGUR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__COLOR = FIGUR__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FILLED = FIGUR__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_WEIGHT = FIGUR__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DEGREE = FIGUR__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CENTER = FIGUR__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FIGURES = FIGUR__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DISPLAY_NAME = FIGUR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LENGHT = FIGUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = FIGUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = FIGUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.ArrowImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NAME = LINE__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__COLOR = LINE__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FILLED = LINE__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__STROKE_WEIGHT = LINE__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__DEGREE = LINE__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__CENTER = LINE__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FIGURES = LINE__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__DISPLAY_NAME = LINE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LENGHT = LINE__LENGHT;

	/**
	 * The feature id for the '<em><b>Arrowhead Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__ARROWHEAD_RIGHT = LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrowhead Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__ARROWHEAD_LEFT = LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_OPERATION_COUNT = LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.RectangleImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = FIGUR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = FIGUR__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FILLED = FIGUR__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STROKE_WEIGHT = FIGUR__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DEGREE = FIGUR__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CENTER = FIGUR__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FIGURES = FIGUR__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DISPLAY_NAME = FIGUR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Size A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE_A = FIGUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE_B = FIGUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = FIGUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = FIGUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.CircleImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = FIGUR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__COLOR = FIGUR__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FILLED = FIGUR__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_WEIGHT = FIGUR__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DEGREE = FIGUR__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CENTER = FIGUR__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FIGURES = FIGUR__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DISPLAY_NAME = FIGUR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = FIGUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = FIGUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = FIGUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.SquareImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = FIGUR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLOR = FIGUR__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FILLED = FIGUR__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__STROKE_WEIGHT = FIGUR__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__DEGREE = FIGUR__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__CENTER = FIGUR__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FIGURES = FIGUR__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__DISPLAY_NAME = FIGUR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Size A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SIZE_A = FIGUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = FIGUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = FIGUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link figurPlotter.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see figurPlotter.impl.PolygonImpl
	 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__NAME = FIGUR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__COLOR = FIGUR__COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILLED = FIGUR__FILLED;

	/**
	 * The feature id for the '<em><b>Stroke Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_WEIGHT = FIGUR__STROKE_WEIGHT;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__DEGREE = FIGUR__DEGREE;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CENTER = FIGUR__CENTER;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FIGURES = FIGUR__FIGURES;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__DISPLAY_NAME = FIGUR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__RADIUS = FIGUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__NUMBER_OF_VERTICES = FIGUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = FIGUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = FIGUR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link figurPlotter.Plotter <em>Plotter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plotter</em>'.
	 * @see figurPlotter.Plotter
	 * @generated
	 */
	EClass getPlotter();

	/**
	 * Returns the meta object for the containment reference list '{@link figurPlotter.Plotter#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see figurPlotter.Plotter#getFigures()
	 * @see #getPlotter()
	 * @generated
	 */
	EReference getPlotter_Figures();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Plotter#getCanvasLength <em>Canvas Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canvas Length</em>'.
	 * @see figurPlotter.Plotter#getCanvasLength()
	 * @see #getPlotter()
	 * @generated
	 */
	EAttribute getPlotter_CanvasLength();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Plotter#getCanvasWidth <em>Canvas Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canvas Width</em>'.
	 * @see figurPlotter.Plotter#getCanvasWidth()
	 * @see #getPlotter()
	 * @generated
	 */
	EAttribute getPlotter_CanvasWidth();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see figurPlotter.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Point#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see figurPlotter.Point#getXPos()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_XPos();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Point#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see figurPlotter.Point#getYPos()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_YPos();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Figur <em>Figur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figur</em>'.
	 * @see figurPlotter.Figur
	 * @generated
	 */
	EClass getFigur();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see figurPlotter.Figur#getName()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_Name();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see figurPlotter.Figur#getColor()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_Color();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#isFilled <em>Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filled</em>'.
	 * @see figurPlotter.Figur#isFilled()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_Filled();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#getStrokeWeight <em>Stroke Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Weight</em>'.
	 * @see figurPlotter.Figur#getStrokeWeight()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_StrokeWeight();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see figurPlotter.Figur#getDegree()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link figurPlotter.Figur#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see figurPlotter.Figur#getCenter()
	 * @see #getFigur()
	 * @generated
	 */
	EReference getFigur_Center();

	/**
	 * Returns the meta object for the containment reference list '{@link figurPlotter.Figur#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see figurPlotter.Figur#getFigures()
	 * @see #getFigur()
	 * @generated
	 */
	EReference getFigur_Figures();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Figur#isDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see figurPlotter.Figur#isDisplayName()
	 * @see #getFigur()
	 * @generated
	 */
	EAttribute getFigur_DisplayName();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see figurPlotter.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Line#getLenght <em>Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenght</em>'.
	 * @see figurPlotter.Line#getLenght()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Lenght();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see figurPlotter.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Arrow#isArrowheadRight <em>Arrowhead Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrowhead Right</em>'.
	 * @see figurPlotter.Arrow#isArrowheadRight()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_ArrowheadRight();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Arrow#isArrowheadLeft <em>Arrowhead Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrowhead Left</em>'.
	 * @see figurPlotter.Arrow#isArrowheadLeft()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_ArrowheadLeft();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see figurPlotter.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Rectangle#getSizeA <em>Size A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size A</em>'.
	 * @see figurPlotter.Rectangle#getSizeA()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_SizeA();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Rectangle#getSizeB <em>Size B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size B</em>'.
	 * @see figurPlotter.Rectangle#getSizeB()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_SizeB();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see figurPlotter.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see figurPlotter.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see figurPlotter.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Square#getSizeA <em>Size A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size A</em>'.
	 * @see figurPlotter.Square#getSizeA()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_SizeA();

	/**
	 * Returns the meta object for class '{@link figurPlotter.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see figurPlotter.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Polygon#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see figurPlotter.Polygon#getRadius()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Radius();

	/**
	 * Returns the meta object for the attribute '{@link figurPlotter.Polygon#getNumberOfVertices <em>Number Of Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Vertices</em>'.
	 * @see figurPlotter.Polygon#getNumberOfVertices()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_NumberOfVertices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FigurPlotterFactory getFigurPlotterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link figurPlotter.impl.PlotterImpl <em>Plotter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.PlotterImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPlotter()
		 * @generated
		 */
		EClass PLOTTER = eINSTANCE.getPlotter();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOTTER__FIGURES = eINSTANCE.getPlotter_Figures();

		/**
		 * The meta object literal for the '<em><b>Canvas Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOTTER__CANVAS_LENGTH = eINSTANCE.getPlotter_CanvasLength();

		/**
		 * The meta object literal for the '<em><b>Canvas Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOTTER__CANVAS_WIDTH = eINSTANCE.getPlotter_CanvasWidth();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.PointImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__XPOS = eINSTANCE.getPoint_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__YPOS = eINSTANCE.getPoint_YPos();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.FigurImpl <em>Figur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.FigurImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getFigur()
		 * @generated
		 */
		EClass FIGUR = eINSTANCE.getFigur();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__NAME = eINSTANCE.getFigur_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__COLOR = eINSTANCE.getFigur_Color();

		/**
		 * The meta object literal for the '<em><b>Filled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__FILLED = eINSTANCE.getFigur_Filled();

		/**
		 * The meta object literal for the '<em><b>Stroke Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__STROKE_WEIGHT = eINSTANCE.getFigur_StrokeWeight();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__DEGREE = eINSTANCE.getFigur_Degree();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGUR__CENTER = eINSTANCE.getFigur_Center();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGUR__FIGURES = eINSTANCE.getFigur_Figures();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGUR__DISPLAY_NAME = eINSTANCE.getFigur_DisplayName();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.LineImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LENGHT = eINSTANCE.getLine_Lenght();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.ArrowImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Arrowhead Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__ARROWHEAD_RIGHT = eINSTANCE.getArrow_ArrowheadRight();

		/**
		 * The meta object literal for the '<em><b>Arrowhead Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__ARROWHEAD_LEFT = eINSTANCE.getArrow_ArrowheadLeft();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.RectangleImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Size A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__SIZE_A = eINSTANCE.getRectangle_SizeA();

		/**
		 * The meta object literal for the '<em><b>Size B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__SIZE_B = eINSTANCE.getRectangle_SizeB();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.CircleImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.SquareImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Size A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__SIZE_A = eINSTANCE.getSquare_SizeA();

		/**
		 * The meta object literal for the '{@link figurPlotter.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see figurPlotter.impl.PolygonImpl
		 * @see figurPlotter.impl.FigurPlotterPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__RADIUS = eINSTANCE.getPolygon_Radius();

		/**
		 * The meta object literal for the '<em><b>Number Of Vertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__NUMBER_OF_VERTICES = eINSTANCE.getPolygon_NumberOfVertices();

	}

} //FigurPlotterPackage
