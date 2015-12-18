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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.IllegalValueException;

import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.xtext.ui.XtextProjectHelper;

import org.osate.aadl2.AadlPackage;

import org.osate.aadl2.modelsupport.resources.PredeclaredProperties;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.core.AadlNature;
import org.osate.workspace.CoreUtility;
import org.osate.workspace.WorkspacePlugin;
import org.osate.xtext.aadl2.unparsing.AadlUnparser;


import com.rockwellcollins.atc.sysml2aadl.AadlCreator.MapVarSpec;
import com.rockwellcollins.atc.sysml2aadl.AadlCreator.WrapperAObject;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLFactory;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;
import com.rockwellcollins.atc.sysml2aadl.Logger;

public class Importer {
	private Logger log;
	String basePackageName;
		
	public Importer(Logger log) {
		this.log = log;
	}

	public void main(String inputFilename, String contractsFilename) throws IOException {
		Model model = loadModel(inputFilename);
		if (model != null) {
		List<AadlPackage> pkgs = convert(model, inputFilename, contractsFilename); // added contracts folder path
		saveAadl(pkgs, basePackageName);
		}
	}

	public String parseAndWriteModel(String inputFilename) throws IOException {
		Model model = loadModel(inputFilename);
		String outputFilename = removeXmlExtension(inputFilename) + "_output.xml";
		saveModel(model, outputFilename);
		return outputFilename;
	}

	private String removeXmlExtension(String name) {
		if (name.endsWith(".xml")) {
			return name.substring(0, name.length() - 4);
		} else {
			return name;
		}
	}

	private Model loadModel(String inputFilename) {
		ResourceSet set = new EAImportResourceSet();
		URI uri = URI.createFileURI(inputFilename);
		Model model = UMLFactory.eINSTANCE.createModel();
		try {
			Resource res = set.getResource(uri, true);
			model = (Model) EcoreUtil.getObjectByType(res.getContents(),
					UMLPackage.eINSTANCE.getModel());
			//EcoreUtil.resolveAll(set);
		} catch (Exception ure) {
			
			log.error("Exception: " + ure.toString());
			log.error("    " + ure.getMessage());
			log.error("    caused by: " + ure.getCause().getClass().getName());
			if (ure.getCause() instanceof org.eclipse.emf.ecore.xmi.IllegalValueException) {
				IllegalValueException ive = (IllegalValueException)ure.getCause();
				log.error("    value: " + ive.getValue().toString());
			}
		}
		if (model == null) {
			log.error("Unable to load model.  Aborting...");
		}

		return model;
	}
	

	
	private void saveModel(Model model, String outputFilename) throws IOException {
		ResourceSet set = new EAImportResourceSet();
		URI uri = URI.createFileURI(outputFilename);
		Resource res = set.createResource(uri);
		res.getContents().add(model);
		res.save(null);
	}

	private List<AadlPackage> convert(Model model, String inputFilename, String contractsFilename) {
		List<AadlPackage> pkgs = null;
		try{
		Package top = model.getPackagedElement().get(0);
		basePackageName = top.getName();
		AadlCreator creator = new AadlCreator(inputFilename, contractsFilename, log);
		top.eAllContents().forEachRemaining(creator::doSwitch);
		Map<Element, AObject> map = creator.getMap();
		Map<String, List<MapVarSpec>> mapVars = creator.getVarsMap();
		Map<String, String> mapContracts = creator.getContractsMap();
		Map<StateMachine, AObject>mapStateMachine = creator.getStateMachineMap();
		Map<Element, WrapperAObject> wrapperMap = creator.getWrapperMap();
		pkgs = getAadlPackages(map.values());
		AadlLinker linker = new AadlLinker(map, mapVars, mapContracts, mapStateMachine, log, wrapperMap); // passing aadl and contract info to the linker
		top.eAllContents().forEachRemaining(linker::doSwitch);
		AddImports.packageList(pkgs);
	
		} catch(Exception e)
		{
			log.error(e.getMessage());
		}
		return pkgs;
		
	}

