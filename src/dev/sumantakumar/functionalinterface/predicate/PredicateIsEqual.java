package dev.sumantakumar.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {
    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("Java");
        System.out.println(predicate.test("Node"));
        System.out.println(predicate.test("Go"));
        System.out.println(predicate.test("Java"));

    }
}
