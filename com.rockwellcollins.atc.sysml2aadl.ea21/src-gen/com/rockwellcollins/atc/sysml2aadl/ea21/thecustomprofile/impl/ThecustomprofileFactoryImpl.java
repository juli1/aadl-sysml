/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThecustomprofileFactoryImpl extends EFactoryImpl implements ThecustomprofileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThecustomprofileFactory init() {
		try {
			ThecustomprofileFactory theThecustomprofileFactory = (ThecustomprofileFactory)EPackage.Registry.INSTANCE.getEFactory(ThecustomprofilePackage.eNS_URI);
			if (theThecustomprofileFactory != null) {
				return theThecustomprofileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThecustomprofileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecustomprofileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThecustomprofilePackage.AADL_PROPERTY: return createAADL__Property();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AADL__Property createAADL__Property() {
		AADL__PropertyImpl aadL__Property = new AADL__PropertyImpl();
		return aadL__Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecustomprofilePackage getThecustomprofilePackage() {
		return (ThecustomprofilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThecustomprofilePackage getPackage() {
		return ThecustomprofilePackage.eINSTANCE;
	}

} //ThecustomprofileFactoryImpl
