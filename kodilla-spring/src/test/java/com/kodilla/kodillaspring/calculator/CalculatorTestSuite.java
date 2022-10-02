package com.kodilla.kodillaspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void TestCalculations() {
        //Given
        int a = 10;
        int b = 5;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.addAToB(a, b);
        double subResult = calculator.subBFromA(a, b);
        double mulResult = calculator.mulAByB(a, b);
        double divResult = calculator.divAByB(a, b);

        //Then
        assertEquals(15, addResult, 0.001);
        assertEquals(5, subResult, 0.001);
        assertEquals(50, mulResult, 0.001);
        assertEquals(2, divResult, 0.001);

    }
}
