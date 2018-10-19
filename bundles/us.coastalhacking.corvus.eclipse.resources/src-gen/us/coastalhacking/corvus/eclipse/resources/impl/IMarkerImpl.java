/**
 */
package us.coastalhacking.corvus.eclipse.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage;
import us.coastalhacking.corvus.eclipse.resources.IMarker;
import us.coastalhacking.corvus.eclipse.resources.IResource;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;
import us.coastalhacking.corvus.semiotics.Signified;
import us.coastalhacking.corvus.semiotics.Signifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMarker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getSignifieds <em>Signifieds</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getSignifiers <em>Signifiers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getId <em>Id</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getType <em>Type</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IMarkerImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMarkerImpl extends MinimalEObjectImpl.Container implements IMarker {
	/**
	 * The cached value of the '{@link #getSignifieds() <em>Signifieds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignifieds()
	 * @generated
	 * @ordered
	 */
	protected EList<Signified> signifieds;

	/**
	 * The cached value of the '{@link #getSignifiers() <em>Signifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Signifier> signifiers;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected long creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipseResourcesPackage.Literals.IMARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signified> getSignifieds() {
		if (signifieds == null) {
			signifieds = new EObjectWithInverseResolvingEList.ManyInverse<Signified>(Signified.class, this, EclipseResourcesPackage.IMARKER__SIGNIFIEDS, SemioticsPackage.SIGNIFIED__SIGNIFIERS);
		}
		return signifieds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signifier> getSignifiers() {
		if (signifiers == null) {
			signifiers = new EObjectWithInverseResolvingEList.ManyInverse<Signifier>(Signifier.class, this, EclipseResourcesPackage.IMARKER__SIGNIFIERS, SemioticsPackage.SIGNIFIER__SIGNIFIEDS);
		}
		return signifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IMARKER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(long newCreationTime) {
		long oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IMARKER__CREATION_TIME, oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IMARKER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getAttributes() {
		if (attributes == null) {
			attributes = new EcoreEMap<String,String>(EclipseResourcesPackage.Literals.ATTRIBUTE, AttributeImpl.class, this, EclipseResourcesPackage.IMARKER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getResource() {
		if (eContainerFeatureID() != EclipseResourcesPackage.IMARKER__RESOURCE) return null;
		return (IResource)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource basicGetResource() {
		if (eContainerFeatureID() != EclipseResourcesPackage.IMARKER__RESOURCE) return null;
		return (IResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(IResource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, EclipseResourcesPackage.IMARKER__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(IResource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != EclipseResourcesPackage.IMARKER__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EclipseResourcesPackage.IRESOURCE__MARKERS, IResource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IMARKER__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifieds()).basicAdd(otherEnd, msgs);
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifiers()).basicAdd(otherEnd, msgs);
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((IResource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				return ((InternalEList<?>)getSignifieds()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				return ((InternalEList<?>)getSignifiers()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IMARKER__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				return basicSetResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				return eInternalContainer().eInverseRemove(this, EclipseResourcesPackage.IRESOURCE__MARKERS, IResource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				return getSignifieds();
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				return getSignifiers();
			case EclipseResourcesPackage.IMARKER__ID:
				return getId();
			case EclipseResourcesPackage.IMARKER__CREATION_TIME:
				return getCreationTime();
			case EclipseResourcesPackage.IMARKER__TYPE:
				return getType();
			case EclipseResourcesPackage.IMARKER__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				getSignifieds().clear();
				getSignifieds().addAll((Collection<? extends Signified>)newValue);
				return;
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				getSignifiers().clear();
				getSignifiers().addAll((Collection<? extends Signifier>)newValue);
				return;
			case EclipseResourcesPackage.IMARKER__ID:
				setId((Long)newValue);
				return;
			case EclipseResourcesPackage.IMARKER__CREATION_TIME:
				setCreationTime((Long)newValue);
				return;
			case EclipseResourcesPackage.IMARKER__TYPE:
				setType((String)newValue);
				return;
			case EclipseResourcesPackage.IMARKER__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
				return;
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				setResource((IResource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				getSignifieds().clear();
				return;
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				getSignifiers().clear();
				return;
			case EclipseResourcesPackage.IMARKER__ID:
				setId(ID_EDEFAULT);
				return;
			case EclipseResourcesPackage.IMARKER__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case EclipseResourcesPackage.IMARKER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EclipseResourcesPackage.IMARKER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				setResource((IResource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EclipseResourcesPackage.IMARKER__SIGNIFIEDS:
				return signifieds != null && !signifieds.isEmpty();
			case EclipseResourcesPackage.IMARKER__SIGNIFIERS:
				return signifiers != null && !signifiers.isEmpty();
			case EclipseResourcesPackage.IMARKER__ID:
				return id != ID_EDEFAULT;
			case EclipseResourcesPackage.IMARKER__CREATION_TIME:
				return creationTime != CREATION_TIME_EDEFAULT;
			case EclipseResourcesPackage.IMARKER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EclipseResourcesPackage.IMARKER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EclipseResourcesPackage.IMARKER__RESOURCE:
				return basicGetResource() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Signified.class) {
			switch (derivedFeatureID) {
				case EclipseResourcesPackage.IMARKER__SIGNIFIERS: return SemioticsPackage.SIGNIFIED__SIGNIFIERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Signified.class) {
			switch (baseFeatureID) {
				case SemioticsPackage.SIGNIFIED__SIGNIFIERS: return EclipseResourcesPackage.IMARKER__SIGNIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IMarkerImpl
