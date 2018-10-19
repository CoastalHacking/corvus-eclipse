/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__NAME = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__MARKERS = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__PARENT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE__FULL_PATH = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_FEATURE_COUNT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE___GET_PROJECT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE___GET_WORKSPACE_ROOT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_OPERATION_COUNT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IContainerImpl <em>IContainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IContainerImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__SIGNIFIEDS = IRESOURCE__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__SIGNIFIERS = IRESOURCE__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__NAME = IRESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__MARKERS = IRESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__PARENT = IRESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__FULL_PATH = IRESOURCE__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER__MEMBERS = IRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER_FEATURE_COUNT = IRESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER___GET_PROJECT = IRESOURCE___GET_PROJECT;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER___GET_WORKSPACE_ROOT = IRESOURCE___GET_WORKSPACE_ROOT;

	/**
	 * The number of operations of the '<em>IContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER_OPERATION_COUNT = IRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IProjectImpl <em>IProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IProjectImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 4;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__SIGNIFIEDS = ICONTAINER__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__SIGNIFIERS = ICONTAINER__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__NAME = ICONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__MARKERS = ICONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__PARENT = ICONTAINER__PARENT;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__FULL_PATH = ICONTAINER__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__MEMBERS = ICONTAINER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT__ROOT = ICONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_FEATURE_COUNT = ICONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_PROJECT = ICONTAINER___GET_PROJECT;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_WORKSPACE_ROOT = ICONTAINER___GET_WORKSPACE_ROOT;

	/**
	 * The number of operations of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_OPERATION_COUNT = ICONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl <em>IWorkspace Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IWorkspaceRootImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIWorkspaceRoot()
	 * @generated
	 */
	int IWORKSPACE_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__SIGNIFIEDS = ICONTAINER__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__SIGNIFIERS = ICONTAINER__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__NAME = ICONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__MARKERS = ICONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__PARENT = ICONTAINER__PARENT;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__FULL_PATH = ICONTAINER__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__MEMBERS = ICONTAINER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT__PROJECTS = ICONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IWorkspace Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT_FEATURE_COUNT = ICONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT___GET_PROJECT = ICONTAINER___GET_PROJECT;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT___GET_WORKSPACE_ROOT = ICONTAINER___GET_WORKSPACE_ROOT;

	/**
	 * The number of operations of the '<em>IWorkspace Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKSPACE_ROOT_OPERATION_COUNT = ICONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IFileImpl <em>IFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IFileImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 6;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__SIGNIFIEDS = IRESOURCE__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__SIGNIFIERS = IRESOURCE__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__NAME = IRESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__MARKERS = IRESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__PARENT = IRESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE__FULL_PATH = IRESOURCE__FULL_PATH;

	/**
	 * The number of structural features of the '<em>IFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE_FEATURE_COUNT = IRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE___GET_PROJECT = IRESOURCE___GET_PROJECT;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE___GET_WORKSPACE_ROOT = IRESOURCE___GET_WORKSPACE_ROOT;

	/**
	 * The number of operations of the '<em>IFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFILE_OPERATION_COUNT = IRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IFolderImpl <em>IFolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.IFolderImpl
	 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 7;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__SIGNIFIEDS = ICONTAINER__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__SIGNIFIERS = ICONTAINER__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__NAME = ICONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__MARKERS = ICONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__PARENT = ICONTAINER__PARENT;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__FULL_PATH = ICONTAINER__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER__MEMBERS = ICONTAINER__MEMBERS;

	/**
	 * The number of structural features of the '<em>IFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER_FEATURE_COUNT = ICONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER___GET_PROJECT = ICONTAINER___GET_PROJECT;

	/**
	 * The operation id for the '<em>Get Workspace Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER___GET_WORKSPACE_ROOT = ICONTAINER___GET_WORKSPACE_ROOT;

	/**
	 * The number of operations of the '<em>IFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOLDER_OPERATION_COUNT = ICONTAINER_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getName()
	 * @see #getIResource()
	 * @generated
	 */
	EAttribute getIResource_Name();

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
	 * Returns the meta object for the container reference '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getParent()
	 * @see #getIResource()
	 * @generated
	 */
	EReference getIResource_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Full Path</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath()
	 * @see #getIResource()
	 * @generated
	 */
	EReference getIResource_FullPath();

	/**
	 * Returns the meta object for the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getProject() <em>Get Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project</em>' operation.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getProject()
	 * @generated
	 */
	EOperation getIResource__GetProject();

	/**
	 * Returns the meta object for the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getWorkspaceRoot() <em>Get Workspace Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workspace Root</em>' operation.
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getWorkspaceRoot()
	 * @generated
	 */
	EOperation getIResource__GetWorkspaceRoot();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IContainer</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IContainer
	 * @generated
	 */
	EClass getIContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.corvus.eclipse.resources.IContainer#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IContainer#getMembers()
	 * @see #getIContainer()
	 * @generated
	 */
	EReference getIContainer_Members();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IProject
	 * @generated
	 */
	EClass getIProject();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.corvus.eclipse.resources.IProject#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IProject#getRoot()
	 * @see #getIProject()
	 * @generated
	 */
	EReference getIProject_Root();

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
	 * Returns the meta object for the reference list '{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getProjects()
	 * @see #getIWorkspaceRoot()
	 * @generated
	 */
	EReference getIWorkspaceRoot_Projects();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFile</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IFile
	 * @generated
	 */
	EClass getIFile();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.resources.IFolder <em>IFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFolder</em>'.
	 * @see us.coastalhacking.corvus.eclipse.resources.IFolder
	 * @generated
	 */
	EClass getIFolder();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRESOURCE__NAME = eINSTANCE.getIResource_Name();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRESOURCE__MARKERS = eINSTANCE.getIResource_Markers();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRESOURCE__PARENT = eINSTANCE.getIResource_Parent();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRESOURCE__FULL_PATH = eINSTANCE.getIResource_FullPath();

		/**
		 * The meta object literal for the '<em><b>Get Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESOURCE___GET_PROJECT = eINSTANCE.getIResource__GetProject();

		/**
		 * The meta object literal for the '<em><b>Get Workspace Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESOURCE___GET_WORKSPACE_ROOT = eINSTANCE.getIResource__GetWorkspaceRoot();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IContainerImpl <em>IContainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IContainerImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIContainer()
		 * @generated
		 */
		EClass ICONTAINER = eINSTANCE.getIContainer();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONTAINER__MEMBERS = eINSTANCE.getIContainer_Members();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IProjectImpl <em>IProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IProjectImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIProject()
		 * @generated
		 */
		EClass IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROJECT__ROOT = eINSTANCE.getIProject_Root();

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
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IWORKSPACE_ROOT__PROJECTS = eINSTANCE.getIWorkspaceRoot_Projects();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IFileImpl <em>IFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IFileImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIFile()
		 * @generated
		 */
		EClass IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.resources.impl.IFolderImpl <em>IFolder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.IFolderImpl
		 * @see us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesPackageImpl#getIFolder()
		 * @generated
		 */
		EClass IFOLDER = eINSTANCE.getIFolder();

	}

} //EclipseResourcesPackage
