package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.ToIntFunction;

public class LengthOfString {
    public static void main(String[] args) {
        ToIntFunction<String> getLength = s -> s.length();

        System.out.println(getLength.applyAsInt("Sumant"));
    }
}
