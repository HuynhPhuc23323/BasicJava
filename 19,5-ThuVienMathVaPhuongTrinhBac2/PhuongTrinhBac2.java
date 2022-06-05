package milliwatt.phuc.thuchanh;

import java.util.Scanner;

public class PhuongTrinhBac2 {
	public static void main(String[] args) {
		// Giai phuong trinh bac 2 dua tren delta

		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui nhap gia tri cua a b c");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		if (a == 0) {
			System.out.println("Phuong trinh co nghiem la " + (-c) / b);
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep la " + (-b) / (2 * a));
			} else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		System.out.println("Ket thuc");
	}
}
