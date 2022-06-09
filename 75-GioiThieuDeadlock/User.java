package milliwatt.phuc.thread;

public class User implements Runnable{
	
	BankAccount bankAccount;
	
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		// TODO Auto-generated method stub
		sendNotify();
	}
	
	public synchronized void sendNotify() {
		System.out.println(Thread.currentThread().getName() + " User");
		
		System.out.println(Thread.currentThread().getName() + " Waiting for bankAccount ...");
		
		bankAccount.deposit();
		
	}
}
