package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

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
    }
}
