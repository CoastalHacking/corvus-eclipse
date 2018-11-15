/**
 */
package us.coastalhacking.corvus.semiotics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An entry point whose 0-index signifier is an IMarker
 * <!-- end-model-doc -->
 *
 *
 * @see us.coastalhacking.corvus.semiotics.SemioticsPackage#getMarkerEntryPoint()
 * @model
 * @generated
 */
public interface MarkerEntryPoint extends EntryPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (((!this.getSignifiers().isEmpty()) &amp;&amp; (this.getSignifiers().get(0) instanceof &lt;%us.coastalhacking.corvus.semiotics.IMarker%&gt;)))\n{\n\t&lt;%us.coastalhacking.corvus.semiotics.Signifier%&gt; _get = this.getSignifiers().get(0);\n\treturn ((&lt;%us.coastalhacking.corvus.semiotics.IMarker%&gt;) _get).getMessage();\n}\nreturn null;'"
	 * @generated
	 */
	String getKey();

} // MarkerEntryPoint
