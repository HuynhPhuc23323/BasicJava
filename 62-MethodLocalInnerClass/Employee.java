package milliwatt.phuc.inner;

public class Employee {

	public void luong() {
		class Worker{ 
			//chi co the truy xuat trong phuong thuc do thoi
			//Neu ngoai phuong thuc luong thi class Worker xem nhu k ton tai
			
			private String ten;
			
			public void luong() {
				System.out.println("Luong cong nhan");
			}
		}
		Worker w = new Worker();
		w.luong();
	}
	
	public static void main(String[] args) {
		Employee em = new Employee();
		em.luong();
	}
	
}
