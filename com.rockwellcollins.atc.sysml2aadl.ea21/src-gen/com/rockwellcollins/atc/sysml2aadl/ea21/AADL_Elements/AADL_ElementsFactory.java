/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage
 * @generated
 */
public interface AADL_ElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AADL_ElementsFactory eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>port</em>'.
	 * @generated
	 */
	port createport();

	/**
	 * Returns a new object of class '<em>data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>data</em>'.
	 * @generated
	 */
	data createdata();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AADL_ElementsPackage getAADL_ElementsPackage();

} //AADL_ElementsFactory
