package dev.sumantakumar.lambdaexpressionwithcollection;

import java.util.TreeMap;

public class SortElementOfTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((i1,i2) -> i2-i1);
        treeMap.put(163, "Sumanta");
        treeMap.put(402, "Satya");
        treeMap.put(201, "Swastik");
        treeMap.put(278, "Swagat");
        treeMap.put(345, "Ankit");
        System.out.println("Before Sorting : "+treeMap);

    }
}
