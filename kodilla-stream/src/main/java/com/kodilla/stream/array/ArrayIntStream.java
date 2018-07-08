package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayIntStream {

    static double getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .forEach(n -> System.out.print(numbers[n] + ", "));

        double resultAvarage = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        return resultAvarage;
    }
}
