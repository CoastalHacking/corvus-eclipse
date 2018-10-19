/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.common.util.EMap;

import us.coastalhacking.corvus.semiotics.Semiotics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMarker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getId <em>Id</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getType <em>Type</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker()
 * @model
 * @generated
 */
public interface IMarker extends Semiotics {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker_Id()
	 * @model unique="false"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(long)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker_CreationTime()
	 * @model unique="false"
	 * @generated
	 */
	long getCreationTime();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker_Attributes()
	 * @model mapType="us.coastalhacking.corvus.eclipse.resources.Attribute&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getAttributes();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(IResource)
	 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage#getIMarker_Resource()
	 * @see us.coastalhacking.corvus.eclipse.resources.IResource#getMarkers
	 * @model opposite="markers" transient="false"
	 * @generated
	 */
	IResource getResource();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.resources.IMarker#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(IResource value);

} // IMarker
