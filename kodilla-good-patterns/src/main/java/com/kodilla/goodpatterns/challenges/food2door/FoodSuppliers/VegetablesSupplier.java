package com.kodilla.goodpatterns.challenges.food2door.FoodSuppliers;

import com.kodilla.goodpatterns.challenges.food2door.Order;
import com.kodilla.goodpatterns.challenges.food2door.Product;

import java.util.HashMap;
import java.util.Map;

public class VegetablesSupplier implements FoodSupplier {

    private String name;
    private String address;
    private Map<Product, Integer> productList = new HashMap<>();

    public VegetablesSupplier(String name, String address) {
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
        System.out.println("Vegetables food supplier name: " + name + ", supplier address: " + address);
    }

    public boolean addProduct(Product product, int availableQuantity) {
        productList.put(product, availableQuantity);
        return true;
    }

    public void confirmOrder(Order order, String availability) {

        if (availability.equals("available")) {
            System.out.println("Great. Your order is accepted. You have ordered " + order.getOrderedQuantity() + " - " + order.getOrderedProduct().getName() + ".");

            } if (availability.equals("lessAvailable")) {
            System.out.println("We are sorry. Your order is not accepted. The amount of " + order.getOrderedProduct().getName() + " is less than you order. We can execute your order in 3 days");

        }else if (availability.equals("notAvailable")){
            System.out.println("We are sorry. Your order is not accepted. We don't have " + order.getOrderedProduct().getName() + " now. We can execute your order in 3 days");
        }
    }
}
