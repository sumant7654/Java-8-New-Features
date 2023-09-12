package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class CountSpace {
    public static void main(String[] args) {
        Function<String, Integer> countSpace = string -> {
            int length = string.length();
            String replace = string.replace(" ", "");
            return length - replace.length();
        };
        System.out.println(countSpace.apply("Sumanta Kumar Sahoo"));
    }
}
