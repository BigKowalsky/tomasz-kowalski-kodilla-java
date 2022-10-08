package com.kodilla.kodillapatterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("bun with sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("becon")
                .ingredient("lettuce")
                .ingredient("tomato")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3,howManyIngredients);
    }
}
