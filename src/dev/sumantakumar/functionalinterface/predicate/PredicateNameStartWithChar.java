package dev.sumantakumar.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNameStartWithChar {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Sumanta", "Ankit", "Shadab", "Satya"));

        Predicate<String> stringPredicate = name -> name.startsWith("S");
        for(String name : names){
            System.out.println(name+ " is start with 'S' : " +stringPredicate.test(name));
        }
    }
}
