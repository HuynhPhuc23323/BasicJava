package milliwatt.phuc.domain;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		if (p instanceof Worker) {
			((Worker)p).luong();
		} else {
			System.out.println("Khong phai Worker");
		}
		
		Person p2 = new Worker();
		if (p2 instanceof Worker) {
			System.out.println("Worker"); // vi p2 tro den new Worker();
		} 
		if (p2 instanceof Employee) { // vi p2 la Worker, la con cua Employee nen ket qua tra ve la true
			System.out.println("Employee");
		}
	}
}
