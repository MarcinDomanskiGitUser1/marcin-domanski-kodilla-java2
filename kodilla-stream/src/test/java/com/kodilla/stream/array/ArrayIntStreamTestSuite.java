package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayIntStreamTestSuite {
    @Test
    public void testGetAverage (){
        //Given
        int[] someNumbers = {5, 12, 6, 19, 21, 3};
        //When
        double result = ArrayIntStream.getAverage(someNumbers);
        //Then
        Assert.assertEquals(11, result,0.1);
    }
}