package milliwatt.phuc.domain;

public class Employee extends Person{

	private double luong;

	
	
	public Employee() {
		super();
	}

	public Employee(String ten) {
		super(ten);
	}
	

	public Employee(String ten, double luong) {
		super(ten);
		this.luong = luong;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	
	
}
