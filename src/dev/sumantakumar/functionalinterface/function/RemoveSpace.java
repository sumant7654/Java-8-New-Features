package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class RemoveSpace {
    public static void main(String[] args) {
        Function<String, String> removeSpace = string -> string.replace(" ", "");
        System.out.println(removeSpace.apply("Sumanta Kumar Sahoo"));
    }
}
