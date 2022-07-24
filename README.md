# Oslash Integration Assignment

Setting up connectivity to Google Drive APIs to achieve the following:

1. Fetch all documents currently existing
2. Listen for changes on a particular Google Drive folder (Currently Listens on all files/folders in the Drive)
3. Writes into ChangeList any changes taht have occurred in the file or folder
4. Writes into a json file every 'n' batch size


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
