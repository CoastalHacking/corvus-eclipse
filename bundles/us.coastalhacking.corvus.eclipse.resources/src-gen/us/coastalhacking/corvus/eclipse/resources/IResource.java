/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.corvus.semiotics.Semiotics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IResource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers <em>Markers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource()
 * @model
 * @generated
 */
public interface IResource extends Semiotics {
	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see #setFullPath(String)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_FullPath()
	 * @model unique="false"
	 * @generated
	 */
	String getFullPath();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Path</em>' attribute.
	 * @see #getFullPath()
	 * @generated
	 */
	void setFullPath(String value);

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.eclipse.resources.IMarker}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_Markers()
	 * @see us.coastalhacking.corvus.eclipse.resources.IMarker#getResource
	 * @model opposite="resource" containment="true" keys="id"
	 * @generated
	 */
	EList<IMarker> getMarkers();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(IWorkspaceRoot)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_Root()
	 * @see us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	IWorkspaceRoot getRoot();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(IWorkspaceRoot value);

} // IResource
