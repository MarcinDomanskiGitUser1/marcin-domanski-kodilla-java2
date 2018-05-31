package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumberExterminator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void beforeTestEmptyList() {
        System.out.println("Start test");
    }
    @After
    public void afterTestEmptyList () {
        System.out.println("End test");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> emptyList = new ArrayList<Integer>();

        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        List<Integer> results = oddNumberExterminator.exterminate(emptyList);

        Assert.assertEquals(0, results.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(4);
        normalList.add(5);
        normalList.add(7);
        normalList.add(12);
        normalList.add(15);
        normalList.add(24);

        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        List<Integer> results = oddNumberExterminator.exterminate(normalList);

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(12);
        myList.add(24);

        Assert.assertEquals(myList, results);

    }
}
