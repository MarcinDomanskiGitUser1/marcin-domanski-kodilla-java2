package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main (String [] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,3);
        } catch (Exception o) {
            System.out.println("The exception has occurred. Your data must have (x >= 2 or x < 1 or y == 1.5)");
        } finally {
            System.out.println("Thank you. End of program.");
        }
    }
}
