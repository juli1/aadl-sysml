/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage
 * @generated
 */
public interface ThecustomprofileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThecustomprofileFactory eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.ThecustomprofileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AADL Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AADL Property</em>'.
	 * @generated
	 */
	AADL__Property createAADL__Property();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThecustomprofilePackage getThecustomprofilePackage();

} //ThecustomprofileFactory
