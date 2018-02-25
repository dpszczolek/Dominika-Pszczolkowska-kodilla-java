package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMac() {
        BigMac bigMac = new BigMac.BigMacBuilder()
                .builderRoll(Roll.W_SESAME)
                .burgers(2)
                .builderSauce(Sauce.BBQ)
                .builderIngredient(Ingredients.LETTUCE)
                .builderIngredient(Ingredients.MUSHROOMS)
                .builderIngredient(Ingredients.CHEESE)
                .build();
        System.out.println(bigMac);
        int howManyIngredients = bigMac.getIngredients().size();
        Assert.assertEquals(3, howManyIngredients);
    }
}
