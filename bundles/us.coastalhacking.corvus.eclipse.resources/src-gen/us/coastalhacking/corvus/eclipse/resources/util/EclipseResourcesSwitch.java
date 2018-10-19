/**
 */
package us.coastalhacking.corvus.eclipse.resources.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import us.coastalhacking.corvus.eclipse.resources.*;

import us.coastalhacking.corvus.semiotics.Semiotics;
import us.coastalhacking.corvus.semiotics.Signified;
import us.coastalhacking.corvus.semiotics.Signifier;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage
 * @generated
 */
public class EclipseResourcesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EclipseResourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseResourcesSwitch() {
		if (modelPackage == null) {
			modelPackage = EclipseResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EclipseResourcesPackage.ATTRIBUTE: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> attribute = (Map.Entry<String, String>)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IMARKER: {
				IMarker iMarker = (IMarker)theEObject;
				T result = caseIMarker(iMarker);
				if (result == null) result = caseSemiotics(iMarker);
				if (result == null) result = caseSignifier(iMarker);
				if (result == null) result = caseSignified(iMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IRESOURCE: {
				IResource iResource = (IResource)theEObject;
				T result = caseIResource(iResource);
				if (result == null) result = caseSemiotics(iResource);
				if (result == null) result = caseSignifier(iResource);
				if (result == null) result = caseSignified(iResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.ICONTAINER: {
				IContainer iContainer = (IContainer)theEObject;
				T result = caseIContainer(iContainer);
				if (result == null) result = caseIResource(iContainer);
				if (result == null) result = caseSemiotics(iContainer);
				if (result == null) result = caseSignifier(iContainer);
				if (result == null) result = caseSignified(iContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IPROJECT: {
				IProject iProject = (IProject)theEObject;
				T result = caseIProject(iProject);
				if (result == null) result = caseIContainer(iProject);
				if (result == null) result = caseIResource(iProject);
				if (result == null) result = caseSemiotics(iProject);
				if (result == null) result = caseSignifier(iProject);
				if (result == null) result = caseSignified(iProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IWORKSPACE_ROOT: {
				IWorkspaceRoot iWorkspaceRoot = (IWorkspaceRoot)theEObject;
				T result = caseIWorkspaceRoot(iWorkspaceRoot);
				if (result == null) result = caseIContainer(iWorkspaceRoot);
				if (result == null) result = caseIResource(iWorkspaceRoot);
				if (result == null) result = caseSemiotics(iWorkspaceRoot);
				if (result == null) result = caseSignifier(iWorkspaceRoot);
				if (result == null) result = caseSignified(iWorkspaceRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IFILE: {
				IFile iFile = (IFile)theEObject;
				T result = caseIFile(iFile);
				if (result == null) result = caseIResource(iFile);
				if (result == null) result = caseSemiotics(iFile);
				if (result == null) result = caseSignifier(iFile);
				if (result == null) result = caseSignified(iFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseResourcesPackage.IFOLDER: {
				IFolder iFolder = (IFolder)theEObject;
				T result = caseIFolder(iFolder);
				if (result == null) result = caseIContainer(iFolder);
				if (result == null) result = caseIResource(iFolder);
				if (result == null) result = caseSemiotics(iFolder);
				if (result == null) result = caseSignifier(iFolder);
				if (result == null) result = caseSignified(iFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarker(IMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IResource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IResource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIResource(IResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIContainer(IContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProject(IProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWorkspace Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWorkspace Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWorkspaceRoot(IWorkspaceRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFile(IFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFolder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFolder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFolder(IFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignifier(Signifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signified</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signified</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignified(Signified object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semiotics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semiotics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemiotics(Semiotics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EclipseResourcesSwitch
