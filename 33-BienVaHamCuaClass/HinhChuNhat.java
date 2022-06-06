package milliwatt.phuc.javaoop;

public class HinhChuNhat {

	static int count = 0; //moi doi tuong, class cung thay doi duoc
	//Goi truc tiep tu ten class + "." k can thong qua doi tuong
	public static int chuVi(int chieuDai, int chieuRong) {
		return (chieuDai + chieuRong) * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(HinhChuNhat.count);
		
		HinhChuNhat.count += 1;
		
		System.out.println(HinhChuNhat.count);
		
		System.out.println(HinhChuNhat.chuVi(5, 6));
		
		HinhChuNhat hinh1 = new HinhChuNhat();
		HinhChuNhat hinh2 = new HinhChuNhat();
		
		hinh1.count = 5;
		
		System.out.println(HinhChuNhat.count);
		
		hinh2.count = 10;
		
		System.out.println(hinh2.count);
		
		System.out.println(hinh1.chuVi(5, 6));
	}

}
