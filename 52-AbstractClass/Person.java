package milliwatt.phuc.domain;

public abstract class Person {
	//k the tao duoc voi doi tuong moi
	// Person p = new Person(); thi k duoc vi dac tinh cua Abstract Class
	//Abstact class la class chuyen dung de lam lop class hay chi cho viec ke thua
	
	private String ten;
	
	public Person() {}
	
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

	
	
}
