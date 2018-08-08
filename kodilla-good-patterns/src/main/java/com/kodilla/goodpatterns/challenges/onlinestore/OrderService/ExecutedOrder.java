package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;

public class ExecutedOrder implements OrderService {

    @Override
    public boolean createOrder(Costumer costumer, PaymentId paymentId) {

        System.out.println("Order was created for " + costumer.getName() + " " + costumer.getSurname());
        return true;
    }
}
