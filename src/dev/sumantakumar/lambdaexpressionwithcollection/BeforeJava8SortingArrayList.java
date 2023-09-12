package dev.sumantakumar.lambdaexpressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BeforeJava8SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(0);
        numbers.add(15);
        numbers.add(5);
        numbers.add(20);
        System.out.println("Before Sorting : "+numbers);
        Collections.sort(numbers, new MyComparator()); // Default natural Sorting (ascending)
        System.out.println("After Sorting : "+numbers);


    }
}

class MyComparator implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        return i2 - i1;  // Descending Order, If you want Ascending order then change to i1 - i2;
    }
}
