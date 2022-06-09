package milliwatt.phuc.thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0 ; i< 10; i++) {
			System.out.println(super.getName() + ":" + i);
		}
	}
	
	//Chay thu
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		
//		MyThread t3 = new MyThread();
//		MyThread t4 = new MyThread();
//		
//		t3.setName("T3");
//		t4.setName("T4");
//		
//		t3.start();
//		t4.start();
//		
//		
//		MyThread t5 = new MyThread();
//		MyThread t6 = new MyThread();
//		
//		t5.setName("T5");
//		t6.setName("T6");
//		
//		t5.start();
//		t6.start();
//		
//		MyThread t7 = new MyThread();
//		MyThread t8 = new MyThread();
//		
//		t7.setName("T7");
//		t8.setName("T8");
//		
//		t7.start();
//		t8.start();
//		
//		MyThread t9 = new MyThread();
//		MyThread t10 = new MyThread();
//		
//		t9.setName("T9");
//		t10.setName("T10");
//		
//		t9.start();
//		t10.start();
//		
//		
//		MyThread t11 = new MyThread();
//		MyThread t12 = new MyThread();
//		
//		t11.setName("T11");
//		t12.setName("T12");
//		
//		t11.start();
//		t12.start();
//		
//		
//		MyThread t13 = new MyThread();
//		MyThread t14 = new MyThread();
//		
//		t13.setName("T13");
//		t14.setName("T14");
//		
//		t13.start();
//		t14.start();
//		
//		MyThread t15 = new MyThread();
//		MyThread t16 = new MyThread();
//		
//		t15.setName("T15");
//		t16.setName("T16");
//		
//		t15.start();
//		t16.start();
//		
//		MyThread t17 = new MyThread();
//		MyThread t18 = new MyThread();
//		
//		t17.setName("T17");
//		t18.setName("T18");
//		
//		t17.start();
//		t18.start();
//		
//		MyThread t19 = new MyThread();
//		MyThread t20 = new MyThread();
//		
//		t19.setName("T19");
//		t20.setName("T20");
//		
//		t19.start();
//		t20.start();
		
	}

}
