package dev.sumantakumar.functionalinterface.bi.predicate;

import java.util.function.BiPredicate;

public class SumOfTwoNumberIsEvenOrNot {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isEven = (number1, number2) -> (number1+number2) % 2 == 0;

        System.out.println(isEven.test(10,20));
        System.out.println(isEven.test(15,20));
    }
}
