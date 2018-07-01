package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("--Calculating expressions with lambdas--");
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));

        System.out.println("--Calculating expressions with method references--");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("--Using string methods and lambda--");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String someText = "This Text Is Decorate With Lambda";
        poemBeautifier.beautify(someText, text -> text.toLowerCase());
        poemBeautifier.beautify("Dać dzisiaj czy jutro?", text -> text.replace('t', 'F'));
        poemBeautifier.beautify("How are you, programmer!", text -> "*** " + text + " ***");
        poemBeautifier.beautify(someText, text -> text.substring(5, 26));
        poemBeautifier.beautify(someText, text -> text.concat(".\nSecond part of text is here!"));
        poemBeautifier.beautify(someText, tex -> {
            String result = "";
            for(int i = 0;i<tex.length(); i++)
                result = result + (" " + tex.charAt(i));
            return result;
        });

        System.out.println("--Using Stream to generate even numbers from 1 to 20--");
        NumbersGenerator.generateEven(20);

        System.out.println("--Using Stream to check my getList method--");
        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("--Using map method on my getList method--");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        //Replace
        People.getList().stream()
                .map(String::toUpperCase) //Replace lambda to referance to method
                .forEach(s -> System.out.println(s)); //Replace referance to method to lambda.

        System.out.println("--Shows if text have more letters than 11--");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("--Using cascade filters in stream--");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
    }
}
