package com.kodilla.kodillapatterns3.decorator.pizza;

import com.kodilla.kodillapatterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExtraCheese extends AbstractPizzaOrderDecorator {
    protected ExtraCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getPizzaType() {
        return super.getPizzaType() + " + extra cheese";
    }
}