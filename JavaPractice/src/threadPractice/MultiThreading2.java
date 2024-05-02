package threadPractice;


class ThreadClass extends Thread{

	@Override
	public void run() {
		System.out.println(" Thread started");
		
	}
	
	
}

public class MultiThreading2 {
	
	public static void main(String[] args) {
		
		ThreadClass thread = new ThreadClass();
		thread.start();
		
	}

	

}
