package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = string -> string.toUpperCase();
        Function<String, String> first = string -> string.substring(0,9);
        System.out.println(toUpperCase.andThen(first).apply("Sumanta Kumar Sahoo"));
        System.out.println(toUpperCase.andThen(first).apply("Software Engineer"));

        System.out.println(toUpperCase.compose(first).apply("Sumanta Kumar Sahoo"));
        System.out.println(toUpperCase.compose(first).apply("Software Engineer"));

    }
}
