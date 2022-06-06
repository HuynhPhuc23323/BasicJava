package milliwatt.phuc.domain;

public class HinhVuong {

	public void chuVi() {
		System.out.println("chu vi");
	}
	
	public static void xinChao(HinhVuong hinhVuong) {
		String s = "hello";
		System.out.println(s);
		hinhVuong.chuVi();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x);
		HinhVuong hinhVuong = new HinhVuong();
		xinChao(hinhVuong);
	}

}
