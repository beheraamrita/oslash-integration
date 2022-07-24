package apiendpoints;

import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.services.drive.Drive;
import org.junit.Test;

import java.io.IOException;

public class TestSearchAll {

//    private Drive service = new Drive();
//
//    /**
//     * Creates a default authorization Drive client service.
//     *
//     * @return an authorized Drive client service
//     * @throws IOException - if credentials file not found.
//     */
//    protected Drive buildService() throws IOException {
//        /* Load pre-authorized user credentials from the environment.
//           TODO(developer) - See https://developers.google.com/identity for
//            guides on implementing OAuth2 for your application. */
//        GoogleClientSecrets credentials = getCredential();
//        HttpRequestInitializer requestInitializer = new HttpCredentialsAdapter(
//                credentials);
//
//        // Create the classroom API client
//        Drive service = new Drive.Builder(new NetHttpTransport(),
//                GsonFactory.getDefaultInstance(),
//                requestInitializer)
//                .setApplicationName("Drive Snippets")
//                .build();
//
//        return service;
//    }
//    @Test
//    public void searchFiles() throws IOException {
//        SearchAll.searchFilesAndFolders(service);
//    }
}
