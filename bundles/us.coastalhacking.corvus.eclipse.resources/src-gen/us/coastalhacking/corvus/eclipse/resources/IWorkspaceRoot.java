/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IWorkspace Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIWorkspaceRoot()
 * @model
 * @generated
 */
public interface IWorkspaceRoot extends IContainer {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.eclipse.resources.IProject}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IProject#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIWorkspaceRoot_Projects()
	 * @see us.coastalhacking.corvus.eclipse.resources.IProject#getRoot
	 * @model opposite="root"
	 * @generated
	 */
	EList<IProject> getProjects();

} // IWorkspaceRoot
