package com.kodilla.goodpatterns.challenges.moviestore;

import java.util.stream.Collectors;

public class ShowAllTitles {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String allBookTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(allBookTitles);
    }
}
