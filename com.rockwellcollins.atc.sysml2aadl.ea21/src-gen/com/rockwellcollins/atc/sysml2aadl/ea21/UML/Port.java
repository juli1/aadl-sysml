/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getType <em>Type</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort <em>Aadl Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getSysmlPort <em>Sysml Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DifferentTypes)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort_Type()
	 * @model
	 * @generated
	 */
	DifferentTypes getType();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DifferentTypes value);

	/**
	 * Returns the value of the '<em><b>Aadl Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aadl Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aadl Port</em>' reference.
	 * @see #setAadlPort(port)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort_AadlPort()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port
	 * @model opposite="base_Port"
	 * @generated
	 */
	port getAadlPort();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort <em>Aadl Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aadl Port</em>' reference.
	 * @see #getAadlPort()
	 * @generated
	 */
	void setAadlPort(port value);

	/**
	 * Returns the value of the '<em><b>Sysml Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sysml Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sysml Port</em>' reference.
	 * @see #setSysmlPort(FlowPort)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort_SysmlPort()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getBase_Port
	 * @model opposite="base_Port"
	 * @generated
	 */
	FlowPort getSysmlPort();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getSysmlPort <em>Sysml Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sysml Port</em>' reference.
	 * @see #getSysmlPort()
	 * @generated
	 */
	void setSysmlPort(FlowPort value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralInteger> getLowerValue();

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPort_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralInteger> getUpperValue();

} // Port
