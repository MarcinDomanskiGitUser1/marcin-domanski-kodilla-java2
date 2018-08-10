package com.kodilla.goodpatterns.challenges.food2door.FoodSuppliers;

import com.kodilla.goodpatterns.challenges.food2door.Order;
import com.kodilla.goodpatterns.challenges.food2door.Product;

import java.util.HashMap;
import java.util.Map;

public class FruitsSupplier implements FoodSupplier {

    private String name;
    private String address;
    private Map<Product, Integer> productList = new HashMap<>();

    public FruitsSupplier(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Map<Product, Integer> getProductList() {
        return productList;
    }
    public void getSupplierInfo() {
        System.out.println("Fruits food supplier name: " +  name + ", supplier address: " + address );
    }

    public void addProduct(Product product, int availableQuantity) {
        productList.put(product, availableQuantity);
    }

    public void confirmOrder(Order order, String availability) {

        if (availability.equals("available")) {
            System.out.println("Order is processed. You have ordered " + order.getOrderedQuantity() + " x " + order.getOrderedProduct().getName() + ".");

        } else if (availability.equals("lessAvailable")) {
            System.out.println("Sorry your order is not accepted. The amount of " + order.getOrderedProduct().getName() + " is less than in your order. We can execute your order in 2 days");

        }else if (availability.equals("notAvailable")){
            System.out.println("Sorry your order is not accepted. We don't have " + order.getOrderedProduct().getName() + " now. We can execute your order in 2 days");
        }
    }
}
