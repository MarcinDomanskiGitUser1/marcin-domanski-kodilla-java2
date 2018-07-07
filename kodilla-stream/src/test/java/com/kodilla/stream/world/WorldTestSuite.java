package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void getWorldPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        Country country1 = new Country("France", "8659516549");
        Country country2 = new Country("Belgium", "6528756630");
        Country country3 = new Country("Portugal", "4589684562");

        Continent southAmerica = new Continent();
        Country country4 = new Country("Chile", "1536598412");
        Country country5 = new Country("Argentina", "4865234478");
        Country country6 = new Country("Brazil", "2366985448");

        Continent asia = new Continent();
        Country country7 = new Country("Vietnam", "8665521243");
        Country country8 = new Country("Thailand", "6254326552");
        Country country9 = new Country("Mongolia", "3256324458");

        World world = new World();

        //When
        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(asia);
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        southAmerica.addCountry(country4);
        southAmerica.addCountry(country5);
        southAmerica.addCountry(country6);
        asia.addCountry(country7);
        asia.addCountry(country8);
        asia.addCountry(country9);

        //Then
        BigDecimal expectedPeople = new BigDecimal("46722948332");
        Assert.assertEquals(expectedPeople, world.getWorldPeopleQuantity());

    }
}
