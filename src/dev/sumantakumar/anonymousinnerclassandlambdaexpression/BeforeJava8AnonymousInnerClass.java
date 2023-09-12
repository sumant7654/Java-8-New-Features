package dev.sumantakumar.anonymousinnerclassandlambdaexpression;


public class BeforeJava8AnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Child Thread = "+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
