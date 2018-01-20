package org.camunda.bpm.why;


import com.dropbox.core.DbxException;
import java.io.IOException;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.CreateFolderErrorException;
import com.dropbox.core.v2.files.FolderMetadata;
import java.util.Collections;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;




import com.dropbox.core.DbxException;




public class RepositoryErstellen implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");


    public void execute(DelegateExecution execution) throws Exception {

    	main(null);
		 
	  }
	
	public static void main(String[] args) throws  DbxException, IOException{
		Dropbox.dropBox(args);
		
	}
	
	        

}

