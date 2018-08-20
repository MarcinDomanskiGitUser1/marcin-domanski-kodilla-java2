package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bułka z sezamem")
                .burgers(3)
                .sauce("1000 wysp")
                .ingredient("sałata")
                .ingredient("ser")
                .ingredient("pomidory")
                .ingredient("cebulka")
                .build();
        System.out.println(bigmac);
        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, numberOfIngredients);
    }
}
