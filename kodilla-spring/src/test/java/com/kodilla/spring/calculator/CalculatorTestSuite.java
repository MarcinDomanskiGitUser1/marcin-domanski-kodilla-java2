package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(12, 4);
        double subResult = calculator.sub(17, 3);
        double mulResult = calculator.mul(2, 8);
        double divResult = calculator.div(14, 2);

        //Then
        Assert.assertEquals(16, addResult, 0);
        Assert.assertEquals(14, subResult, 0);
        Assert.assertEquals(16, mulResult, 0);
        Assert.assertEquals(7, divResult, 0);
    }
}
