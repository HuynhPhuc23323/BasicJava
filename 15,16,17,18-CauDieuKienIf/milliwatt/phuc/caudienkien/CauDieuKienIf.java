package milliwatt.phuc.caudienkien;

import java.util.Scanner;

public class CauDieuKienIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap vao gia tri cua x");
		int x = scan.nextInt();
		
		//cau dieu kien if
		
		if (x > 5) {
			System.out.println("Gia tri cua x >5");
			
		}
		
		if (x == 5) {
			System.out.println("Gia tri cua x = 5");
		} else {
			System.out.println("Gia tri cua x khac 5");
		}
		
		if (x >=10) {
			System.out.println("gia tri cua x lon hon hoac bang 10");
		}
		
		if(x <= 15) {
			System.out.println("Gia tri cua x be hon haoc bang 15");
		}
		
		System.out.println("Ket thuc");
		
	}

}
