package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntToDoubleFunction;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        IntToDoubleFunction squareRoot = r -> Math.sqrt(r);

        System.out.println(squareRoot.applyAsDouble(64));
    }
}
