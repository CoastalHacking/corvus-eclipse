/**
 */
package us.coastalhacking.corvus.eclipse.runtime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import us.coastalhacking.corvus.eclipse.runtime.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseRuntimeFactoryImpl extends EFactoryImpl implements EclipseRuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EclipseRuntimeFactory init() {
		try {
			EclipseRuntimeFactory theEclipseRuntimeFactory = (EclipseRuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(EclipseRuntimePackage.eNS_URI);
			if (theEclipseRuntimeFactory != null) {
				return theEclipseRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EclipseRuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseRuntimeFactoryImpl() {
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
			case EclipseRuntimePackage.IPATH: return createIPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath createIPath() {
		IPathImpl iPath = new IPathImpl();
		return iPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseRuntimePackage getEclipseRuntimePackage() {
		return (EclipseRuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EclipseRuntimePackage getPackage() {
		return EclipseRuntimePackage.eINSTANCE;
	}

} //EclipseRuntimeFactoryImpl
