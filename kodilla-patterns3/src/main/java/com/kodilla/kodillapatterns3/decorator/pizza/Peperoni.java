package com.kodilla.kodillapatterns3.decorator.pizza;

import com.kodilla.kodillapatterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;


public class Peperoni extends AbstractPizzaOrderDecorator {
    protected Peperoni(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getPizzaType() {
        return super.getPizzaType() + " peperoni";
    }
}