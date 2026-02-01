package models;

public class TechNewsApp extends Platform {
    @Override
    public void login(String username, String password) {
        System.out.println("Tech news app does not require login.");
    }

    @Override
    public void logout() {
        System.out.println("No logout required for TechNewsApp.");
    }

    @Override
    public void viewInfo() {
        System.out.println("Displaying latest tech news...");
    }

    public void readArticle(String title) {
        System.out.println("Reading article: " + title);
    }
}
