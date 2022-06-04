
public class HinhVuong {
	public static void main(String[] args) {
		int x = 10;
		
		chuVi(x);
		
		int dienTich = dienTich(x);
		System.out.println(dienTich);
		
	}
	public static void chuVi(int a) {
		System.out.println(4 * a);
		return; // ket thuc ham, co hoac khong cung duoc ung dung ro hon khi dung de ket thuc trong if/else
	}
	
	public static int dienTich(int a) {
		return a * a;
	}
}
