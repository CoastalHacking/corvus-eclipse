/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.corvus.eclipse.runtime.IPath;

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
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers <em>Markers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getParent <em>Parent</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource()
 * @model
 * @generated
 */
public interface IResource extends Semiotics {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	EList<IMarker> getMarkers();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IContainer#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IContainer)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_Parent()
	 * @see us.coastalhacking.corvus.eclipse.resources.IContainer#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	IContainer getParent();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IContainer value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' containment reference.
	 * @see #setFullPath(IPath)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIResource_FullPath()
	 * @model containment="true"
	 * @generated
	 */
	IPath getFullPath();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getFullPath <em>Full Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Path</em>' containment reference.
	 * @see #getFullPath()
	 * @generated
	 */
	void setFullPath(IPath value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%us.coastalhacking.corvus.eclipse.resources.IProject%&gt; _xifexpression = null;\n&lt;%us.coastalhacking.corvus.eclipse.resources.IContainer%&gt; _parent = this.getParent();\nif ((_parent instanceof &lt;%us.coastalhacking.corvus.eclipse.resources.IProject%&gt;))\n{\n\t&lt;%us.coastalhacking.corvus.eclipse.resources.IContainer%&gt; _parent_1 = this.getParent();\n\t_xifexpression = ((&lt;%us.coastalhacking.corvus.eclipse.resources.IProject%&gt;) _parent_1);\n}\nelse\n{\n\t_xifexpression = this.getParent().getProject();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	IProject getProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getProject().getWorkspaceRoot();'"
	 * @generated
	 */
	IWorkspaceRoot getWorkspaceRoot();

} // IResource
