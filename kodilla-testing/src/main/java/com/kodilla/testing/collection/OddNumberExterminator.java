package com.kodilla.testing.collection;

import java.util.*;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (int n = 0; n < numbers.size(); n++) {

            int temporaryValue = numbers.get(n);

            if (temporaryValue % 2 == 0) {

                evenNumbers.add(temporaryValue);
            }
        }
        return evenNumbers;
    }
}