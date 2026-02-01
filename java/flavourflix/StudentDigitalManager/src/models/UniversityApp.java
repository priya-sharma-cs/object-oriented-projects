package models;

public class UniversityApp extends Platform {
    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Logged in to University App as " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from University App");
    }

    @Override
    public void viewInfo() {
        System.out.println("Viewing courses, assignments, and grades for " + username);
    }
}
