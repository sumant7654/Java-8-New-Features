package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntUnaryOperator;

public class IntUnaryExample {
    public static void main(String[] args) {
        IntUnaryOperator square = s -> s * s;
        System.out.println(square.applyAsInt(10));
    }
}
