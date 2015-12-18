/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine;
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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getAadlData <em>Aadl Data</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getSysmlBlock <em>Sysml Block</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl#getBodyCondition <em>Body Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends DifferentTypesImpl implements com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class {
	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ownedPort;

	/**
	 * The cached value of the '{@link #getAadlData() <em>Aadl Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAadlData()
	 * @generated
	 * @ordered
	 */
	protected data aadlData;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected Realization implements_;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * The cached value of the '{@link #getSysmlBlock() <em>Sysml Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysmlBlock()
	 * @generated
	 * @ordered
	 */
	protected block sysmlBlock;

	/**
	 * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedBehavior;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class> ownedParameter;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> bodyCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UMLPackage.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<Port>(Port.class, this, UMLPackage.CLASS__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public data getAadlData() {
		if (aadlData != null && aadlData.eIsProxy()) {
			InternalEObject oldAadlData = (InternalEObject)aadlData;
			aadlData = (data)eResolveProxy(oldAadlData);
			if (aadlData != oldAadlData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.CLASS__AADL_DATA, oldAadlData, aadlData));
			}
		}
		return aadlData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public data basicGetAadlData() {
		return aadlData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAadlData(data newAadlData, NotificationChain msgs) {
		data oldAadlData = aadlData;
		aadlData = newAadlData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__AADL_DATA, oldAadlData, newAadlData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAadlData(data newAadlData) {
		if (newAadlData != aadlData) {
			NotificationChain msgs = null;
			if (aadlData != null)
				msgs = ((InternalEObject)aadlData).eInverseRemove(this, AADL_ElementsPackage.DATA__BASE_CLASS, data.class, msgs);
			if (newAadlData != null)
				msgs = ((InternalEObject)newAadlData).eInverseAdd(this, AADL_ElementsPackage.DATA__BASE_CLASS, data.class, msgs);
			msgs = basicSetAadlData(newAadlData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__AADL_DATA, newAadlData, newAadlData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (Realization)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.CLASS__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(Realization newImplements, NotificationChain msgs) {
		Realization oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__IMPLEMENTS, oldImplements, newImplements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(Realization newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject)implements_).eInverseRemove(this, UMLPackage.REALIZATION__CLIENT, Realization.class, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject)newImplements).eInverseAdd(this, UMLPackage.REALIZATION__CLIENT, Realization.class, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__IMPLEMENTS, newImplements, newImplements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, UMLPackage.CLASS__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public block getSysmlBlock() {
		if (sysmlBlock != null && sysmlBlock.eIsProxy()) {
			InternalEObject oldSysmlBlock = (InternalEObject)sysmlBlock;
			sysmlBlock = (block)eResolveProxy(oldSysmlBlock);
			if (sysmlBlock != oldSysmlBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.CLASS__SYSML_BLOCK, oldSysmlBlock, sysmlBlock));
			}
		}
		return sysmlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public block basicGetSysmlBlock() {
		return sysmlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSysmlBlock(block newSysmlBlock, NotificationChain msgs) {
		block oldSysmlBlock = sysmlBlock;
		sysmlBlock = newSysmlBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__SYSML_BLOCK, oldSysmlBlock, newSysmlBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysmlBlock(block newSysmlBlock) {
		if (newSysmlBlock != sysmlBlock) {
			NotificationChain msgs = null;
			if (sysmlBlock != null)
				msgs = ((InternalEObject)sysmlBlock).eInverseRemove(this, SysMLPackage.BLOCK__BASE_CLASS, block.class, msgs);
			if (newSysmlBlock != null)
				msgs = ((InternalEObject)newSysmlBlock).eInverseAdd(this, SysMLPackage.BLOCK__BASE_CLASS, block.class, msgs);
			msgs = basicSetSysmlBlock(newSysmlBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.CLASS__SYSML_BLOCK, newSysmlBlock, newSysmlBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, UMLPackage.CLASS__OWNED_BEHAVIOR);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentEList<Constraint>(Constraint.class, this, UMLPackage.CLASS__OWNED_RULE);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class>(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, this, UMLPackage.CLASS__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getBodyCondition() {
		if (bodyCondition == null) {
			bodyCondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UMLPackage.CLASS__BODY_CONDITION);
		}
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASS__AADL_DATA:
				if (aadlData != null)
					msgs = ((InternalEObject)aadlData).eInverseRemove(this, AADL_ElementsPackage.DATA__BASE_CLASS, data.class, msgs);
				return basicSetAadlData((data)otherEnd, msgs);
			case UMLPackage.CLASS__IMPLEMENTS:
				if (implements_ != null)
					msgs = ((InternalEObject)implements_).eInverseRemove(this, UMLPackage.REALIZATION__CLIENT, Realization.class, msgs);
				return basicSetImplements((Realization)otherEnd, msgs);
			case UMLPackage.CLASS__SYSML_BLOCK:
				if (sysmlBlock != null)
					msgs = ((InternalEObject)sysmlBlock).eInverseRemove(this, SysMLPackage.BLOCK__BASE_CLASS, block.class, msgs);
				return basicSetSysmlBlock((block)otherEnd, msgs);
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
			case UMLPackage.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__AADL_DATA:
				return basicSetAadlData(null, msgs);
			case UMLPackage.CLASS__IMPLEMENTS:
				return basicSetImplements(null, msgs);
			case UMLPackage.CLASS__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__SYSML_BLOCK:
				return basicSetSysmlBlock(null, msgs);
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case UMLPackage.CLASS__BODY_CONDITION:
				return ((InternalEList<?>)getBodyCondition()).basicRemove(otherEnd, msgs);
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
			case UMLPackage.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UMLPackage.CLASS__OWNED_PORT:
				return getOwnedPort();
			case UMLPackage.CLASS__AADL_DATA:
				if (resolve) return getAadlData();
				return basicGetAadlData();
			case UMLPackage.CLASS__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case UMLPackage.CLASS__OWNED_CONNECTOR:
				return getOwnedConnector();
			case UMLPackage.CLASS__SYSML_BLOCK:
				if (resolve) return getSysmlBlock();
				return basicGetSysmlBlock();
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case UMLPackage.CLASS__OWNED_RULE:
				return getOwnedRule();
			case UMLPackage.CLASS__OWNED_PARAMETER:
				return getOwnedParameter();
			case UMLPackage.CLASS__BODY_CONDITION:
				return getBodyCondition();
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
			case UMLPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UMLPackage.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case UMLPackage.CLASS__AADL_DATA:
				setAadlData((data)newValue);
				return;
			case UMLPackage.CLASS__IMPLEMENTS:
				setImplements((Realization)newValue);
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UMLPackage.CLASS__SYSML_BLOCK:
				setSysmlBlock((block)newValue);
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case UMLPackage.CLASS__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UMLPackage.CLASS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class>)newValue);
				return;
			case UMLPackage.CLASS__BODY_CONDITION:
				getBodyCondition().clear();
				getBodyCondition().addAll((Collection<? extends Constraint>)newValue);
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
			case UMLPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UMLPackage.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case UMLPackage.CLASS__AADL_DATA:
				setAadlData((data)null);
				return;
			case UMLPackage.CLASS__IMPLEMENTS:
				setImplements((Realization)null);
				return;
			case UMLPackage.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case UMLPackage.CLASS__SYSML_BLOCK:
				setSysmlBlock((block)null);
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case UMLPackage.CLASS__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case UMLPackage.CLASS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UMLPackage.CLASS__BODY_CONDITION:
				getBodyCondition().clear();
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
			case UMLPackage.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.CLASS__AADL_DATA:
				return aadlData != null;
			case UMLPackage.CLASS__IMPLEMENTS:
				return implements_ != null;
			case UMLPackage.CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.CLASS__SYSML_BLOCK:
				return sysmlBlock != null;
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.CLASS__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.CLASS__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.CLASS__BODY_CONDITION:
				return bodyCondition != null && !bodyCondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
