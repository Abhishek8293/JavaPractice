package multiThreadingInJava;

public class Thread3 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread one");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread3 th1 = new Thread3();
		th1.start();
		System.out.println(Thread.currentThread().getName());
	}
}
