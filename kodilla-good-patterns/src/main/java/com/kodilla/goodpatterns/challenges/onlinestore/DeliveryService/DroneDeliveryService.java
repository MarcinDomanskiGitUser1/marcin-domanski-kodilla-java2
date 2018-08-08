package com.kodilla.goodpatterns.challenges.onlinestore.DeliveryService;

import com.kodilla.goodpatterns.challenges.onlinestore.CostumerData.Costumer;

public class DroneDeliveryService implements DeliveryService {

    public boolean deliverTo (Costumer costumer) {
        System.out.println("Deliver to " + costumer.getName() + " " + costumer.getSurname());
        System.out.println( "Address: " + costumer.getCostumerAddress().getStreet() + " " + costumer.getCostumerAddress().getHouseNumber() + " " + costumer.getCostumerAddress().getPostCode() +" " + costumer.getCostumerAddress().getCity());
        return true;
    }
}
