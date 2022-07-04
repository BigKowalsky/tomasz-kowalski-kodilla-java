package com.kodilla.stream.world;

import org.junit.jupiter.api.*;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
    //Given
    Country country1 = new Country("Poland", new BigDecimal("38179800"));
    Country country2 = new Country("United Kingdom", new BigDecimal("66796800"));
    Country country3 = new Country("Italy", new BigDecimal("60483973"));
    Country country4 = new Country("Spain", new BigDecimal("47326687"));
    Country country5 = new Country("United States", new BigDecimal("332403650"));
    Country country6 = new Country("Mexico", new BigDecimal("128600000"));
    Country country7 = new Country("Canada", new BigDecimal("37943231"));
    Country country8 = new Country("Brazil", new BigDecimal("217240060"));
    Country country9 = new Country("Argentina", new BigDecimal("45864941"));
    Country country10 = new Country("Colombia", new BigDecimal("49292000"));
    Country country11 = new Country("China", new BigDecimal("1411778724"));
    Country country12 = new Country("Japan", new BigDecimal("125396901"));
    Country country13 = new Country("India", new BigDecimal("1339330514"));
    Country country14 = new Country("Nigeria", new BigDecimal("219463862"));
    Country country15 = new Country("South Africa", new BigDecimal("56978635"));
    Country country16 = new Country("Kenya", new BigDecimal("47654296"));

    Continent europe = new Continent("Europe");
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        europe.addCountry(country4);
    Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(country5);
        northAmerica.addCountry(country6);
        northAmerica.addCountry(country7);
    Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(country8);
        southAmerica.addCountry(country9);
        southAmerica.addCountry(country10);
    Continent asia = new Continent("Asia");
        asia.addCountry(country11);
        asia.addCountry(country12);
        asia.addCountry(country13);
    Continent africa = new Continent("Africa");
        africa.addCountry(country14);
        africa.addCountry(country15);
        africa.addCountry(country16);
    World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(asia);
        world.addContinent(africa);
        //When
        BigDecimal testQuantity = world.getPeopleQuantity();
        BigDecimal realQuantity = new BigDecimal("4224734074");
        //Then
        Assertions.assertEquals(testQuantity, realQuantity);
    }

}
