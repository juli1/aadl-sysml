/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#getdata()
 * @model
 * @generated
 */
public interface data extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getAadlData <em>Aadl Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#getdata_Base_Class()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getAadlData
	 * @model opposite="aadlData"
	 * @generated
	 */
	com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getBase_Class();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class value);

} // data
