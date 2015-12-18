/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRealization()
 * @model
 * @generated
 */
public interface Realization extends Element {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRealization_Supplier()
	 * @model
	 * @generated
	 */
	com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getSupplier();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRealization_Client()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getClient();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class value);

} // Realization
