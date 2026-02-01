package com.flavourflix.main;

import com.flavourflix.model.*;
import com.flavourflix.payment.*;
import com.flavourflix.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        User user = new User(1, "Aisha", "9999999999");

        FoodItem pizza = new FoodItem(101, "Pizza", 250);
        FoodItem burger = new FoodItem(102, "Burger", 150);

        List<FoodItem> cart = new ArrayList<>();
        cart.add(pizza);
        cart.add(burger);

        Order order = new Order(5001, user, cart);

        Payment payment = new UPI(); // change to Card / Cash if you want

        OrderService service = new OrderService();
        service.placeOrder(order, payment);
    }
}
