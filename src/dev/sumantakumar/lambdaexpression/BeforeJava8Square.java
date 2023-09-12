package dev.sumantakumar.lambdaexpression;

interface SquareInterface{
    int squareIt(int x);
}

class SquareClass implements SquareInterface{

    @Override
    public int squareIt(int x) {
        return x * x;
    }
}
public class BeforeJava8Square {
    public static void main(String[] args) {
        SquareInterface squareInterface = new SquareClass();
        int i = squareInterface.squareIt(10);
        System.out.println("Value is = "+i);
    }
}
