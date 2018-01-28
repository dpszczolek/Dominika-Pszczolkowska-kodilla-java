package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity () {
        BigDecimal bd = new BigDecimal("12345678987654321");

        Country country1 = new Country("abc", bd);
        Country country2 = new Country("def", bd);
        Country country3 = new Country("ghi", bd);
        Country country4 = new Country("jkl", bd);
        Country country5 = new Country("mno", bd);
        Country country6 = new Country("prs", bd);

        Continent continent1 = new Continent("asia");
        Continent continent2 = new Continent("europe");

        World world = new World();

        world.addContinents(continent1);
        world.addContinents(continent2);
        continent1.addCountries(country1);
        continent1.addCountries(country2);
        continent1.addCountries(country3);
        continent2.addCountries(country4);
        continent2.addCountries(country5);
        continent2.addCountries(country6);

        BigDecimal expectedResult = new BigDecimal("74074073925925926");

        Assert.assertEquals(expectedResult, world.getPeopleQuantity());
    }
}
