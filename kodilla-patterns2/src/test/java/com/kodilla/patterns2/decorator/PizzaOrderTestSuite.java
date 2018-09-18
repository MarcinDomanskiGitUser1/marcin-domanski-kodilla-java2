package com.kodilla.patterns2.decorator;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void shouldAddIngredientsAndCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new IngredientsCornAndCucumber(pizzaOrder);
        pizzaOrder = new IngredientsMashroomsAndPotatos(pizzaOrder);
        pizzaOrder = new IngredientsCornAndCucumber(pizzaOrder);
        // When
        BigDecimal theCost = pizzaOrder.getCost();
        String ingredients = pizzaOrder.getIngredients();
        // Then
        assertEquals(new BigDecimal(34), theCost);
        assertEquals("Ingredients: Dough + Tomato souce + Corn + Cucumber + Mashrooms + Potatos + Corn + Cucumber", ingredients);

        System.out.println(ingredients);
        System.out.println(theCost);
    }
}
