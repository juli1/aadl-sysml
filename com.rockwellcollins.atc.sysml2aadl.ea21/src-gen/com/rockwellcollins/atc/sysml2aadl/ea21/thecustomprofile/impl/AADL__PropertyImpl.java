/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AADL Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl#getAADL__Property <em>AADL Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl#getBase_Connector <em>Base Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AADL__PropertyImpl extends MinimalEObjectImpl.Container implements AADL__Property {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> base_Property;

	/**
	 * The default value of the '{@link #getAADL__Property() <em>AADL Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAADL__Property()
	 * @generated
	 * @ordered
	 */
	protected static final String AADL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAADL__Property() <em>AADL Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAADL__Property()
	 * @generated
	 * @ordered
	 */
	protected String aadL__Property = AADL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> base_Connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AADL__PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThecustomprofilePackage.Literals.AADL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getBase_Property() {
		if (base_Property == null) {
			base_Property = new EObjectWithInverseResolvingEList.ManyInverse<Property>(Property.class, this, ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY, UMLPackage.PROPERTY__ALL_AADL_PROPERTY);
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAADL__Property() {
		return aadL__Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAADL__Property(String newAADL__Property) {
		String oldAADL__Property = aadL__Property;
		aadL__Property = newAADL__Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThecustomprofilePackage.AADL_PROPERTY__AADL_PROPERTY, oldAADL__Property, aadL__Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getBase_Connector() {
		if (base_Connector == null) {
			base_Connector = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this, ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR, UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY);
		}
		return base_Connector;
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
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBase_Property()).basicAdd(otherEnd, msgs);
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBase_Connector()).basicAdd(otherEnd, msgs);
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
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				return ((InternalEList<?>)getBase_Property()).basicRemove(otherEnd, msgs);
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				return ((InternalEList<?>)getBase_Connector()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				return getBase_Property();
			case ThecustomprofilePackage.AADL_PROPERTY__AADL_PROPERTY:
				return getAADL__Property();
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				return getBase_Connector();
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
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				getBase_Property().clear();
				getBase_Property().addAll((Collection<? extends Property>)newValue);
				return;
			case ThecustomprofilePackage.AADL_PROPERTY__AADL_PROPERTY:
				setAADL__Property((String)newValue);
				return;
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				getBase_Connector().clear();
				getBase_Connector().addAll((Collection<? extends Connector>)newValue);
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
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				getBase_Property().clear();
				return;
			case ThecustomprofilePackage.AADL_PROPERTY__AADL_PROPERTY:
				setAADL__Property(AADL_PROPERTY_EDEFAULT);
				return;
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				getBase_Connector().clear();
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
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY:
				return base_Property != null && !base_Property.isEmpty();
			case ThecustomprofilePackage.AADL_PROPERTY__AADL_PROPERTY:
				return AADL_PROPERTY_EDEFAULT == null ? aadL__Property != null : !AADL_PROPERTY_EDEFAULT.equals(aadL__Property);
			case ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR:
				return base_Connector != null && !base_Connector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AADL__Property: ");
		result.append(aadL__Property);
		result.append(')');
		return result.toString();
	}

} //AADL__PropertyImpl
