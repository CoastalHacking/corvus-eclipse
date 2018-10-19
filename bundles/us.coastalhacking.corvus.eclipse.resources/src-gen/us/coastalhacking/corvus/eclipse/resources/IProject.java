/**
 */
package us.coastalhacking.corvus.eclipse.resources;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IProject#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIProject()
 * @model
 * @generated
 */
public interface IProject extends IContainer {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(IWorkspaceRoot)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIProject_Root()
	 * @see us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getProjects
	 * @model opposite="projects"
	 * @generated
	 */
	IWorkspaceRoot getRoot();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IProject#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(IWorkspaceRoot value);

} // IProject
