package org.camunda.bpm.why;



import java.io.IOException;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.CreateFolderErrorException;
import com.dropbox.core.v2.files.FolderMetadata;




public class Dropbox {
	private static final String ACCESS_TOKEN = "AI8MmuOd6mAAAAAAAAAFjpR1FXTwtHdod-LEJ9my3egTihh0rot8EXcXmtev-qUl";

	public static void dropBox(String folderName) throws  DbxException, IOException{

	

        // Create Dropbox client
        DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Get current account info
        //FullAccount account = client.users().getCurrentAccount();
        //System.out.println(account.getName().getDisplayName());
        
        try{
            //String folderName="/testfolder";
			FolderMetadata folder = client.files().createFolder(folderName);
            System.out.println(folder.getName());
        } catch (CreateFolderErrorException err) {
            if (err.errorValue.isPath() && err.errorValue.getPathValue().isConflict()) {
                System.out.println("Something already exists at the path.");
            } else {
                System.out.print("Some other CreateFolderErrorException occurred...");
                System.out.print(err.toString());
            }
        } catch (Exception err) {
            System.out.print("Some other Exception occurred...");
            System.out.print(err.toString());
        }
    
     }
	}
	
