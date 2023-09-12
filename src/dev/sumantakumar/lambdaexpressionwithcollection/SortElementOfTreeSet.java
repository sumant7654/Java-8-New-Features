package dev.sumantakumar.lambdaexpressionwithcollection;

import java.util.TreeSet;

public class SortElementOfTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet.add(20);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(10);
        System.out.println("Before Sorting : "+treeSet);


    }
}
