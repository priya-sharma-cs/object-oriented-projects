package models;

public abstract class Platform {
    protected String username;
    protected String password;

    public abstract void login(String username, String password);
    public abstract void logout();
    public abstract void viewInfo();
}
