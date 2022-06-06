package milliwatt.phuc.javaoop;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per1= new Person();
		per1.setTen("A");
		per1.setTuoi(10);
		
		Person per2 = new Person();
		per2.setTen("B");
		per2.setTuoi(12);
		
		System.out.println(per1.ten + " Tuoi: " + per1.tuoi);
		
		System.out.println(per2.ten + " Tuoi: " + per2.tuoi);
	}

}
