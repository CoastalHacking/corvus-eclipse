/**
 */
package us.coastalhacking.corvus.eclipse.resources.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import us.coastalhacking.corvus.eclipse.resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseResourcesFactoryImpl extends EFactoryImpl implements EclipseResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EclipseResourcesFactory init() {
		try {
			EclipseResourcesFactory theEclipseResourcesFactory = (EclipseResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(EclipseResourcesPackage.eNS_URI);
			if (theEclipseResourcesFactory != null) {
				return theEclipseResourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EclipseResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseResourcesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EclipseResourcesPackage.ATTRIBUTE: return (EObject)createAttribute();
			case EclipseResourcesPackage.IMARKER: return createIMarker();
			case EclipseResourcesPackage.IRESOURCE: return createIResource();
			case EclipseResourcesPackage.ICONTAINER: return createIContainer();
			case EclipseResourcesPackage.IPROJECT: return createIProject();
			case EclipseResourcesPackage.IWORKSPACE_ROOT: return createIWorkspaceRoot();
			case EclipseResourcesPackage.IFILE: return createIFile();
			case EclipseResourcesPackage.IFOLDER: return createIFolder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMarker createIMarker() {
		IMarkerImpl iMarker = new IMarkerImpl();
		return iMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource createIResource() {
		IResourceImpl iResource = new IResourceImpl();
		return iResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer createIContainer() {
		IContainerImpl iContainer = new IContainerImpl();
		return iContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProject() {
		IProjectImpl iProject = new IProjectImpl();
		return iProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWorkspaceRoot createIWorkspaceRoot() {
		IWorkspaceRootImpl iWorkspaceRoot = new IWorkspaceRootImpl();
		return iWorkspaceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile createIFile() {
		IFileImpl iFile = new IFileImpl();
		return iFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFolder createIFolder() {
		IFolderImpl iFolder = new IFolderImpl();
		return iFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseResourcesPackage getEclipseResourcesPackage() {
		return (EclipseResourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EclipseResourcesPackage getPackage() {
		return EclipseResourcesPackage.eINSTANCE;
	}

} //EclipseResourcesFactoryImpl
