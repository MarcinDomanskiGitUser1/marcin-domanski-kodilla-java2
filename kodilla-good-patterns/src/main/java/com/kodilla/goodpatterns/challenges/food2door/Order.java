package com.kodilla.goodpatterns.challenges.food2door;

public class Order {

    private Product orderedProduct;
    private int orderedQuantity;

    public Order(Product orderedProduct, int orderedQuantity) {
        this.orderedProduct = orderedProduct;
        this.orderedQuantity = orderedQuantity;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }
    public int getOrderedQuantity() {
        return orderedQuantity;
    }

}
