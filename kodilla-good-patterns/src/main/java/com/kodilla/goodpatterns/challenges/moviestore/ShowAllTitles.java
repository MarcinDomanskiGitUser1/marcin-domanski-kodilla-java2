package com.kodilla.goodpatterns.challenges.moviestore;

import java.util.stream.Collectors;

public class ShowAllTitles {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String allBookTitles = movieStore.getMovies().values().stream()
                .flatMap(t -> t.stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(allBookTitles);
    }
}
