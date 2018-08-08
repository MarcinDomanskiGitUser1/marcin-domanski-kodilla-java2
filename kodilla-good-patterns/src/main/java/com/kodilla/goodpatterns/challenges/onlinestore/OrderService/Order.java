package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;
import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.CostumerAddress;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentId;
import com.kodilla.goodpatterns.challenges.onlinestore.Product;

public class Order {

    public OrderRequest order() {

        CostumerAddress costumerAddress = new CostumerAddress("Norwida", "12/6", "Białystok", "03-290");

        Costumer costumer = new Costumer("Maciej", "Jankowski", "maciej.jankowski@domeil.com", costumerAddress);

        Product product1 = new Product("Buty Giovani", 780.00);
        Product product2 = new Product("Perfumy Hugon Bols", 320.00);

        PaymentId paymentId = new PaymentId(44856287);

        return new OrderRequest(costumer, paymentId);
    }
}
