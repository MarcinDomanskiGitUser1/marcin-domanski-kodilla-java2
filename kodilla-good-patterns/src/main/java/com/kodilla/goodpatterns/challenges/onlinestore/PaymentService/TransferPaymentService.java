package com.kodilla.goodpatterns.challenges.onlinestore.PaymentService;

public class TransferPaymentService implements PaymentService{

    public boolean pay(PaymentId paymentId) {

        System.out.println("Transfer payment is done");
        return true;
    }
}
