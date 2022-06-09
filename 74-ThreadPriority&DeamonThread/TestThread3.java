package milliwatt.phuc.thread;

public class TestThread3 extends Thread{

	@Override
	public void run() {
		for(int i =0; i< 5; i++) {
			System.out.println(this.getName() + " "+ i);
		}
	}
	
	public static void main(String[] args) {
		TestThread3 t1 = new TestThread3();
		TestThread3 t2 = new TestThread3();
		TestThread3 t3 = new TestThread3();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		
//		t1.start();
//		t2.start();
//		t3.start();
//		
		//daemon thread
		t1.setDaemon(true); 
		//User thread vd: t1,t2,t3 va daemon thread se chay ngam ben duoi nhu chuong trinh don rac
		
		System.out.println(t1.isDaemon());
		
	}
}
