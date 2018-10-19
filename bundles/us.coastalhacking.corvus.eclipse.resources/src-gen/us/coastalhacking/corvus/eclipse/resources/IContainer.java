/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IContainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IContainer#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIContainer()
 * @model
 * @generated
 */
public interface IContainer extends IResource {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.eclipse.resources.IResource}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIContainer_Members()
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IResource> getMembers();

} // IContainer
