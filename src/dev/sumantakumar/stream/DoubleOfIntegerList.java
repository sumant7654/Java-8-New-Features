package dev.sumantakumar.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DoubleOfIntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,5,10,15,20,25);
        Function<Integer, Integer> doubleValue = integer -> integer * 2;

        List<Integer> collect = integerList.stream().map(doubleValue).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
