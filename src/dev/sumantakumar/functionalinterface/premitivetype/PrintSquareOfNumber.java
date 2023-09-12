package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntConsumer;

public class PrintSquareOfNumber {
    public static void main(String[] args) {
        IntConsumer square = i -> System.out.println(i*i);
        
        square.accept(10);
    }
}
