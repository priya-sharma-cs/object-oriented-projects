package models;

public class LinkedIn extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to LinkedIn as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from LinkedIn");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing LinkedIn profile: " + username);
    }

    public void sendConnectionRequest(String person) {
        System.out.println("Sent connection request to " + person);
    }
}
