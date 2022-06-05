package milliwatt.phuc.caudienkien;

import java.util.Scanner;

public class CauDieuKienIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui long nhap vao gia tri");
		
		int x = scan.nextInt();
		
		if (x > 5) {
			System.out.println("Gia tri cua x lon hon 5");
		} else {
			if (x == 5) {
				System.out.println("Gia tri cua x = 5");
			} else {
				System.out.println("Gia tri cua x < 5");
			}
		}
		
		System.out.println(" Vui long nhap gia tri cua y");
		
		int y = scan.nextInt();
		
		if(y == 5) {
			System.out.println("Gia tri cua y = 5");
		} else if(y > 5) {
			System.out.println("Gia tri cua y > 5");
		} else {
			System.out.println("Gia tri cua y < 5");
		}
		
		System.out.println("Ket thuc");
		
	}

}
