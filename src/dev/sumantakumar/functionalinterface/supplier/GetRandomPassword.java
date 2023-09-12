package dev.sumantakumar.functionalinterface.supplier;

import java.util.function.Supplier;

public class GetRandomPassword {
    public static void main(String[] args) {
        Supplier<Integer> getRandomNumber = () -> (int) (Math.random() * 10);
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$abcdefghijklmnopqrstuvwxyz";
        Supplier<Character> getRandomCharacter = () -> symbol.charAt((int) (Math.random() * symbol.length()));
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                password.append(getRandomNumber.get());
            } else {
                password.append(getRandomCharacter.get());
            }
        }
        System.out.println(password);
        System.out.println(password);
        System.out.println(password);
    }
}
