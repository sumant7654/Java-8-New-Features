package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntFunction;

public class SquareOfNumber {
    public static void main(String[] args) {
        IntFunction<Integer> square = i -> i * i;
        System.out.println(square.apply(10));
    }
}
