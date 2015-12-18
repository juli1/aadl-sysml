/*
Copyright (c) 2015, Rockwell Collins.
Developed with the sponsorship of Defense Advanced Research Projects Agency (DARPA).

Permission is hereby granted, free of charge, to any person obtaining a copy of this data, 
including any software or models in source or binary form, as well as any drawings, specifications, 
and documentation (collectively "the Data"), to deal in the Data without restriction, including
without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
and/or sell copies of the Data, and to permit persons to whom the Data is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or 
substantial portions of the Data.

THE DATA IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS, SPONSORS, DEVELOPERS, CONTRIBUTORS, OR COPYRIGHT HOLDERS BE LIABLE 
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE DATA OR THE USE OR OTHER DEALINGS IN THE DATA.
*/
package com.rockwellcollins.atc.sysml2aadl;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;


public class EAImportResourceSet extends ResourceSetImpl {
	public EAImportResourceSet() {
		super();

		getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		
		getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		
		getPackageRegistry().put("http://schema.omg.org/spec/UML/2.1/", UMLPackage.eINSTANCE);
		getPackageRegistry().put("http://schema.omg.org/spec/UML/2.1.1/", UMLPackage.eINSTANCE);
		
		ignoreNamespace("http://schema.omg.org/spec/XMI/2.1");
		ignoreNamespace("http://www.sparxsystems.com/profiles/thecustomprofile/1.0");
		ignoreNamespace("http://www.sparxsystems.com/profiles/AADL_Elements/0.1");
	//	ignoreNamespace("http://www.omg.org/spec/SysML/20120322/SysML");
	}

	private void ignoreNamespace(String ns) {
		getPackageRegistry().put(ns, EcoreFactory.eINSTANCE.createEPackage());
	}
}
