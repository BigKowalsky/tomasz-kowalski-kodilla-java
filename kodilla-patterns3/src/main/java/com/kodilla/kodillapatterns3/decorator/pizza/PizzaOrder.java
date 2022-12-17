package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();

    String getPizzaType();
}
