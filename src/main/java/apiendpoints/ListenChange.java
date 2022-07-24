package apiendpoints;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.Change;
import com.google.api.services.drive.model.ChangeList;
import com.google.api.services.drive.model.StartPageToken;

import java.io.IOException;
import java.util.ArrayList;

/* Class to demonstrate use-case of change on a file or shared drive. */
public class ListenChange {
    public static void fetchChanges(Drive service) throws IOException {
        int n = 10;
        StartPageToken response = service.changes().getStartPageToken().execute();
        // [END fetchStartPageToken]
        String savedStartPageToken = response.getStartPageToken();
        String pageToken = savedStartPageToken;
        int eventCounter = 0;
        while (true) {
            //System.out.println("Start token: " + response.getStartPageToken());
            ChangeList changes = service.changes().list(pageToken).execute();
            ArrayList<Change> changeStore = new ArrayList<>();
            for (Change change : changes.getChanges()) {
                // Process change
                System.out.printf("Change found for file/folder: (%s), ChangeTime: %s \n", change.getFileId(), change.getTime());
                eventCounter++;
                changeStore.add(change);
            }
            if (changes.getNewStartPageToken() != null) {
                // Last page, save this token for the next polling interval
                savedStartPageToken = changes.getNewStartPageToken();
            }
            pageToken = changes.getNextPageToken();
            if (pageToken == null) {
                pageToken = savedStartPageToken;
            }

            //check events occurred to get processed
            if (eventCounter == n) {
                //store into the file
                //writeToJson(changes);
                n = n * 10;
            }
        }

//        String fileId = "1EY-a3D2ZbrBmtmCGUPMZfp9gg8pLxoplVGZ_ub2j3hY";
//        OutputStream outputStream = new ByteArrayOutputStream();
//        service.files().export(fileId, "text/plain")
//                .executeMediaAndDownloadTo(outputStream);
//        System.out.printf("file : "+ outputStream.toString());
    }

//    public static void writeToJson(ChangeList change) {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(new File("FileStore/change.json"), change);
//    }
}
