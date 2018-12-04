/**
 */
package us.coastalhacking.corvus.test.util.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import us.coastalhacking.corvus.test.util.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.test.util.UtilPackage
 * @generated
 */
public class UtilAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilSwitch<Adapter> modelSwitch =
		new UtilSwitch<Adapter>() {
			@Override
			public Adapter caseTestRoot(TestRoot object) {
				return createTestRootAdapter();
			}
			@Override
			public Adapter caseTestIds(TestIds object) {
				return createTestIdsAdapter();
			}
			@Override
			public Adapter caseTestId(TestId object) {
				return createTestIdAdapter();
			}
			@Override
			public Adapter caseTestReference(TestReference object) {
				return createTestReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.corvus.test.util.TestRoot <em>Test Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.corvus.test.util.TestRoot
	 * @generated
	 */
	public Adapter createTestRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.corvus.test.util.TestIds <em>Test Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.corvus.test.util.TestIds
	 * @generated
	 */
	public Adapter createTestIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.corvus.test.util.TestId <em>Test Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.corvus.test.util.TestId
	 * @generated
	 */
	public Adapter createTestIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.corvus.test.util.TestReference <em>Test Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.corvus.test.util.TestReference
	 * @generated
	 */
	public Adapter createTestReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UtilAdapterFactory
