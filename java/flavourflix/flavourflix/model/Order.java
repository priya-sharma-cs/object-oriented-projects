package com.flavourflix.model;

import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<FoodItem> items;
    private double totalAmount;

    public Order(int orderId, User user, List<FoodItem> items) {
        this.orderId = orderId;
        this.user = user;
        this.items = items;
        calculateTotal();
    }

    private void calculateTotal() {
        for (FoodItem item : items) {
            totalAmount += item.getPrice();
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
