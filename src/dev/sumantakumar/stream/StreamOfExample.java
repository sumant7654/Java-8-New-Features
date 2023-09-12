package dev.sumantakumar.stream;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 4, 65, 90, 67, 54, 66, 3, 2, 7, 5, 8);
        integerStream.forEach(System.out::println);

        Double[] doubleData= {1.0, 4.11, 65.8, 90.0, 67.43, 54.45, 66.66, 3.1, 2.2, 7.7, 5.12, 8.13};
        Stream<Double> doubleData1 = Stream.of(doubleData);
        doubleData1.forEach(System.out::println);
    }
}
