package dev.sumantakumar.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<Integer> predicateGreaterThan = number -> number > 10;
        Predicate<Integer> predicateEven = number -> number % 2 == 0;

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        for(Integer each: numbers){
            System.out.println(each+" Less than 10 : "+predicateGreaterThan.negate().test(each));
        }

        for(Integer each: numbers){
            System.out.println(each+" Greater than 10 : "+predicateGreaterThan.test(each));
        }

        for(Integer each: numbers){
            System.out.println(each+" Greater than 10 and Even : "+predicateGreaterThan.and(predicateEven).test(each));
        }

        for(Integer each: numbers){
            System.out.println(each+" Greater than 10 or Even : "+predicateGreaterThan.or(predicateEven).test(each));
        }

    }
}
