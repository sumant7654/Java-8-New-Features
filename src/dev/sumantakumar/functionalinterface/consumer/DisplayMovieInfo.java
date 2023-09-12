package dev.sumantakumar.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
    private String name;
    private String heroine;

    public Movie(String name, String heroine) {
        this.name = name;
        this.heroine = heroine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroine() {
        return heroine;
    }

    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", heroine='" + heroine + '\'' +
                '}';
    }
}
public class DisplayMovieInfo {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        populate(movies);

        Consumer<Movie> movieConsumer = movie -> System.out.println(movie.getName()+"\t=>\t"+movie.getHeroine());

        for(Movie m : movies) {
            movieConsumer.accept(m);
        }

    }

    private static void populate(ArrayList<Movie> movies) {
        movies.add(new Movie("A", "B"));
        movies.add(new Movie("C", "D"));
        movies.add(new Movie("E", "F"));
        movies.add(new Movie("G", "H"));

    }
}
