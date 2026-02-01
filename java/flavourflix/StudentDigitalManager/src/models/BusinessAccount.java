package models;

public class BusinessAccount extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to Business Account as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Business Account");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing business workspace for " + username);
    }

    public void sendWorkspaceMessage(String message) {
        System.out.println("Sent message to workspace: " + message);
    }
}
