package dev.sumantakumar.anonymousinnerclassandlambdaexpression;

interface ThisInterface {
    void m1();
}

public class AnonymousClassAndThis {
    int x = 1000;

    public static void main(String[] args) {
        AnonymousClassAndThis obj = new AnonymousClassAndThis();
        obj.m2();
    }

    public void m2() {
        ThisInterface thisInterface = new ThisInterface() {
            int x = 90;

            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(AnonymousClassAndThis.this.x);
            }
        };
        thisInterface.m1();
    }
}
