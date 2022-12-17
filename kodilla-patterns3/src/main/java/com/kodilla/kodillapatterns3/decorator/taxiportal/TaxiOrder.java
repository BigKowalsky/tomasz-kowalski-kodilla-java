package com.kodilla.kodillapatterns3.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();
}
