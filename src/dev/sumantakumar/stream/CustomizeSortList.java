package dev.sumantakumar.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizeSortList {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,14,24,12,678,34,12,44,90, 4, 45);
        List<Integer> collect = integerList.stream().sorted((i, j) -> - i.compareTo(j)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
