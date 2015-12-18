/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRegion_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getRegion_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Region
