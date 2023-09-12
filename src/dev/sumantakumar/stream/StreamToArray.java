package dev.sumantakumar.stream;

import java.util.Arrays;
import java.util.List;


public class StreamToArray {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,14,24,12,678,34,12,44,90, 4, 45);
        Integer[] arrays = integerList.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arrays));
    }
}
