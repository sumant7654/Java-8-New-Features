package dev.sumantakumar.lambdaexpression;

public class AfterJava8Square {
    public static void main(String[] args) {
        SquareInterface squareInterface = x -> x * x;

        int i = squareInterface.squareIt(10);
        System.out.println("Value is = "+i);
    }
}
