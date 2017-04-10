package examples;

public class ThreadDemo {

	public static void main(String[] args) {
		
		CodeRunner runner = new CodeRunner("code runner thread");
		
		Thread thread = new Thread(runner);
		thread.start();

		Thread thread2 = new Thread(runner);
		thread2.start();
	}
}