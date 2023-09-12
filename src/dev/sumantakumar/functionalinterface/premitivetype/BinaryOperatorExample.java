package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> fullName = (first, last) -> first+" "+last;

        System.out.println(fullName.apply("Sumanta","Kumar"));
    }
}
