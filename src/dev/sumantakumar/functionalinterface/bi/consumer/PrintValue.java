package dev.sumantakumar.functionalinterface.bi.consumer;

import java.util.function.BiConsumer;

public class PrintValue {
    public static void main(String[] args) {
        BiConsumer<String, String> printValue = (str1, str2) -> System.out.println(str1+" "+str2);
        printValue.accept("Sumanta", "Kumar");
    }
}
