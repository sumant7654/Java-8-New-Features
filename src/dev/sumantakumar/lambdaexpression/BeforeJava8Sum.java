package dev.sumantakumar.lambdaexpression;

interface SumInterface{
    void add(int a, int b);
}

class SumClass implements SumInterface{

    @Override
    public void add(int a, int b) {
        System.out.println("Sum is = "+(a+b));
    }
}
public class BeforeJava8Sum {
    public static void main(String[] args) {
        SumInterface obj = new SumClass();
        obj.add(100,200);
    }
}