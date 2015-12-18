/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#getport()
 * @model
 * @generated
 */
public interface port extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#getport_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort <em>Aadl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#getport_Base_Port()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort
	 * @model opposite="aadlPort"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

} // port
