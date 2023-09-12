package dev.sumantakumar.functionalinterface.function;

import java.util.function.Function;

public class FindAreaOfSquare {
    public static void main(String[] args) {
        Function<Integer, Integer> areaOfSquare = l -> l * l;
        System.out.println(areaOfSquare.apply(5));
        System.out.println(areaOfSquare.apply(8));
    }
}
