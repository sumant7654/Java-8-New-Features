package dev.sumantakumar.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbersFromList {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 5, 10, 15, 20, 25);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> collect = list.stream().filter(isEven).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
