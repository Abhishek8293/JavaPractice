package multiThreadingInJava;

public class YeildMethodTest extends Thread {
    public void run() {
        for (int i = 0; i < 4; ++i) {
            Thread.yield();  // By calling this method, YieldMethodTest stop its execution and giving a chance to a main thread
            System.out.println("Thread started :" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended :" + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        YeildMethodTest th1 = new YeildMethodTest();
        th1.start();
        for (int i = 0; i < 4; ++i) {
            System.out.println("Thread started :" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended :" + Thread.currentThread().getName());
    }
}