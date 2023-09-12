package dev.sumantakumar.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateNumberGreaterThan {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number > 10;
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(5));
    }
}
