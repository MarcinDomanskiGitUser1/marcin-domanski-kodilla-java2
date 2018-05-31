package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumberExterminator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {


    @Before
    public void beforeTestEmptyList() {
        System.out.println("Start test");
    }

@Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        System.out.println("Empty list size is -");
        oddNumberExterminator.exterminate(emptyList);

        Assert.assertEquals(emptyList.size(), oddNumberExterminator.evenNumbers.size());

        System.out.println("Even numbers list size is " + oddNumberExterminator.evenNumbers.size());
    }

    @After
    public void afterTestEmptyList () {
        System.out.println("End test");
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(4);
        normalList.add(5);
        normalList.add(7);
        normalList.add(12);
        normalList.add(15);
        normalList.add(24);


    OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        oddNumberExterminator.exterminate(normalList);

        System.out.println("Normal list first position" + normalList.get(0));

        System.out.println("Even numbers list first position " + oddNumberExterminator.evenNumbers.get(0));

        Assert.assertEquals(normalList.get(0), oddNumberExterminator.evenNumbers.get(0));

    }

}
