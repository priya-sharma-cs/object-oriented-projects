package models;

public class Instagram extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Instagram as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Instagram");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing Instagram profile: " + username);
    }
}
