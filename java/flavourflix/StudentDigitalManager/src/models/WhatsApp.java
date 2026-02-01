package models;

public class WhatsApp extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to WhatsApp as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from WhatsApp");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing WhatsApp messages for " + username);
    }

    public void sendMessage(String to, String message) {
        System.out.println("Sent message to " + to + ": " + message);
    }
}
