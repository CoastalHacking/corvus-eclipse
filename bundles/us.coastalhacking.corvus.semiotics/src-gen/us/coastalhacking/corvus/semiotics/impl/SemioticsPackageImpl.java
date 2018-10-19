/**
 */
package us.coastalhacking.corvus.semiotics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.corvus.semiotics.Semiotics;
import us.coastalhacking.corvus.semiotics.SemioticsFactory;
import us.coastalhacking.corvus.semiotics.SemioticsPackage;
import us.coastalhacking.corvus.semiotics.Signified;
import us.coastalhacking.corvus.semiotics.Signifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemioticsPackageImpl extends EPackageImpl implements SemioticsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semioticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signifiedEClass = null;

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
	 * @see us.coastalhacking.corvus.semiotics.SemioticsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemioticsPackageImpl() {
		super(eNS_URI, SemioticsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SemioticsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemioticsPackage init() {
		if (isInited) return (SemioticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemioticsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemioticsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemioticsPackageImpl theSemioticsPackage = registeredSemioticsPackage instanceof SemioticsPackageImpl ? (SemioticsPackageImpl)registeredSemioticsPackage : new SemioticsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSemioticsPackage.createPackageContents();

		// Initialize created meta-data
		theSemioticsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemioticsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemioticsPackage.eNS_URI, theSemioticsPackage);
		return theSemioticsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemiotics() {
		return semioticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignifier() {
		return signifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignifier_Signifieds() {
		return (EReference)signifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignified() {
		return signifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignified_Signifiers() {
		return (EReference)signifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemioticsFactory getSemioticsFactory() {
		return (SemioticsFactory)getEFactoryInstance();
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
		semioticsEClass = createEClass(SEMIOTICS);

		signifierEClass = createEClass(SIGNIFIER);
		createEReference(signifierEClass, SIGNIFIER__SIGNIFIEDS);

		signifiedEClass = createEClass(SIGNIFIED);
		createEReference(signifiedEClass, SIGNIFIED__SIGNIFIERS);
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
		semioticsEClass.getESuperTypes().add(this.getSignifier());
		semioticsEClass.getESuperTypes().add(this.getSignified());

		// Initialize classes, features, and operations; add parameters
		initEClass(semioticsEClass, Semiotics.class, "Semiotics", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signifierEClass, Signifier.class, "Signifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignifier_Signifieds(), this.getSignified(), this.getSignified_Signifiers(), "signifieds", null, 0, -1, Signifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signifiedEClass, Signified.class, "Signified", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignified_Signifiers(), this.getSignifier(), this.getSignifier_Signifieds(), "signifiers", null, 0, -1, Signified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SemioticsPackageImpl
