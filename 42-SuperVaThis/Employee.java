package milliwatt.phuc.domain;

public class Employee extends Person{
	String ten;
	
	public void thongTin() {
		this.ten = "B";
		System.out.println("Thong tin class con la " + this.ten);
		
		super.thongTin();//Tu khoa super dung de tro den lop cha, this tro den lop chinh no
		super.ten = "B";
		this.ten ="C";
		
	}
}
