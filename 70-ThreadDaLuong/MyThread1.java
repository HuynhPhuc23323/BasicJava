package milliwatt.phuc.thread;

public class MyThread1 implements  Runnable{

	public void run() {
		for (int i = 0; i<10;i++) {
			System.out.println("A"+i);
		}
	}

}
