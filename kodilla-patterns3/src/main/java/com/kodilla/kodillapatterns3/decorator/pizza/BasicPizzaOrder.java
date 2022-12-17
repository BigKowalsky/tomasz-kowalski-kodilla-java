package com.kodilla.kodillapatterns3.decorator.pizza;

import com.kodilla.kodillapatterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20.00);
    }

    @Override
    public String getPizzaType() {
        return "Pizza";
    }
}
