package dev.sumantakumar.lambdaexpression;

interface ExampleInterface1{
    void m1();
}
class Test1 implements ExampleInterface1{

    @Override
    public void m1() {
        System.out.println("m1() method implementation");
    }
}
public class BeforeJava8 {
    public static void main(String[] args) {
        ExampleInterface1 obj = new Test1();
        obj.m1();
    }
}
