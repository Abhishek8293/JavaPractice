package multiThreadingInJava;

//using Runnable interface
public class Thread1 implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread th2 = new Thread(th1);
		th2.start();
	}
}
