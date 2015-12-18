/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.SysML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage
 * @generated
 */
public interface SysMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysMLFactory eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>block</em>'.
	 * @generated
	 */
	block createblock();

	/**
	 * Returns a new object of class '<em>Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Port</em>'.
	 * @generated
	 */
	FlowPort createFlowPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SysMLPackage getSysMLPackage();

} //SysMLFactory
