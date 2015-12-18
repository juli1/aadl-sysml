/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPackage_PackagedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getPackagedElement();

} // Package
