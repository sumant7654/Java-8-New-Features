package dev.sumantakumar.lambdaexpression;

public class AfterJava8MultiThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i = 0; i< 10; i++){
                System.out.println("Child Thread = "+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
