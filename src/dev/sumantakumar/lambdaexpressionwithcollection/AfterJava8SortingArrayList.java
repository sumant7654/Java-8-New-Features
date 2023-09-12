package dev.sumantakumar.lambdaexpressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AfterJava8SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(0);
        numbers.add(15);
        numbers.add(5);
        numbers.add(20);
        System.out.println("Before Sorting : "+numbers);
        Collections.sort(numbers, (i1, i2) -> i2 - i1); // Default natural Sorting (ascending)
        System.out.println("After Sorting : "+numbers);
    }
}
