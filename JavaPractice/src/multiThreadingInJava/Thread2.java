package multiThreadingInJava;

//using thread class
public class Thread2 extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Thread2 th1 = new Thread2();
		th1.start();
	}
}
