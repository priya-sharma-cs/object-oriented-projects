package com.flavourflix.service;

import com.flavourflix.model.Order;
import com.flavourflix.payment.Payment;

public class OrderService {

    public void placeOrder(Order order, Payment payment) {
        System.out.println("Order placed successfully!");
        payment.pay(order.getTotalAmount());
    }
}
