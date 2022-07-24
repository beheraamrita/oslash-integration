package apiendpoints;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

import java.io.IOException;
import java.util.List;

/* Class to demonstrate use-case of search files. */
public class SearchAll {
    //Method used to search for files and folders in the Drive
    public static void searchFilesAndFolders(Drive service) throws IOException {
        FileList result = service.files().list()
                //.setQ("mimeType = 'application/vnd.google-apps.folder'") //can be used to filter out folders
                .setPageSize(1000)  //limiting to 1000 for now, can be remove to look for all files
                //.setFields("nextPageToken, files(id, name, description, starred, modifiedTime)") // Added additional fields to fetch the values
                .execute();
        List<File> files = result.getFiles();
        if (files == null || files.isEmpty()) {
            System.out.println("No files or folders found.");
        } else {
            System.out.println("***** Files or Folders:  ********");
            for (File file : files) {
                //System.out.printf("compleet" + file);
                System.out.printf("[Name]: %s, \t [File Id]: (%s), \t [Created Time]: %s \n", file.getName(), file.getId(), file.getDescription(), file.getCreatedTime());
            }
        }
    }
}
// [END drive_search_files]