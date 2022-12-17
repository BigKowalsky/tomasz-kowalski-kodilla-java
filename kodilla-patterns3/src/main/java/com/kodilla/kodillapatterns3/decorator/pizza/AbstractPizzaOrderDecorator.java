package com.kodilla.kodillapatterns3.decorator.pizza;

import com.kodilla.kodillapatterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getPizzaType() {
        return pizzaOrder.getPizzaType();
    }
}

