package dev.sumantakumar.anonymousinnerclassandlambdaexpression;

interface EncloseInterface{
    void m1();
}
public class EnclosingClassVariableWithLambda {
    int x = 1000;
    public static void main(String[] args) {
        EnclosingClassVariableWithLambda obj = new EnclosingClassVariableWithLambda();
        obj.m2();
    }

    public void m2(){
        int y = 99;

        EncloseInterface encloseInterface = () -> {
            //y = 90; // Variable used in lambda expression should be final or effectively final
            System.out.println(x);
            System.out.println(y);
        };
        encloseInterface.m1();
    }
}
