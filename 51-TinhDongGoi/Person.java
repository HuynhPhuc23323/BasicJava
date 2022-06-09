package milliwatt.phuc.dto;

public class Person {

	private String ten;
	private String ho;
	
	public void setHoTen(String ho, String ten) {
		this.ten = ten;
		this.ho = ho;
	}
	
	public String getFullName() {
		return this.ho + " " + this.ten;
	}
	
}
