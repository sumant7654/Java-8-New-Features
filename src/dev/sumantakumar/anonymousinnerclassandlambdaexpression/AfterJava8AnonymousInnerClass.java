package dev.sumantakumar.anonymousinnerclassandlambdaexpression;

public class AfterJava8AnonymousInnerClass {
    public static void main(String[] args) {
        /*Runnable r = () -> {
            for(int i = 0; i < 10; i++){
                System.out.println("Child Thread "+i);
            }
        };
        Thread t = new Thread(r);*/
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread " + i);
            }
        });
        t.start();
    }
}
