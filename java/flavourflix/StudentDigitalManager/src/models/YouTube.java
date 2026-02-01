package models;

public class YouTube extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to YouTube as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from YouTube");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing YouTube channel of " + username);
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Uploaded video: " + videoTitle);
    }
}
