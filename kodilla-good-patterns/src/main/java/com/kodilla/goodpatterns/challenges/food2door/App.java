package com.kodilla.goodpatterns.challenges.food2door;

import com.kodilla.goodpatterns.challenges.food2door.FoodSuppliers.FruitsSupplier;
import com.kodilla.goodpatterns.challenges.food2door.FoodSuppliers.VegetablesSupplier;

public class App {

    public static void main (String[] args) {

        FruitsSupplier fruitsSupplier = new FruitsSupplier("Skaczące owoce", "Warszawa, ul. Warszafka 12 ");
        VegetablesSupplier vegetablesSupplier = new VegetablesSupplier ("Świat warzyw", "Łowicz, ul. Podrzeczna 100");

        Product product1 = new Product("Bakłażan", 6.7 );
        Product product2 = new Product("Marchew", 2.50 );
        Product product3 = new Product("Pomidor", 20.5);
        Product product4 = new Product("Jabłka", 3.40 );
        Product product5 = new Product("Śliwki", 12.50 );
        Product product6 = new Product("Gruszki", 4.5 );

        vegetablesSupplier.addProduct(product1, 50);
        vegetablesSupplier.addProduct(product2, 0);
        vegetablesSupplier.addProduct(product3, 150);

        fruitsSupplier.addProduct(product4, 120);
        fruitsSupplier.addProduct(product5, 19);
        fruitsSupplier.addProduct(product6, 20);

        Order order1 = new Order(product1, 5);
        Order order2 = new Order(product2, 85);
        Order order3 = new Order(product5, 20);
        Order order4 = new Order(product6, 12);

        fruitsSupplier.getSupplierInfo();
        fruitsSupplier.getAvailableProducts();
        fruitsSupplier.process(order3);
        fruitsSupplier.process(order4);
        fruitsSupplier.getAvailableProducts();

        vegetablesSupplier.getSupplierInfo();
        vegetablesSupplier.getAvailableProducts();
        vegetablesSupplier.process(order1);
        vegetablesSupplier.process(order2);
        vegetablesSupplier.getAvailableProducts();
    }
}
