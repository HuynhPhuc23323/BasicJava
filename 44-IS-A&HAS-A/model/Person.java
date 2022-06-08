package model;


public class Person {

	private String ten;
	private DiaChi diaChi; // HAS-A; moi person has a "dia chi"
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public DiaChi getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
