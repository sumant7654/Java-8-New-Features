package dev.sumantakumar.methodreference;

public class MultiThreadExample {
    public static void main(String[] args) {
        MultiThreadExample obj = new MultiThreadExample();
        Runnable r = obj::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }

    public void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
