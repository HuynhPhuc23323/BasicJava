package milliwatt.phuc.domain;

public class Main {

	public static void main(String[] args) {
		
		NhanVien nhanVien = new NhanVien();
		nhanVien.ten = "A";
		nhanVien.diaChi = "HN";
		nhanVien.luong = 4.65;
		
		//ham
		nhanVien.setTen("B");
		nhanVien.setDiaChi("HN");
		
		nhanVien.mucLuong();
		
		
	}

}
