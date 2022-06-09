package milliwatt.phuc.thread;

public class Account implements Runnable{

	private int balance = 1000;
	
	public void run() {

		withdraw();
		
	}
	
	public void withdraw() {
		try {
			balance = balance - 1000;
			
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(3000);
			if(balance < 0 ) {
				System.out.println("Het tien");
			} else {
				System.out.println("OK");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
}
