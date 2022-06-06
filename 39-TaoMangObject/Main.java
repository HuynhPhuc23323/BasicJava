package milliwatt.phuc.domain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		NhanVien[] nhanViens = new NhanVien[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap 3 doi tuong vao mang");
		
		for(int i = 0; i< nhanViens.length; i++) {
			String ten = scan.nextLine();
			String diaChi = scan.nextLine();
			int tuoi = scan.nextInt();
			
			nhanViens[i] = new NhanVien(ten, diaChi, tuoi);
			//xoa bo nho dem cua ban phim
			scan.nextLine();
		}
		
		for(NhanVien nv : nhanViens) {
			System.out.println(nv.getTen() + " " + nv.getDiaChi()+ " " + nv.getTuoi());
		}
	}

}
