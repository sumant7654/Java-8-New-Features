package dev.sumantakumar.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRemoveNullOrEmpty {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = string -> string != null && !string.isEmpty();
        String[] names = {"Sumanta", null, "", "Ankit", "", "Shadab", null, "Satya"};

        ArrayList<String> validNames = new ArrayList<>();
        for (String name : names) {
            if(stringPredicate.test(name)){
                validNames.add(name);
            }
        }

        System.out.println(validNames);

    }
}
