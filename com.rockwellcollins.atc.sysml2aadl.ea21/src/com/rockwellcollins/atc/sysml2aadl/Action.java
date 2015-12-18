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

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class Action implements IWorkbenchWindowActionDelegate {
	public IWorkbenchWindow workbenchWindow;
	private Logger log;
	
	
	@Override
	public void init(IWorkbenchWindow workbenchWindow) {
		this.workbenchWindow = workbenchWindow;
		this.log = new Logger(Logger.WARN, "AADL Importer", workbenchWindow);
	}

	@Override
	public void run(IAction action) {
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}

	public final WorkspaceJob job = new WorkspaceJob("Enterprise Architect Import") {
		@Override
		public IStatus runInWorkspace(IProgressMonitor mon) {
			mon.beginTask("Importing from Enterprise Architect XMI 2.1", IProgressMonitor.UNKNOWN);
			String fileName = getInputFilename();
			
			if (fileName == null) {
				return Status.CANCEL_STATUS;
			}
			/*String outputDirectory = getOutputLocation();
			if (outputDirectory == null) {
				return Status.CANCEL_STATUS;
			}*/
			
			
			String contractsFileName;
			if(findLocationOfContracts(fileName)== null)
			{
				mon.beginTask("Importing Contracts", IProgressMonitor.UNKNOWN);
				 contractsFileName =findFolderLocationOfContracts(getContractsFilename());
				if (contractsFileName == null) {
					int intbackslashindex = fileName.lastIndexOf("\\");
					String pathName = fileName.substring(0, intbackslashindex);
					String filePathName = pathName + "\\contracts";
					contractsFileName = filePathName;		
					//return Status.CANCEL_STATUS;
				}
				//doImport(fileName, contractsFileName, outputDirectory);
				doImport(fileName, contractsFileName);
			} else
			{
				contractsFileName = findLocationOfContracts(fileName);
				//doImport(fileName, contractsFileName , outputDirectory);
				doImport(fileName, contractsFileName);
			}
			
			

			return Status.OK_STATUS;
		}
	};
	
	public String findLocationOfContracts(String filePath)
	{
		int intbackslashindex = filePath.lastIndexOf("\\");
		String pathName = filePath.substring(0, intbackslashindex);
		String filePathName = pathName + "\\contracts";
		
		File f = new File(filePathName);
		System.out.println(filePathName);
		  if(f.exists()){ 
			   System.out.println("Contracts folder exists at the same location as the xmi!");
			   return filePathName;
		  }else{
			   //prompt user for location
			  System.out.println("Contracts folder location needs to be specified");
			  return null;
		  }
	}
	
	public String findFolderLocationOfContracts(String filePath)
	{
		if (filePath == null)
		{
			return null;
		}
		int intbackslashindex = filePath.lastIndexOf("\\");
		String pathName = filePath.substring(0, intbackslashindex);
		String filePathName = pathName;
		return filePathName;	
	}
	
	

	public String getInputFilename() {
		return getFilename("*.xml");
	}

	public String getContractsFilename() {
		return getFilename("*.txt");
	}

	private String getFilename(String extension) {
		String[] result = { null };
		workbenchWindow.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				final FileDialog fd = new FileDialog(workbenchWindow.getShell());
				fd.setFilterExtensions(new String[] { extension });
				result[0] = fd.open();
			}
		});
		return result[0];
	}

	private void doImport(String fileName, String contractsFilename) {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("org.osate.aadl2.ModelEditingDomain");
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				try {
					new Importer(log).main(fileName, contractsFilename);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void dispose() {
	}
}
