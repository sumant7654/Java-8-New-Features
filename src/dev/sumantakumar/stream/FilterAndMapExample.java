package dev.sumantakumar.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<String> names = List.of("Sumanta", "Ankit", "Swastik", "Shadab", "Satya", "Swagat");

        Predicate<String> startsWithS = name -> name.startsWith("S");

        Function<String, String> toUpper = name -> name.toUpperCase();
        List<String> collect = names.stream()
                .filter(startsWithS)
                .map(toUpper)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        long count = names.stream()
                .filter(startsWithS)
                .map(toUpper).count();
        System.out.println("Total Count="+count);
    }
}
