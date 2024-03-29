package com.kodilla.kodillapatterns3.decorator.taxiportal;

import com.kodilla.kodillapatterns3.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}
