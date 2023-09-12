package dev.sumantakumar.lambdaexpression;

public class AfterJava8Sum {
    public static void main(String[] args) {
        SumInterface sumInterface = (a, b) -> System.out.println("Sum is ="+(a+b)) ;
        sumInterface.add(100,200);
    }
}
