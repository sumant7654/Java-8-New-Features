package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = s -> s * s;
        System.out.println(square.apply(10));

    }
}
