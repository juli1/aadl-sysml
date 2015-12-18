/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.*;

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
public class AADL_ElementsFactoryImpl extends EFactoryImpl implements AADL_ElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AADL_ElementsFactory init() {
		try {
			AADL_ElementsFactory theAADL_ElementsFactory = (AADL_ElementsFactory)EPackage.Registry.INSTANCE.getEFactory(AADL_ElementsPackage.eNS_URI);
			if (theAADL_ElementsFactory != null) {
				return theAADL_ElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AADL_ElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AADL_ElementsFactoryImpl() {
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
			case AADL_ElementsPackage.PORT: return createport();
			case AADL_ElementsPackage.DATA: return createdata();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port createport() {
		portImpl port = new portImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public data createdata() {
		dataImpl data = new dataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AADL_ElementsPackage getAADL_ElementsPackage() {
		return (AADL_ElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AADL_ElementsPackage getPackage() {
		return AADL_ElementsPackage.eINSTANCE;
	}

} //AADL_ElementsFactoryImpl
