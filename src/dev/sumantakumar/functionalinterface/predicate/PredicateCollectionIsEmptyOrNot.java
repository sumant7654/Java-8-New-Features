package dev.sumantakumar.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollectionIsEmptyOrNot {
    public static void main(String[] args) {
        Predicate<Collection> predicate = collection -> collection.isEmpty();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        ArrayList<String> stringArrayList = new ArrayList<>();

        System.out.println(predicate.test(arrayList));
        System.out.println(predicate.test(stringArrayList));
    }
}
