package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;

public class OrderDto {

    private Costumer costumer;
    private PaymentId paymentId;
    private boolean isOrdered;
    private boolean isPaid;

    public OrderDto(final Costumer costumer, final PaymentId paymentId, boolean isOrdered, boolean isPaid) {
        this.paymentId = paymentId;
        this.costumer = costumer;
        this.isOrdered = isOrdered;
        this.isPaid = isPaid;
    }

    public Costumer getCostumer() {
        return costumer;
    }
    public PaymentId getPaymentId() {
        return paymentId;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
    public boolean isPaid() {
        return isPaid;
    }
}
