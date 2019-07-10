/**
 */
package figurPlotter.impl;

import figurPlotter.Arrow;
import figurPlotter.Circle;
import figurPlotter.Figur;
import figurPlotter.FigurPlotterFactory;
import figurPlotter.FigurPlotterPackage;
import figurPlotter.Line;
import figurPlotter.Plotter;
import figurPlotter.Point;
import figurPlotter.Polygon;
import figurPlotter.Rectangle;
import figurPlotter.Square;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FigurPlotterPackageImpl extends EPackageImpl implements FigurPlotterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see figurPlotter.FigurPlotterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FigurPlotterPackageImpl() {
		super(eNS_URI, FigurPlotterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FigurPlotterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FigurPlotterPackage init() {
		if (isInited) return (FigurPlotterPackage)EPackage.Registry.INSTANCE.getEPackage(FigurPlotterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFigurPlotterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FigurPlotterPackageImpl theFigurPlotterPackage = registeredFigurPlotterPackage instanceof FigurPlotterPackageImpl ? (FigurPlotterPackageImpl)registeredFigurPlotterPackage : new FigurPlotterPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFigurPlotterPackage.createPackageContents();

		// Initialize created meta-data
		theFigurPlotterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFigurPlotterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FigurPlotterPackage.eNS_URI, theFigurPlotterPackage);
		return theFigurPlotterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlotter() {
		return plotterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlotter_Figures() {
		return (EReference)plotterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlotter_CanvasLength() {
		return (EAttribute)plotterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlotter_CanvasWidth() {
		return (EAttribute)plotterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_XPos() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_YPos() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFigur() {
		return figurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_Name() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_Color() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_Filled() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_StrokeWeight() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_Degree() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFigur_Center() {
		return (EReference)figurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFigur_Figures() {
		return (EReference)figurEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigur_DisplayName() {
		return (EAttribute)figurEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLine_Lenght() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrow() {
		return arrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrow_ArrowheadRight() {
		return (EAttribute)arrowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrow_ArrowheadLeft() {
		return (EAttribute)arrowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangle_SizeA() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangle_SizeB() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircle_Radius() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSquare_SizeA() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygon_Radius() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygon_NumberOfVertices() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigurPlotterFactory getFigurPlotterFactory() {
		return (FigurPlotterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		plotterEClass = createEClass(PLOTTER);
		createEReference(plotterEClass, PLOTTER__FIGURES);
		createEAttribute(plotterEClass, PLOTTER__CANVAS_LENGTH);
		createEAttribute(plotterEClass, PLOTTER__CANVAS_WIDTH);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__XPOS);
		createEAttribute(pointEClass, POINT__YPOS);

		figurEClass = createEClass(FIGUR);
		createEAttribute(figurEClass, FIGUR__NAME);
		createEAttribute(figurEClass, FIGUR__COLOR);
		createEAttribute(figurEClass, FIGUR__FILLED);
		createEAttribute(figurEClass, FIGUR__STROKE_WEIGHT);
		createEAttribute(figurEClass, FIGUR__DEGREE);
		createEReference(figurEClass, FIGUR__CENTER);
		createEReference(figurEClass, FIGUR__FIGURES);
		createEAttribute(figurEClass, FIGUR__DISPLAY_NAME);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__LENGHT);

		arrowEClass = createEClass(ARROW);
		createEAttribute(arrowEClass, ARROW__ARROWHEAD_RIGHT);
		createEAttribute(arrowEClass, ARROW__ARROWHEAD_LEFT);

		rectangleEClass = createEClass(RECTANGLE);
		createEAttribute(rectangleEClass, RECTANGLE__SIZE_A);
		createEAttribute(rectangleEClass, RECTANGLE__SIZE_B);

		circleEClass = createEClass(CIRCLE);
		createEAttribute(circleEClass, CIRCLE__RADIUS);

		squareEClass = createEClass(SQUARE);
		createEAttribute(squareEClass, SQUARE__SIZE_A);

		polygonEClass = createEClass(POLYGON);
		createEAttribute(polygonEClass, POLYGON__RADIUS);
		createEAttribute(polygonEClass, POLYGON__NUMBER_OF_VERTICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lineEClass.getESuperTypes().add(this.getFigur());
		arrowEClass.getESuperTypes().add(this.getLine());
		rectangleEClass.getESuperTypes().add(this.getFigur());
		circleEClass.getESuperTypes().add(this.getFigur());
		squareEClass.getESuperTypes().add(this.getFigur());
		polygonEClass.getESuperTypes().add(this.getFigur());

		// Initialize classes, features, and operations; add parameters
		initEClass(plotterEClass, Plotter.class, "Plotter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlotter_Figures(), this.getFigur(), null, "figures", null, 0, -1, Plotter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotter_CanvasLength(), ecorePackage.getEIntegerObject(), "canvasLength", null, 1, 1, Plotter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotter_CanvasWidth(), ecorePackage.getEIntegerObject(), "canvasWidth", null, 1, 1, Plotter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_XPos(), ecorePackage.getEDouble(), "xPos", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_YPos(), ecorePackage.getEDouble(), "yPos", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figurEClass, Figur.class, "Figur", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigur_Name(), ecorePackage.getEString(), "name", null, 1, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigur_Color(), ecorePackage.getEString(), "color", "FF00cc2c", 0, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigur_Filled(), ecorePackage.getEBoolean(), "filled", null, 0, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigur_StrokeWeight(), ecorePackage.getEInt(), "strokeWeight", "1", 0, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigur_Degree(), ecorePackage.getEInt(), "degree", null, 0, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigur_Center(), this.getPoint(), null, "center", null, 1, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigur_Figures(), this.getFigur(), null, "figures", null, 0, -1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigur_DisplayName(), ecorePackage.getEBoolean(), "displayName", "false", 1, 1, Figur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Lenght(), ecorePackage.getEDouble(), "lenght", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrowEClass, Arrow.class, "Arrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrow_ArrowheadRight(), ecorePackage.getEBoolean(), "arrowheadRight", null, 1, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrow_ArrowheadLeft(), ecorePackage.getEBoolean(), "arrowheadLeft", null, 1, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangle_SizeA(), ecorePackage.getEDouble(), "sizeA", null, 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_SizeB(), ecorePackage.getEDouble(), "sizeB", null, 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircle_Radius(), ecorePackage.getEDouble(), "radius", null, 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquare_SizeA(), ecorePackage.getEDouble(), "sizeA", null, 1, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygon_Radius(), ecorePackage.getEDouble(), "radius", null, 1, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolygon_NumberOfVertices(), ecorePackage.getEInt(), "numberOfVertices", null, 1, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FigurPlotterPackageImpl
