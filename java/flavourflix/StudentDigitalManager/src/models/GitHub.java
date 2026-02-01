package models;

public class GitHub extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to GitHub as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from GitHub");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing GitHub profile: " + username);
    }

    public void createRepo(String repoName) {
        System.out.println("Created repository: " + repoName);
    }
}
