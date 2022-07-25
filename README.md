# Oslash Integration Assignment

Setting up connectivity to Google Drive APIs to achieve the following:

- Fetch all documents currently existing 
- Listen for changes on a particular Google Drive folder (Currently Listens on all files/folders in the Drive)
- Writes into ChangeList any changes taht have occurred in the file or folder 
- Writes into a json file every 'n' batch size


## Run Locally

Clone the project

```bash
  git clone https://github.com/beheraamrita/oslash-integration.git
```

Go to the project directory

```bash
  cd oslash-integration
```

Follow the prerequisites for accessing Google Drive APIs. Find details in the following

```bash
  https://developers.google.com/drive/api/quickstart/java
```

Once the gradle is set up and the credential.json file is generated as mentioned in steps 2 and 4 respectively.
Replace the
```bash
  src/main/resources/credential.json
```
with the generated credential file.


On the cmd prompt
```bash
  gradle run
```

## Current Set Up
The current set up is for 
```bash
  DriveScopes.DRIVE_METADATA_READONLY 
```
which gives you scope for View and manage metadata of files in your Google Drive.

If the files have to be downloaded the scope needs to be modified to
```bash
  DriveScopes.DRIVE_FILE or DriveScopes.DRIVE
```
which gives you scope for See, edit, create, and delete only the specific Google Drive files you use with this app.


## TO DO
- Improve the functionality to read the file and write the metadata into the json 
- parallel processing of the data 
- Unit test cases 