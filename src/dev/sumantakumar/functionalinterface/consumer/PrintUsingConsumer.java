package dev.sumantakumar.functionalinterface.consumer;

import java.util.function.Consumer;

public class PrintUsingConsumer {
    public static void main(String[] args) {
        Consumer<String> printValue = value -> System.out.println(value);

        System.out.println("Hello World");
    }
}
