package milliwatt.phuc.outerclass;

public class Person {
	
	public void xinChao() {
		Kid kid = new Kid();
		
		kid.hello();
	}
}

//outer class va outer class chi co 1 loai truy cap la default
//co thua duoc ke thua, tuy o khac package thi k the thua duoc (kieu DEFAULT)
class Kid{
	private int tuoi;
	
	public void hello() {
		System.out.println("xin chao");
	}
}