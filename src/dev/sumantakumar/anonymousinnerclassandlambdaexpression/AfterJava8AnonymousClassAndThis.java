package dev.sumantakumar.anonymousinnerclassandlambdaexpression;

public class AfterJava8AnonymousClassAndThis {
    int x = 1000;
    public static void main(String[] args) {
        AfterJava8AnonymousClassAndThis obj = new AfterJava8AnonymousClassAndThis();
        obj.m2();

    }

    public void m2(){
        ThisInterface thisInterface = () -> {
          int x = 90;
            System.out.println(x);
            System.out.println(this.x);
        };
        thisInterface.m1();
    }
}
