/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.DifferentTypes;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl#getAadlPort <em>Aadl Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl#getSysmlPort <em>Sysml Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port {
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
	 * The cached value of the '{@link #getAadlPort() <em>Aadl Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAadlPort()
	 * @generated
	 * @ordered
	 */
	protected port aadlPort;

	/**
	 * The cached value of the '{@link #getSysmlPort() <em>Sysml Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysmlPort()
	 * @generated
	 * @ordered
	 */
	protected FlowPort sysmlPort;

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
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.PORT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port getAadlPort() {
		if (aadlPort != null && aadlPort.eIsProxy()) {
			InternalEObject oldAadlPort = (InternalEObject)aadlPort;
			aadlPort = (port)eResolveProxy(oldAadlPort);
			if (aadlPort != oldAadlPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.PORT__AADL_PORT, oldAadlPort, aadlPort));
			}
		}
		return aadlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port basicGetAadlPort() {
		return aadlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAadlPort(port newAadlPort, NotificationChain msgs) {
		port oldAadlPort = aadlPort;
		aadlPort = newAadlPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.PORT__AADL_PORT, oldAadlPort, newAadlPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAadlPort(port newAadlPort) {
		if (newAadlPort != aadlPort) {
			NotificationChain msgs = null;
			if (aadlPort != null)
				msgs = ((InternalEObject)aadlPort).eInverseRemove(this, AADL_ElementsPackage.PORT__BASE_PORT, port.class, msgs);
			if (newAadlPort != null)
				msgs = ((InternalEObject)newAadlPort).eInverseAdd(this, AADL_ElementsPackage.PORT__BASE_PORT, port.class, msgs);
			msgs = basicSetAadlPort(newAadlPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.PORT__AADL_PORT, newAadlPort, newAadlPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowPort getSysmlPort() {
		if (sysmlPort != null && sysmlPort.eIsProxy()) {
			InternalEObject oldSysmlPort = (InternalEObject)sysmlPort;
			sysmlPort = (FlowPort)eResolveProxy(oldSysmlPort);
			if (sysmlPort != oldSysmlPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.PORT__SYSML_PORT, oldSysmlPort, sysmlPort));
			}
		}
		return sysmlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowPort basicGetSysmlPort() {
		return sysmlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSysmlPort(FlowPort newSysmlPort, NotificationChain msgs) {
		FlowPort oldSysmlPort = sysmlPort;
		sysmlPort = newSysmlPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.PORT__SYSML_PORT, oldSysmlPort, newSysmlPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysmlPort(FlowPort newSysmlPort) {
		if (newSysmlPort != sysmlPort) {
			NotificationChain msgs = null;
			if (sysmlPort != null)
				msgs = ((InternalEObject)sysmlPort).eInverseRemove(this, SysMLPackage.FLOW_PORT__BASE_PORT, FlowPort.class, msgs);
			if (newSysmlPort != null)
				msgs = ((InternalEObject)newSysmlPort).eInverseAdd(this, SysMLPackage.FLOW_PORT__BASE_PORT, FlowPort.class, msgs);
			msgs = basicSetSysmlPort(newSysmlPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.PORT__SYSML_PORT, newSysmlPort, newSysmlPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralInteger> getLowerValue() {
		if (lowerValue == null) {
			lowerValue = new EObjectContainmentEList<LiteralInteger>(LiteralInteger.class, this, UMLPackage.PORT__LOWER_VALUE);
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
			upperValue = new EObjectContainmentEList<LiteralInteger>(LiteralInteger.class, this, UMLPackage.PORT__UPPER_VALUE);
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PORT__AADL_PORT:
				if (aadlPort != null)
					msgs = ((InternalEObject)aadlPort).eInverseRemove(this, AADL_ElementsPackage.PORT__BASE_PORT, port.class, msgs);
				return basicSetAadlPort((port)otherEnd, msgs);
			case UMLPackage.PORT__SYSML_PORT:
				if (sysmlPort != null)
					msgs = ((InternalEObject)sysmlPort).eInverseRemove(this, SysMLPackage.FLOW_PORT__BASE_PORT, FlowPort.class, msgs);
				return basicSetSysmlPort((FlowPort)otherEnd, msgs);
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
			case UMLPackage.PORT__AADL_PORT:
				return basicSetAadlPort(null, msgs);
			case UMLPackage.PORT__SYSML_PORT:
				return basicSetSysmlPort(null, msgs);
			case UMLPackage.PORT__LOWER_VALUE:
				return ((InternalEList<?>)getLowerValue()).basicRemove(otherEnd, msgs);
			case UMLPackage.PORT__UPPER_VALUE:
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
			case UMLPackage.PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UMLPackage.PORT__AADL_PORT:
				if (resolve) return getAadlPort();
				return basicGetAadlPort();
			case UMLPackage.PORT__SYSML_PORT:
				if (resolve) return getSysmlPort();
				return basicGetSysmlPort();
			case UMLPackage.PORT__LOWER_VALUE:
				return getLowerValue();
			case UMLPackage.PORT__UPPER_VALUE:
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
			case UMLPackage.PORT__TYPE:
				setType((DifferentTypes)newValue);
				return;
			case UMLPackage.PORT__AADL_PORT:
				setAadlPort((port)newValue);
				return;
			case UMLPackage.PORT__SYSML_PORT:
				setSysmlPort((FlowPort)newValue);
				return;
			case UMLPackage.PORT__LOWER_VALUE:
				getLowerValue().clear();
				getLowerValue().addAll((Collection<? extends LiteralInteger>)newValue);
				return;
			case UMLPackage.PORT__UPPER_VALUE:
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
			case UMLPackage.PORT__TYPE:
				setType((DifferentTypes)null);
				return;
			case UMLPackage.PORT__AADL_PORT:
				setAadlPort((port)null);
				return;
			case UMLPackage.PORT__SYSML_PORT:
				setSysmlPort((FlowPort)null);
				return;
			case UMLPackage.PORT__LOWER_VALUE:
				getLowerValue().clear();
				return;
			case UMLPackage.PORT__UPPER_VALUE:
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
			case UMLPackage.PORT__TYPE:
				return type != null;
			case UMLPackage.PORT__AADL_PORT:
				return aadlPort != null;
			case UMLPackage.PORT__SYSML_PORT:
				return sysmlPort != null;
			case UMLPackage.PORT__LOWER_VALUE:
				return lowerValue != null && !lowerValue.isEmpty();
			case UMLPackage.PORT__UPPER_VALUE:
				return upperValue != null && !upperValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
