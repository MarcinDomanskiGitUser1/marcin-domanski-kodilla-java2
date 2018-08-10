package com.kodilla.goodpatterns.challenges.food2door.FoodSuppliers;

import com.kodilla.goodpatterns.challenges.food2door.Order;
import com.kodilla.goodpatterns.challenges.food2door.Product;

import java.util.Map;
import java.util.stream.Collectors;

public interface FoodSupplier {

    void getSupplierInfo();

    Map<Product, Integer> getProductList();

    void addProduct(Product product, int availableQuantity);

    void confirmOrder(Order order, String availability);

    default boolean process (Order order){

            int updatedQuantity;

            if (getProductList().containsKey(order.getOrderedProduct())) {
                if (order.getOrderedQuantity() <= getProductList().get(order.getOrderedProduct())) {
                    updatedQuantity = (getProductList().get(order.getOrderedProduct()) - order.getOrderedQuantity());
                    getProductList().replace(order.getOrderedProduct(), updatedQuantity);
                    confirmOrder(order, "available");
                    return true;
                } else {
                    confirmOrder(order, "lessAvailable");
                    return false;
                }
            } else {
                confirmOrder(order, "notAvailable");
                return false;
            }
    }

    default void getAvailableProducts() {
            String products = "Available products: " + getProductList().entrySet().stream()
                    .map(element -> element.getKey().getName() + " " + element.getValue() + " ")
                    .collect(Collectors.joining(", "));
            System.out.println(products);
    }
}