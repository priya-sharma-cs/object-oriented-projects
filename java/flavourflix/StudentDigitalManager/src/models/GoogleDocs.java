package models;

public class GoogleDocs extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Google Docs as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Google Docs");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing documents for " + username);
    }

    public void createDocument(String docName) {
        System.out.println("Document created: " + docName);
    }
}
