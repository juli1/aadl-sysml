/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.DifferentTypes;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl#getAllAADLProperty <em>All AADL Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> qualifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DifferentTypes type;

	/**
	 * The cached value of the '{@link #getAllAADLProperty() <em>All AADL Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAADLProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AADL__Property> allAADLProperty;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralInteger> lowerValue;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralInteger> upperValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<Port>(Port.class, this, UMLPackage.PROPERTY__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentTypes getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DifferentTypes)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentTypes basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DifferentTypes newType) {
		DifferentTypes oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AADL__Property> getAllAADLProperty() {
		if (allAADLProperty == null) {
			allAADLProperty = new EObjectWithInverseResolvingEList.ManyInverse<AADL__Property>(AADL__Property.class, this, UMLPackage.PROPERTY__ALL_AADL_PROPERTY, ThecustomprofilePackage.AADL_PROPERTY__BASE_PROPERTY);
		}
		return allAADLProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralInteger> getLowerValue() {
		if (lowerValue == null) {
			lowerValue = new EObjectContainmentEList<LiteralInteger>(LiteralInteger.class, this, UMLPackage.PROPERTY__LOWER_VALUE);
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralInteger> getUpperValue() {
		if (upperValue == null) {
			upperValue = new EObjectContainmentEList<LiteralInteger>(LiteralInteger.class, this, UMLPackage.PROPERTY__UPPER_VALUE);
		}
		return upperValue;
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
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllAADLProperty()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.PROPERTY__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				return ((InternalEList<?>)getAllAADLProperty()).basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__LOWER_VALUE:
				return ((InternalEList<?>)getLowerValue()).basicRemove(otherEnd, msgs);
			case UMLPackage.PROPERTY__UPPER_VALUE:
				return ((InternalEList<?>)getUpperValue()).basicRemove(otherEnd, msgs);
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
			case UMLPackage.PROPERTY__QUALIFIER:
				return getQualifier();
			case UMLPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				return getAllAADLProperty();
			case UMLPackage.PROPERTY__LOWER_VALUE:
				return getLowerValue();
			case UMLPackage.PROPERTY__UPPER_VALUE:
				return getUpperValue();
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
			case UMLPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Port>)newValue);
				return;
			case UMLPackage.PROPERTY__TYPE:
				setType((DifferentTypes)newValue);
				return;
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				getAllAADLProperty().clear();
				getAllAADLProperty().addAll((Collection<? extends AADL__Property>)newValue);
				return;
			case UMLPackage.PROPERTY__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends LiteralInteger>)newValue);
				return;
			case UMLPackage.PROPERTY__UPPER_VALUE:
				getUpperValue().clear();
				getUpperValue().addAll((Collection<? extends LiteralInteger>)newValue);
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
			case UMLPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				return;
			case UMLPackage.PROPERTY__TYPE:
				setType((DifferentTypes)null);
				return;
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				getAllAADLProperty().clear();
				return;
			case UMLPackage.PROPERTY__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UMLPackage.PROPERTY__UPPER_VALUE:
				getUpperValue().clear();
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
			case UMLPackage.PROPERTY__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case UMLPackage.PROPERTY__TYPE:
				return type != null;
			case UMLPackage.PROPERTY__ALL_AADL_PROPERTY:
				return allAADLProperty != null && !allAADLProperty.isEmpty();
			case UMLPackage.PROPERTY__LOWER_VALUE:
				return lowerValue != null && !lowerValue.isEmpty();
			case UMLPackage.PROPERTY__UPPER_VALUE:
				return upperValue != null && !upperValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
