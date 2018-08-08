package com.kodilla.goodpatterns.challenges.onlinestore.ConfirmationService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;

public interface OrderConfirmationService {

    void sendTo(Costumer costumer);
}
