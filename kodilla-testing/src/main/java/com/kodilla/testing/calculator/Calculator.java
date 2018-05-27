package com.kodilla.testing.calculator;

public class Calculator {


    public int add (int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;

    }

    public int subtract (int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;

    }

}

class AppCalculator {

    public static void main (String args[]) {

        Calculator appCalculator = new Calculator();
        int addResult = appCalculator.add(13, 21);
        int subtractResult = appCalculator.subtract(9, 12);

        System.out.println(subtractResult);
    }
}