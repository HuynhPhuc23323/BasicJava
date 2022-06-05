package milliwatt.phuc.caudienkien;

import java.util.Scanner;

public class CauDienKienSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vui long nhap gia tri cua x");
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		// khong co break la no se check tat ca cac CASE phia duoi
		// neu k co break no hieu nhu la bat dau lam viec tu CASE nao va lam den cau lenh trong switch
		switch (x) {
		case 1:
			System.out.println("x = 1");
			break;
		case 2:
			System.out.println("x = 2");
			break;
		case 3:
			System.out.println("x = 3");
			break;
		default:
			System.out.println("x la default");
			break;
		}
		
	}

}
