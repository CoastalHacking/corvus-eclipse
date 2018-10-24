/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;

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
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='eclipseResources' prefix='EclipseResources' modelName='EclipseResources' basePackage='us.coastalhacking.corvus.eclipse'"
 * @generated
 */
public interface EclipseResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.coastalhacking.us/corvus/eclipseResources/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclipseResources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclipseResourcesPackage eINSTANCE = us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.AttributeImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl <em>IMarker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIMarker()
	 * @generated
	 */
	int IMARKER = 1;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__SIGNIFIEDS = SemioticsPackage.SEMIOTICS__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__SIGNIFIERS = SemioticsPackage.SEMIOTICS__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__ID = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__CREATION_TIME = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__TYPE = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__ATTRIBUTES = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER__RESOURCE = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IMarker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER_FEATURE_COUNT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>IMarker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMARKER_OPERATION_COUNT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl <em>IResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__SIGNIFIEDS = SemioticsPackage.SEMIOTICS__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__SIGNIFIERS = SemioticsPackage.SEMIOTICS__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__FULL_PATH = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__MARKERS = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__ROOT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_FEATURE_COUNT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_OPERATION_COUNT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl <em>IWorkspace Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIWorkspaceRoot()
	 * @generated
	 */
	int IWORKSPACE_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>IWorkspace Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IWorkspace Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IMarker <em>IMarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMarker</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker
	 * @generated
	 */
	EClass getIMarker();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getId()
	 * @see #getIMarker()
	 * @generated
	 */
	EAttribute getIMarker_Id();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getCreationTime()
	 * @see #getIMarker()
	 * @generated
	 */
	EAttribute getIMarker_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getType()
	 * @see #getIMarker()
	 * @generated
	 */
	EAttribute getIMarker_Type();

	/**
	 * Returns the meta object for the map '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getAttributes()
	 * @see #getIMarker()
	 * @generated
	 */
	EReference getIMarker_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getResource()
	 * @see #getIMarker()
	 * @generated
	 */
	EReference getIMarker_Resource();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IResource</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource
	 * @generated
	 */
	EClass getIResource();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath()
	 * @see #getIResource()
	 * @generated
	 */
	EAttribute getIResource_FullPath();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers()
	 * @see #getIResource()
	 * @generated
	 */
	EReference getIResource_Markers();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getRoot()
	 * @see #getIResource()
	 * @generated
	 */
	EReference getIResource_Root();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot <em>IWorkspace Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkspace Root</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot
	 * @generated
	 */
	EClass getIWorkspaceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getMembers()
	 * @see #getIWorkspaceRoot()
	 * @generated
	 */
	EReference getIWorkspaceRoot_Members();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EclipseResourcesFactory getEclipseResourcesFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.AttributeImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl <em>IMarker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIMarker()
		 * @generated
		 */
		EClass IMARKER = eINSTANCE.getIMarker();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMARKER__ID = eINSTANCE.getIMarker_Id();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMARKER__CREATION_TIME = eINSTANCE.getIMarker_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMARKER__TYPE = eINSTANCE.getIMarker_Type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMARKER__ATTRIBUTES = eINSTANCE.getIMarker_Attributes();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMARKER__RESOURCE = eINSTANCE.getIMarker_Resource();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl <em>IResource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIResource()
		 * @generated
		 */
		EClass IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRESOURCE__FULL_PATH = eINSTANCE.getIResource_FullPath();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRESOURCE__MARKERS = eINSTANCE.getIResource_Markers();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRESOURCE__ROOT = eINSTANCE.getIResource_Root();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl <em>IWorkspace Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIWorkspaceRoot()
		 * @generated
		 */
		EClass IWORKSPACE_ROOT = eINSTANCE.getIWorkspaceRoot();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IWORKSPACE_ROOT__MEMBERS = eINSTANCE.getIWorkspaceRoot_Members();

	}

} //EclipseResourcesPackage
