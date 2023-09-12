package dev.sumantakumar.functionalinterface.function;

import java.util.Scanner;
import java.util.function.Function;

public class AuthenticationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        Function<String, String> first = s -> s.substring(0, 6);
        Function<String, String> toLower = s -> s.toLowerCase();

        if(first.andThen(toLower).apply(username).equals("sumant") && password.equals("java")){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
