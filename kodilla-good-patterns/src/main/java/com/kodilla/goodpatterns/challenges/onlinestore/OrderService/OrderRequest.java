package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;
import com.kodilla.goodpatterns.challenges.onlinestore.Product;

import java.util.List;

public class OrderRequest {

    private Costumer costumer;
    private PaymentId paymentId;
    private List<Product> orderedProducts;

    public OrderRequest(Costumer costumer, PaymentId paymentId, List<Product> orderedProducts) {
        this.costumer = costumer;
        this.paymentId = paymentId;
        this.orderedProducts = orderedProducts;
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
}
