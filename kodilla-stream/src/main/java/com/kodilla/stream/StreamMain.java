package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("--------------Calculating expressions with lambdas--");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));

        System.out.println("--------------Calculating expressions with method references--");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("--------------Using Stream to generate even numbers from 1 to 20--");
        NumbersGenerator.generateEven(20);

        System.out.println("--------------Using Stream to check my getList method--");
        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("--------------Using map method on my getList method--");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        //Replace
        People.getList().stream()
                .map(String::toUpperCase) //Replace lambda to referance to method
                .forEach(s -> System.out.println(s)); //Replace referance to method to lambda.

        System.out.println("--------------Shows if text have more letters than 11--");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("--------------Using cascade filters in stream--");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("--------------Using multi classes with stream--");
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("--------------Using collect() method and collectors.tolist()--");
        //BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());
        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println("-------------Using collectors.toMap()--");
        //BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("--------------Using collectors.joining()--");
        //BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining("\nnext entry//\n","<<",">>"));
        System.out.println(theResultStringOfBooks);
    }
}
