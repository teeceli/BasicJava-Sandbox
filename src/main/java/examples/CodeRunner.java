package examples;

public class CodeRunner implements Runnable{
	
	private String threadName;
	
	public CodeRunner(final String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		synchronized (threadName) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " looping " + threadName + " with thread name: " + 
					Thread.currentThread().getName() + " isAlive? " + Thread.currentThread().isAlive() +
					" activeCount: " + Thread.activeCount());
				
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					break;
				}
			}
		}
	}
}