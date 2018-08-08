package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;

public class OrderRequest {

    private Costumer costumer;
    private PaymentId paymentId;

    public OrderRequest(Costumer costumer, PaymentId paymentId) {
        this.costumer = costumer;
        this.paymentId = paymentId;
    }

    public Costumer getCostumer() {
        return costumer;
    }
    public PaymentId getPaymentId() {
        return paymentId;
    }
}
