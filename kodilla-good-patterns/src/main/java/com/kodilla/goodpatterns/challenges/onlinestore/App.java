package com.kodilla.goodpatterns.challenges.onlinestore;

import com.kodilla.goodpatterns.challenges.onlinestore.ConfirmationService.EmailConfirmation;
import com.kodilla.goodpatterns.challenges.onlinestore.DeliveryService.DroneDeliveryService;
import com.kodilla.goodpatterns.challenges.onlinestore.OrderService.ExecutedOrder;
import com.kodilla.goodpatterns.challenges.onlinestore.OrderService.Order;
import com.kodilla.goodpatterns.challenges.onlinestore.OrderService.OrderRequest;
import com.kodilla.goodpatterns.challenges.onlinestore.OrderService.ProductOrderService;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.TransferPaymentService;

public class App {

    public static void main(String[] args) {

        Order order = new Order();
        OrderRequest orderRequest = order.order();

        ProductOrderService productOrderService = new ProductOrderService(new TransferPaymentService(), new ExecutedOrder(), new DroneDeliveryService(), new EmailConfirmation());
        productOrderService.process(orderRequest);
    }
}
