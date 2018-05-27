package com.kodilla.testing.collection;

import java.util.*;

public class OddNumberExterminator {

//    private ArrayList<Integer> evenNumbers;
//
//    public OddNumberExterminator() {
//        evenNumbers = new ArrayList<Integer>();
//    }

    public int exterminate (ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers  = new ArrayList<Integer>();

        for (int n=0; n < numbers.size(); n++){

            int temporaryValue = numbers.get(n);

                if (temporaryValue % 2 == 0){

                evenNumbers.add(temporaryValue);
                }
        }

        return ArrayList<Integer> evenNumbers;

    }
} //System.out.println(exterminate(evenNumbers));

class OddTaker
{
    public static void main (String[] args) {

        ArrayList<Integer> redList = new ArrayList<Integer>();

        for(int n=0; n < 100; n++) {
            redList.add(n);
        }

        OddNumberExterminator oddExterminator = new OddNumberExterminator();
        oddExterminator.exterminate(redList);


    }
}