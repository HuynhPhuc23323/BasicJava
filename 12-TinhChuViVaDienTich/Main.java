
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tinh chu vi va dien tich HCN
		float chieuDai = 4.5f;
		float chieuRong = 3.4f;
		
		float chuViHinhChuNhat = HinhChuNhat.chuVi(chieuDai, chieuRong);
		float dienTichHCN = HinhChuNhat.dienTich(chieuDai, chieuRong);
		System.out.println("Chu Vi Hinh Chu Nhat " + chuViHinhChuNhat);
		System.out.println("Dien tich HCN: " + dienTichHCN);
		
		float banKinh = 2f;
		
		System.out.println("Chu Vi va dien tich hinh tron la:");
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println(HinhTron.dienTich(banKinh));
		
		float canhHV= 4.5f;
		
		System.out.println("Chu vi va dien tich hinh vuong");
		System.out.println(HinhVuong.chuVi(canhHV));
		System.out.println(HinhVuong.dienTich(canhHV));
		
		//Học được tạo các class khác nhau và có chức năng
		//su dung bang cach goi ten ham va them dau . de su dung
	}

}
