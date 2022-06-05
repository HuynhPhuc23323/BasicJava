package milliwatt.phuc.main;

import java.util.Scanner;

import milliwat.phuc.hinhhoc.HinhTron;
import milliwat.phuc.hinhhoc.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long lua chon:");
		System.out.println("1 - Tinh chu vi va dien tich hinh vuong");
		System.out.println("2 - Tinh chu vi va dien tich hinh tron");

		int x = scanner.nextInt();

		switch (x) {
		case 1:
			System.out.println("Ban da chon hinh vuong. Vui long nhap canh ");
			float chieuDai = scanner.nextFloat();
			System.out.println("Chu vi hinh vuong la " + HinhVuong.chuVi(chieuDai));
			System.out.println("Dien tich hinh vuong la " + HinhVuong.dienTich(chieuDai));
			break;
		case 2:
			System.out.println("Ban da chon hinh tron. Vui long nhap ban kinh");
			float banKinh = scanner.nextFloat();
			System.out.println("Chu vi hinh tron la " + HinhTron.chuVi(banKinh));
			System.out.println("Dien tich hinh tron la " + HinhTron.dienTich(banKinh));
			break;
		default:
			System.out.println("Ban chua lua chon");
			break;
		}
		
		
		// dung if else tao menu
		if (x ==1) {
			System.out.println("Ban da chon hinh vuong. Vui long nhap canh ");
			float chieuDai = scanner.nextFloat();
			System.out.println("Chu vi hinh vuong la " + HinhVuong.chuVi(chieuDai));
			System.out.println("Dien tich hinh vuong la " + HinhVuong.dienTich(chieuDai));
		} else if (x == 2) {
			System.out.println("Ban da chon hinh tron. Vui long nhap ban kinh");
			float banKinh = scanner.nextFloat();
			System.out.println("Chu vi hinh tron la " + HinhTron.chuVi(banKinh));
			System.out.println("Dien tich hinh tron la " + HinhTron.dienTich(banKinh));
		} else {
			System.out.println("Ban chua lua chon");
		}
		System.out.println("Ket thuc chuong trinh");
	}

}
