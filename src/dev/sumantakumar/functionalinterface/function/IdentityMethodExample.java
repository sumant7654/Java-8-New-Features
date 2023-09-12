package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class IdentityMethodExample {
    public static void main(String[] args) {
        Function<String, String> stringIdentity = Function.identity();

        System.out.println(stringIdentity.apply("Sumanta Kumar Sahoo"));
    }
}
