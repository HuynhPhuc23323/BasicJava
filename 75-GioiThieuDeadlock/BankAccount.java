package milliwatt.phuc.thread;

public class BankAccount implements Runnable{
	
	User owner;
	
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public void run() {
		// TODO Auto-generated method stub
		deposit();
	}
	
	public synchronized void deposit() {
		System.out.println(Thread.currentThread().getName() + " : BankAccount");
		
		System.out.println(Thread.currentThread().getName() + " Waiting for user...");
		
		owner.sendNotify();
		
	}

}
