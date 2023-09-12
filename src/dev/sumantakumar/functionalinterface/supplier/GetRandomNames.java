package dev.sumantakumar.functionalinterface.supplier;

import java.util.function.Supplier;

public class GetRandomNames {
    public static void main(String[] args) {
        Supplier<String> getRandomName = () -> {
            String[] names = {"Sumanta", "Swastik", "Shadab", "Swagat", "Ankit", "Nitish", "Satya"};
            return names[(int) (Math.random() * names.length)];
        };

        System.out.println(getRandomName.get());
        System.out.println(getRandomName.get());
        System.out.println(getRandomName.get());
        System.out.println(getRandomName.get());
        System.out.println(getRandomName.get());


    }
}
