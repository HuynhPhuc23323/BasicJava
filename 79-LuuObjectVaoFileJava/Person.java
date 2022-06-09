package milliwatt.phuc.luufile;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int id; //transient k luu gia tri id trong file
	private String ten;
	
	
	public Person(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	} 
	
	
	
}
