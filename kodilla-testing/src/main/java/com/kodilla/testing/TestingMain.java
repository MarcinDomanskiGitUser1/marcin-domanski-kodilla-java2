package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("Nowy użytkownik");

        String result = simpleUser.getUsername();

        if (result.equals("Nowy użytkownik")) {
            System.out.println("test is OK.");
        } else {
            System.out.println("Error in testing.");
        }

        //Testing Calculator class
        System.out.println();
        System.out.println("Testing Calculator class");

        Calculator calculator = new Calculator();
        int addNumbers = calculator.add(31, 14);
        int subtractNumbers = calculator.subtract(22, 15);

        if (addNumbers == 45) {
            System.out.println("Adding method is OK");
        } else {
            System.out.println("Error in adding method");
        }

        if (subtractNumbers == 36) {
            System.out.println("Subtract method is OK");
        } else {
            System.out.println("Error in subtract method");
        }

    }

}
