package com.kodilla.goodpatterns.challenges.onlinestore.OrderService;

import com.kodilla.goodpatterns.challenges.onlinestore.ConfirmationService.OrderConfirmationService;
import com.kodilla.goodpatterns.challenges.onlinestore.DeliveryService.DeliveryService;
import com.kodilla.goodpatterns.challenges.onlinestore.PaymentService.PaymentService;

public class ProductOrderService {

    private PaymentService paymentService;
    private OrderService orderService;
    private DeliveryService deliveryService;
    private OrderConfirmationService orderConfirmationService;

    public ProductOrderService (PaymentService paymentService, OrderService orderService, DeliveryService deliveryService, OrderConfirmationService orderConfirmationService) {
        this.paymentService = paymentService;
        this.orderService = orderService;
        this.deliveryService = deliveryService;
        this.orderConfirmationService = orderConfirmationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean ordered = orderService.createOrder(orderRequest.getCostumer(), orderRequest.getPaymentId());
        boolean paid = false;
        if (ordered) {
            paid = paymentService.pay(orderRequest.getPaymentId());
            if (paid) {
                deliveryService.deliverTo(orderRequest.getCostumer());
                orderConfirmationService.sendTo(orderRequest.getCostumer());
            }
        }
        return new OrderDto(orderRequest.getCostumer(), orderRequest.getPaymentId(), orderRequest.getOrderedProducts(), ordered, paid);
    }
}
