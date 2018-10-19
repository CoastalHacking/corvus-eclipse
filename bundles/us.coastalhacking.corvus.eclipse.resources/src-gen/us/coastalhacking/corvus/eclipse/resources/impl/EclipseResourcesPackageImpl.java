/**
 */
package us.coastalhacking.corvus.eclipse.resources.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage;
import us.coastalhacking.corvus.eclipse.resources.IContainer;
import us.coastalhacking.corvus.eclipse.resources.IFile;
import us.coastalhacking.corvus.eclipse.resources.IFolder;
import us.coastalhacking.corvus.eclipse.resources.IMarker;
import us.coastalhacking.corvus.eclipse.resources.IProject;
import us.coastalhacking.corvus.eclipse.resources.IResource;

import us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimePackage;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseResourcesPackageImpl extends EPackageImpl implements EclipseResourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFolderEClass = null;

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
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EclipseResourcesPackageImpl() {
		super(eNS_URI, EclipseResourcesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EclipseResourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EclipseResourcesPackage init() {
		if (isInited) return (EclipseResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(EclipseResourcesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEclipseResourcesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EclipseResourcesPackageImpl theEclipseResourcesPackage = registeredEclipseResourcesPackage instanceof EclipseResourcesPackageImpl ? (EclipseResourcesPackageImpl)registeredEclipseResourcesPackage : new EclipseResourcesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		SemioticsPackage.eINSTANCE.eClass();
		EclipseRuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEclipseResourcesPackage.createPackageContents();

		// Initialize created meta-data
		theEclipseResourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclipseResourcesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EclipseResourcesPackage.eNS_URI, theEclipseResourcesPackage);
		return theEclipseResourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Key() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMarker() {
		return iMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMarker_Id() {
		return (EAttribute)iMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMarker_CreationTime() {
		return (EAttribute)iMarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMarker_Type() {
		return (EAttribute)iMarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMarker_Attributes() {
		return (EReference)iMarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMarker_Resource() {
		return (EReference)iMarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIResource() {
		return iResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIResource_Name() {
		return (EAttribute)iResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIResource_Markers() {
		return (EReference)iResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIResource_Parent() {
		return (EReference)iResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIResource_FullPath() {
		return (EReference)iResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIResource__GetProject() {
		return iResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIContainer() {
		return iContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIContainer_Members() {
		return (EReference)iContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProject() {
		return iProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFile() {
		return iFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFolder() {
		return iFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseResourcesFactory getEclipseResourcesFactory() {
		return (EclipseResourcesFactory)getEFactoryInstance();
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
		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		iMarkerEClass = createEClass(IMARKER);
		createEAttribute(iMarkerEClass, IMARKER__ID);
		createEAttribute(iMarkerEClass, IMARKER__CREATION_TIME);
		createEAttribute(iMarkerEClass, IMARKER__TYPE);
		createEReference(iMarkerEClass, IMARKER__ATTRIBUTES);
		createEReference(iMarkerEClass, IMARKER__RESOURCE);

		iResourceEClass = createEClass(IRESOURCE);
		createEAttribute(iResourceEClass, IRESOURCE__NAME);
		createEReference(iResourceEClass, IRESOURCE__MARKERS);
		createEReference(iResourceEClass, IRESOURCE__PARENT);
		createEReference(iResourceEClass, IRESOURCE__FULL_PATH);
		createEOperation(iResourceEClass, IRESOURCE___GET_PROJECT);

		iContainerEClass = createEClass(ICONTAINER);
		createEReference(iContainerEClass, ICONTAINER__MEMBERS);

		iProjectEClass = createEClass(IPROJECT);

		iFileEClass = createEClass(IFILE);

		iFolderEClass = createEClass(IFOLDER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		SemioticsPackage theSemioticsPackage = (SemioticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemioticsPackage.eNS_URI);
		EclipseRuntimePackage theEclipseRuntimePackage = (EclipseRuntimePackage)EPackage.Registry.INSTANCE.getEPackage(EclipseRuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iMarkerEClass.getESuperTypes().add(theSemioticsPackage.getSemiotics());
		iResourceEClass.getESuperTypes().add(theSemioticsPackage.getSemiotics());
		iContainerEClass.getESuperTypes().add(this.getIResource());
		iProjectEClass.getESuperTypes().add(this.getIContainer());
		iFileEClass.getESuperTypes().add(this.getIResource());
		iFolderEClass.getESuperTypes().add(this.getIContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeEClass, Map.Entry.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iMarkerEClass, IMarker.class, "IMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIMarker_Id(), theEcorePackage.getELong(), "id", null, 0, 1, IMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIMarker_CreationTime(), theEcorePackage.getELong(), "creationTime", null, 0, 1, IMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIMarker_Type(), theEcorePackage.getEString(), "type", null, 0, 1, IMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMarker_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, IMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMarker_Resource(), this.getIResource(), this.getIResource_Markers(), "resource", null, 0, 1, IMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iResourceEClass, IResource.class, "IResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIResource_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIResource_Markers(), this.getIMarker(), this.getIMarker_Resource(), "markers", null, 0, -1, IResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIResource_Parent(), this.getIContainer(), this.getIContainer_Members(), "parent", null, 0, 1, IResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIResource_FullPath(), theEclipseRuntimePackage.getIPath(), null, "fullPath", null, 0, 1, IResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIResource__GetProject(), this.getIProject(), "getProject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iContainerEClass, IContainer.class, "IContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIContainer_Members(), this.getIResource(), this.getIResource_Parent(), "members", null, 0, -1, IContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iProjectEClass, IProject.class, "IProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iFileEClass, IFile.class, "IFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iFolderEClass, IFolder.class, "IFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EclipseResourcesPackageImpl
