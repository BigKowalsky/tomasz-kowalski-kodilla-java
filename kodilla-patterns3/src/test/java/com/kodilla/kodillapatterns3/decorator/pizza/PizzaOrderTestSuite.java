package com.kodilla.kodillapatterns3.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(20.0), cost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getPizzaType();

        //Then
        assertEquals("Pizza", description);
    }

    @Test
    public void testPizzaCapriciosaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Capriciosa(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25.0), cost);
    }

    @Test
    public void testPizzaCapriciosaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Capriciosa(pizzaOrder);

        //When
        String description = pizzaOrder.getPizzaType();

        //Then
        assertEquals("Pizza capriciosa", description);
    }

    @Test
    public void testPizzaCapriciosaExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Capriciosa(pizzaOrder);
        pizzaOrder = new ExtraCheese(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27.0), cost);
    }

    @Test
    public void testPizzaCapriciosaExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Capriciosa(pizzaOrder);
        pizzaOrder = new ExtraCheese(pizzaOrder);

        //When
        String description = pizzaOrder.getPizzaType();

        //Then
        assertEquals("Pizza capriciosa + extra cheese", description);
    }


}
