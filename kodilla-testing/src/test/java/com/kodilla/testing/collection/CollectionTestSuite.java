package com.kodilla.testing.collection;


import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        System.out.println(emptyList.size());

        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        emptyListSize = oddNumberExterminator.exterminate(emptyList);

    }
}
