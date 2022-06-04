
public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chuVi(1, 2);
		chuVi(2.5, 1); // ham double vi sau 2.5 k co chu f
		chuVi(4.5f, 2.4f);
		chuVi(2, 2, false);
			
	}
	
	public static void chuVi(int a, int b) {
		System.out.println((a + b) * 2);
		System.out.println("ham int");
	}
	//overload
	public static void chuVi(float a, float b) {
		System.out.println((a + b) * 2);
		System.out.println("ham float");
	}
	
	public static void chuVi(double a, double b) {
		System.out.println((a + b) * 2);
		System.out.println("ham double");
	}
	//overload khac so luong tham so
	public static void chuVi(int a, int b, boolean check) {
		System.out.println("ham 4");
	}
}