	private List<AadlPackage> getAadlPackages(Collection<AObject> values) {
		List<AadlPackage> pkgs = new ArrayList<>();
		for (AObject ao : values) {
			if (ao instanceof AadlPackage) {
				
					pkgs.add((AadlPackage) ao);
				
			}
		}
		return pkgs;
	}

	private void saveAadl(List<AadlPackage> pkgs, String baseFilename) throws IOException {
		for (AadlPackage pkg : pkgs) {
			if (!pkg.getName().equals("Base_Types")) {
				savePackage(pkg, baseFilename);
			}
		}
	}
	
/////**** Adding directory structure*****/////
	private void savePackage(final AadlPackage ap, String projName) {
		try {
			IProject proj = getOrCreateProject(ap, projName);
			IFolder dir = proj.getFolder(WorkspacePlugin.DEFAULT_SOURCE_DIR);
			dir = dir.getFolder(WorkspacePlugin.AADL_PACKAGES_DIR);
			IFile file = dir.getFile(ap.getName().replaceAll("::", "/") + ".aadl");
			AadlUnparser.getAadlUnparser().doUnparseToFile(ap, file.getFullPath());
		} catch (Exception e) {
			log.error("Unable to save package for " + ap.getName());
			e.printStackTrace();
		}
	}

	// This is how OSATE creates new AADL projects, but the method they use
	// is not public so we've copied it here.
	private IProject getOrCreateProject(AadlPackage ap, String name) throws Exception {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(name);
		if (p.exists()) {
			return p;
		}
		p.create(null);
		p.open(null);

		IFolder defModDir = p.getFolder(WorkspacePlugin.DEFAULT_MODEL_DIR);
		IFolder xmlPack = defModDir
				.getFolder(WorkspacePlugin.AADL_PACKAGES_DIR);
		IFolder xmlPSet = defModDir
				.getFolder(WorkspacePlugin.PROPERTY_SETS_DIR);
		IFolder defSrcDir = p.getFolder(WorkspacePlugin.DEFAULT_SOURCE_DIR);
		IFolder srcPack = defSrcDir
				.getFolder(WorkspacePlugin.AADL_PACKAGES_DIR);
		IFolder srcPSet = defSrcDir
				.getFolder(WorkspacePlugin.PROPERTY_SETS_DIR);

		try {
			CoreUtility.createFolder(xmlPack, true, true, null);
			CoreUtility.createFolder(xmlPSet, true, true, null);
			CoreUtility.createFolder(srcPack, true, true, null);
			CoreUtility.createFolder(srcPSet, true, true, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		String filepath = p.getFile(WorkspacePlugin.AADLPATH_FILENAME)
				.getRawLocation().toString();

		PreferenceStore ps = new PreferenceStore(filepath);
		ps.setValue(WorkspacePlugin.PROJECT_SOURCE_DIR,
				WorkspacePlugin.DEFAULT_SOURCE_DIR);
		ps.setValue(WorkspacePlugin.PROJECT_MODEL_DIR,
				WorkspacePlugin.DEFAULT_MODEL_DIR);
		ps.save();

		p.refreshLocal(1, null);
		AadlNature.addNature(p, null);
		addXtextNature(p);
		addPluginResourcesDependency(p);
		return p;
	}

	private void addXtextNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = XtextProjectHelper.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			log.warn("Unable to set Xtext nature on project");
			e.printStackTrace(System.err);
		}
	}

	private void addPluginResourcesDependency(IProject project) {
		PredeclaredProperties.initPluginContributedAadl();
		try {
			IProjectDescription description = project.getDescription();
			IProject[] references = description.getReferencedProjects();
			IProject[] newReferences = new IProject[references.length + 1];
			System.arraycopy(references, 0, newReferences, 0, references.length);
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject pluginProject = root
					.getProject(PredeclaredProperties.PLUGIN_RESOURCES_PROJECT_NAME);
			newReferences[references.length] = pluginProject;
			description.setReferencedProjects(newReferences);
			project.setDescription(description, null);
		} catch (CoreException e) {
			log.warn("Unable to set Plugin_Resources as dependency");
			e.printStackTrace(System.err);
		}
	}
}
