import java.util.Scanner;

public class DocDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao gia tri");
		int x = scan.nextInt();
		
		System.out.println("Gia tri cua x la " + x);
		
		System.out.println("Vui long nhap gia tri cua y va z");
		long y = scan.nextLong();
		double d = scan.nextDouble();
		System.out.println("Tong 2 so nhap vao la: " + (y+ d));
		
		boolean b = scan.nextBoolean();
		short a = scan.nextShort();
		String ss = scan.nextLine();
		
	}

}
