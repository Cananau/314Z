package org.camunda.bpm.why;


import com.dropbox.core.DbxException;
import java.io.IOException;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;






public class RepositoryErstellen implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");


    public void execute(DelegateExecution execution) throws Exception {
		  String kundeid = (String) execution.getVariable("kundeid");
		  String anderung = (String) execution.getVariable("anderung");
		  String email = (String) execution.getVariable("email");


		  
    	main("/"+anderung+kundeid+email);
		 
	  }
	
	public static void main(String folderName) throws  DbxException, IOException{
		Dropbox.dropBox(folderName);

	}
	
	        

}

