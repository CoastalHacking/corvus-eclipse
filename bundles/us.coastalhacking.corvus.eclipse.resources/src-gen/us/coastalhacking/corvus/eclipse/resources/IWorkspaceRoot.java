/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IWorkspace Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIWorkspaceRoot()
 * @model
 * @generated
 */
public interface IWorkspaceRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.eclipse.resources.IResource}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIWorkspaceRoot_Members()
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getRoot
	 * @model opposite="root" containment="true" keys="fullPath"
	 * @generated
	 */
	EList<IResource> getMembers();

} // IWorkspaceRoot
