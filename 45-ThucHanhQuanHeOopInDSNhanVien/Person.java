package milliwatt.phuc.domain;

public class Person {

	private String ten;
	private Address address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person(String ten) {
		super();
		this.ten = ten;
	}



	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
