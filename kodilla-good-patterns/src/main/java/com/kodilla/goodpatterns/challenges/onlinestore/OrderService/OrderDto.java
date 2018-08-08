package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;
import com.kodilla.goodpatterns.challenges.onlinestore.Product;

import java.util.List;

public class OrderDto {

    private Costumer costumer;
    private PaymentId paymentId;
    private List<Product> orderedProducts;
    private boolean isOrdered;
    private boolean isPaid;

    public OrderDto(final Costumer costumer, final PaymentId paymentId, final List<Product> orderedProducts, boolean isOrdered, boolean isPaid) {
        this.paymentId = paymentId;
        this.costumer = costumer;
        this.orderedProducts = orderedProducts;
        this.isOrdered = isOrdered;
        this.isPaid = isPaid;
    }

    public Costumer getCostumer() {
        return costumer;
    }
    public PaymentId getPaymentId() {
        return paymentId;
    }
    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
    public boolean isPaid() {
        return isPaid;
    }
}
