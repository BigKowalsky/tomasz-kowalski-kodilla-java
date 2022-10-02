package com.kodilla.kodillaspring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public double addAToB(double a, double b) {
        display.displayValue(a+b);
        return a+b;
    }

    public double subBFromA(double a, double b) {
        display.displayValue(a-b);
        return a-b;
    }

    public double mulAByB(double a, double b) {
        display.displayValue(a*b);
        return a*b;
    }

    public double divAByB(double a, double b) {
        display.displayValue(a/b);
        return a/b;
    }
}
