package com.kodilla.kodillapatterns3.decorator.pizza;

import com.kodilla.kodillapatterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;


public class Capriciosa extends AbstractPizzaOrderDecorator {
    protected Capriciosa(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaType() {
        return super.getPizzaType() + " capriciosa";
    }
}
