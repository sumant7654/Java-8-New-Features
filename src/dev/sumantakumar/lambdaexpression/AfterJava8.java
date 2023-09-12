package dev.sumantakumar.lambdaexpression;


import dev.sumantakumar.functionalinterface.ValidFunctionalInterface;

public class AfterJava8 {
    public static void main(String[] args) {
        ExampleInterface1 exampleInterface1 = () -> System.out.println("m1() Method Implementation");
        exampleInterface1.m1();
    }
}
