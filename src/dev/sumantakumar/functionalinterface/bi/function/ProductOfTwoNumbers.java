package dev.sumantakumar.functionalinterface.bi.function;

import java.util.function.BiFunction;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = (a, b) -> a*b;

        System.out.println(product.apply(10,20));
        System.out.println(product.apply(150,20));
    }
}
