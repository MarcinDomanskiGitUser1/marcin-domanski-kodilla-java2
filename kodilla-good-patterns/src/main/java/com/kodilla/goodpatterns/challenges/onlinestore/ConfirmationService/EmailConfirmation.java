package com.kodilla.goodpatterns.challenges.onlinestore.ConfirmationService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;

public class EmailConfirmation implements OrderConfirmationService {

    @Override
    public void sendTo(Costumer costumer) {

        System.out.println("Email with confirmation send to " + costumer.geteMail());
    }
}
