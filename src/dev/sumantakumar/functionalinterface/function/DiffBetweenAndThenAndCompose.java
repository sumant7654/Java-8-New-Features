package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class DiffBetweenAndThenAndCompose {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleTheValue = i -> i + i;
        Function<Integer, Integer> squareTheValue = i -> i * i;

        System.out.println(doubleTheValue.andThen(squareTheValue).apply(4));
        System.out.println(doubleTheValue.compose(squareTheValue).apply(4));
    }
}
