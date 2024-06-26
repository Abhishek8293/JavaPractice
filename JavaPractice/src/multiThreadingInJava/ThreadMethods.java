package multiThreadingInJava;

class DisplayMessage implements Runnable {
	public int count = 1;
	private final String mes;

	public DisplayMessage(String message) {
		this.mes = message;
	}

	public void run() {
		while (count <= 5) {
			System.out.println(mes);
			count++;
		}
	}
}

class GuessANumber extends Thread {
	private final int num;

	public GuessANumber(int number) {
		this.num = number;
	}

	public void run() {
		int counter = 0;
		int guess = 0;
		do {
			guess = (int) (Math.random() * 10 + 1);
			System.out.println(this.getName() + " guesses " + guess);
			counter++;
		} while (guess != num);
		System.out.println("** Correct! " + this.getName() + "in " + counter + " guesses.**");
	}
}

public class ThreadMethods {
	public static void main(String[] args) {
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);
		thread1.setName("hello");
		System.out.println("Starting hello thread...");
		thread1.start();

		Runnable bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		System.out.println("Starting goodbye thread...");
		thread2.start();

		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumber(3);
		thread3.start();
		try {
			thread3.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

		System.out.println("Starting thread4...");
		Thread thread4 = new GuessANumber(3);
		thread4.start();
		System.out.println("main() is ending...");
	}
}
