package milliwatt.phuc.javaoop;

public class Phim {

	// Co' 3 loai bien
	// 	+ Bien local
	//  + Bien instance
	//  + Bien Static
	// Co 2 loai ham: static, instance
	
	public String tenPhim;	
	public static String giaPhim;
	
	public Phim() {
		int x = 0;
	}
	
	public void xemPhim() {
		String xem = "xin chao"; // bien local ton tai trong ham neu ham thuc thi xong bien se chet
		System.out.println(xem);
	}
	
	public static void giaPhim() {
		System.out.println("");
	}
	
}
