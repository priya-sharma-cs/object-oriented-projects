package models;

public class Gmail extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Gmail as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Gmail");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing Gmail inbox for " + username);
    }

    public void sendEmail(String to, String subject) {
        System.out.println("Email sent to " + to + " with subject " + subject);
    }
}
