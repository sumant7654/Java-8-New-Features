package dev.sumantakumar.stream;

import java.util.List;

public class MinAndMaxFromArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,14,24,12,678,34,12,44,90, 4, 45);
        integerList.forEach(System.out::println);
        Integer min = integerList.stream().min((i, j) -> i.compareTo(j)).get();
        System.out.println("MIN="+min);

        Integer max = integerList.stream().max((i, j) ->  i.compareTo(j)).get();
        System.out.println("MAX="+max);

    }
}
