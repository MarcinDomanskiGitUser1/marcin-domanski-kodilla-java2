package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientsCornAndCucumber extends AbstractPizzaOrderDecorator {

    public IngredientsCornAndCucumber(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + Corn + Cucumber";
    }
}
