package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {
    public static void main(String[] args) {
        IntBinaryOperator product = (i, j) -> i * j;

        System.out.println(product.applyAsInt(10,15));
    }
}
