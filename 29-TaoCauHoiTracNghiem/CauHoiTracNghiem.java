package milliwatt.phuc.wrapper;

import java.util.Scanner;

public class CauHoiTracNghiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Lenh tiep tuc vong lap trong JAVA la gi");
			System.out.println("1. continue");
			System.out.println("2. break");
			System.out.println("Bam Q de thoat");
			String luaChon = scan.nextLine();
			
			if(luaChon.equals("1")) {
				System.out.println("Ban tra loi dung");
				break;
			} else if(luaChon.equals("2")) {
				System.out.println("Ban tra loi sai");
				break;
			} else if(luaChon.equals("q")) {
				break;
			} else {
				System.out.println("Vui long chon dap an");
			}
		}
		
	}

}
