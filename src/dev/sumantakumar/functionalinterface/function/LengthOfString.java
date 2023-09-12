package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class LengthOfString {
    public static void main(String[] args) {
        Function<String, Integer> findLength = string -> string.length();
        System.out.println(findLength.apply("Sumanta"));
        System.out.println(findLength.apply("Sumanta Kumar Sahoo"));
    }
}
