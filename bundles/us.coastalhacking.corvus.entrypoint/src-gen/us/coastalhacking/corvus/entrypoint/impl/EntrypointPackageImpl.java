/**
 */
package us.coastalhacking.corvus.entrypoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.corvus.entrypoint.EntryPoint;
import us.coastalhacking.corvus.entrypoint.EntryPointRoot;
import us.coastalhacking.corvus.entrypoint.EntrypointFactory;
import us.coastalhacking.corvus.entrypoint.EntrypointPackage;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntrypointPackageImpl extends EPackageImpl implements EntrypointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

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
	 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntrypointPackageImpl() {
		super(eNS_URI, EntrypointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EntrypointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntrypointPackage init() {
		if (isInited) return (EntrypointPackage)EPackage.Registry.INSTANCE.getEPackage(EntrypointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEntrypointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EntrypointPackageImpl theEntrypointPackage = registeredEntrypointPackage instanceof EntrypointPackageImpl ? (EntrypointPackageImpl)registeredEntrypointPackage : new EntrypointPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SemioticsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEntrypointPackage.createPackageContents();

		// Initialize created meta-data
		theEntrypointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntrypointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntrypointPackage.eNS_URI, theEntrypointPackage);
		return theEntrypointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointRoot() {
		return entryPointRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointRoot_EntryPoints() {
		return (EReference)entryPointRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_Group() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrypointFactory getEntrypointFactory() {
		return (EntrypointFactory)getEFactoryInstance();
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
		entryPointRootEClass = createEClass(ENTRY_POINT_ROOT);
		createEReference(entryPointRootEClass, ENTRY_POINT_ROOT__ENTRY_POINTS);

		entryPointEClass = createEClass(ENTRY_POINT);
		createEReference(entryPointEClass, ENTRY_POINT__GROUP);
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

		// Obtain other dependent packages
		SemioticsPackage theSemioticsPackage = (SemioticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemioticsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entryPointEClass.getESuperTypes().add(theSemioticsPackage.getSemiotics());

		// Initialize classes, features, and operations; add parameters
		initEClass(entryPointRootEClass, EntryPointRoot.class, "EntryPointRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPointRoot_EntryPoints(), this.getEntryPoint(), this.getEntryPoint_Group(), "entryPoints", null, 0, -1, EntryPointRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPoint_Group(), this.getEntryPointRoot(), this.getEntryPointRoot_EntryPoints(), "group", null, 0, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EntrypointPackageImpl
