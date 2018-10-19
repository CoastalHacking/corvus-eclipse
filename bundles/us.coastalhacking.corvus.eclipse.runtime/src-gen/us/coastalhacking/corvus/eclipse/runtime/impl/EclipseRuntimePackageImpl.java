/**
 */
package us.coastalhacking.corvus.eclipse.runtime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimeFactory;
import us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimePackage;
import us.coastalhacking.corvus.eclipse.runtime.IPath;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseRuntimePackageImpl extends EPackageImpl implements EclipseRuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPathEClass = null;

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
	 * @see us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EclipseRuntimePackageImpl() {
		super(eNS_URI, EclipseRuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EclipseRuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EclipseRuntimePackage init() {
		if (isInited) return (EclipseRuntimePackage)EPackage.Registry.INSTANCE.getEPackage(EclipseRuntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEclipseRuntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EclipseRuntimePackageImpl theEclipseRuntimePackage = registeredEclipseRuntimePackage instanceof EclipseRuntimePackageImpl ? (EclipseRuntimePackageImpl)registeredEclipseRuntimePackage : new EclipseRuntimePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SemioticsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEclipseRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theEclipseRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclipseRuntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EclipseRuntimePackage.eNS_URI, theEclipseRuntimePackage);
		return theEclipseRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPath() {
		return iPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPath_Portable() {
		return (EAttribute)iPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseRuntimeFactory getEclipseRuntimeFactory() {
		return (EclipseRuntimeFactory)getEFactoryInstance();
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
		iPathEClass = createEClass(IPATH);
		createEAttribute(iPathEClass, IPATH__PORTABLE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iPathEClass.getESuperTypes().add(theSemioticsPackage.getSemiotics());

		// Initialize classes, features, and operations; add parameters
		initEClass(iPathEClass, IPath.class, "IPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPath_Portable(), theEcorePackage.getEString(), "portable", null, 0, 1, IPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EclipseRuntimePackageImpl
