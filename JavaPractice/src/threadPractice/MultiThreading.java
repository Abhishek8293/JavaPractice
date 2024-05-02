package threadPractice;


class ThreadExample implements Runnable{

	@Override
	public void run() {
		System.out.println(" First Thread started");
		
	}
	
}

public class MultiThreading{
	public static void main(String[] args) {
		
		ThreadExample firstThread = new ThreadExample();
		Thread thread = new Thread(firstThread);
		thread.start();
		
	}
}