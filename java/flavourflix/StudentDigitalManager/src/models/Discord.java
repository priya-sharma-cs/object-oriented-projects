package models;

public class Discord extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Discord as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Discord");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing Discord channels for " + username);
    }

    public void joinServer(String serverName) {
        System.out.println("Joined Discord server: " + serverName);
    }
}
