package sandbox;

public class MyThread implements Runnable{
	
	Balance balance = new Balance();
	

	public void run() {
	
		synchronized (this) {
			System.out.println("balance before = " + balance.getBalance() + " for thread: " + Thread.currentThread());	

			setBalance(balance);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("balance after = " + balance.getBalance() + " for thread: " + Thread.currentThread());	
		}
	}

	private void setBalance(Balance balance2) {
		
		System.out.println("updating balance for thread: " + Thread.currentThread());

		Integer amount = balance.getBalance();

		balance.setBalance(amount + 5);
	}
}