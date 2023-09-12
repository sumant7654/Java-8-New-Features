package dev.sumantakumar.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> consumeRelease = movie -> System.out.println("Movie is Ready to Release : " + movie.getName());
        Consumer<Movie> rating = movie -> System.out.println("Movie rating is published");
        Consumer<Movie> status = movie -> System.out.println("Movie completed");

        Movie movie = new Movie("Fifty Shades of Grey", "NA");
        consumeRelease.andThen(rating).andThen(status).accept(movie);
    }
}
