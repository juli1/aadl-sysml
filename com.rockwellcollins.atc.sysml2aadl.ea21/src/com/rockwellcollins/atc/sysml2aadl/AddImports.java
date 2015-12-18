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

import java.util.ArrayList;

import java.util.List;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.Subcomponent;

import org.osate.aadl2.parsesupport.AObject;


/*
 * Adding packages imported within the primary AADL package
 */

public class AddImports {
	public static void packageList(List<AadlPackage> pkgs) {
		
		for (AadlPackage pkg : pkgs) {
				new AddImports(pkg).add();
			
		}
	}
	
	private final AadlPackage pkg;
	ArrayList<String> propertySetName = new ArrayList<>();
	//boolean addProperty = true;

	public AddImports(AadlPackage pkg) {
		this.pkg = pkg;
		
		}
	
/*
 * Imports packages based on parsing the Dataport, Subcomponents and property associations within a package that calls an external package
 */
	private void add() {
		
		for (DataPort dp : EcoreUtil2.getAllContentsOfType(pkg, DataPort.class)) {
			addImport(dp.getDataFeatureClassifier());
			
		}
		for (Subcomponent sc : EcoreUtil2.getAllContentsOfType(pkg, Subcomponent.class)) {
			addImport(sc.getSubcomponentType());
			
		}
		for(PropertyAssociation pa: EcoreUtil2.getAllContentsOfType(pkg, PropertyAssociation.class))
		{
			addImport(pa.getProperty());
		}
	
	}

	private void addImport(AObject ao) {
			 boolean addProperty = true;
		if (ao instanceof Property)
			{
				ModelUnit propertySetObject = (ModelUnit)ao.eContainer();
				String propertySetObjectName = propertySetObject.getName();
				if (propertySetName.size()!=0)
				{
					if(propertySetName.contains(propertySetObjectName))
					{
							addProperty = false;
					}
				
				}
				
				if(propertySetObjectName.contains("Communication_Properties"))
				{
					addProperty = false;
				}
									
				if(addProperty)
				{
					pkg.getOwnedPublicSection().getImportedUnits().add(propertySetObject);
					propertySetName.add(propertySetObjectName);
					
				}
			} else
			{
				
				AadlPackage other = EcoreUtil2.getContainerOfType(ao, AadlPackage.class);
				
				if(other!=null && other!=pkg)
				{
					pkg.getOwnedPublicSection().getImportedUnits().add(other);
				}
			}
	}
}
