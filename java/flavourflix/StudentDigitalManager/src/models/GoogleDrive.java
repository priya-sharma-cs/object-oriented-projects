package models;

public class GoogleDrive extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Google Drive as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Google Drive");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing Drive files for " + username);
    }

    public void uploadFile(String fileName) {
        System.out.println("Uploaded file: " + fileName);
    }
}
