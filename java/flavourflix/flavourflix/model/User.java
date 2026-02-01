package com.flavourflix.model;

public class User {
    private int userId;
    private String name;
    private String phone;

    public User(int userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
