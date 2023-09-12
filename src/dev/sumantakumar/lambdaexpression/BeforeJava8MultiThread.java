package dev.sumantakumar.lambdaexpression;

class MyThreadExample implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Child Thread="+i);
        }
    }
}
public class BeforeJava8MultiThread {
    public static void main(String[] args) {
        Runnable runnable = new MyThreadExample();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
