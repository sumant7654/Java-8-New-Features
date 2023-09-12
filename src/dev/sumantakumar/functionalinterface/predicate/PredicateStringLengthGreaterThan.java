package dev.sumantakumar.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateStringLengthGreaterThan {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.length() > 5;
        System.out.println(predicate.test("Sumanta"));
        System.out.println(predicate.test("Kumar"));
    }
}
