package milliwatt.phuc.wrapper;

import java.util.Scanner;

public class ThaoTacMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mang = new int[5];
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Vui long nhap 5 gia tri vao mang");
		
		for (int i = 0; i < mang.length; i++ ) {
			mang[i] = scan.nextInt();
		}
		System.out.println("Mang duoc nhap vao la ");
		for (int x : mang) {
			System.out.println(x);
		}
		
		//Tim phan tu trong mang
		System.out.println("Vui long nhap phan tu muon tim kiem trong mang");
		int k = scan.nextInt();
		for (int i = 0;i < mang.length;i++) {
			if(k == mang[i]) {
				System.out.println("Phan tu o vi tri thu "+i);
			}
		}
		 // Xep theo tang dan
		for(int i=0; i< mang.length;i++) {
			int temp = mang[i];
			for(int j = i+1; j <mang.length;j++) {
				if(temp > mang[j]) {
					mang[i] = mang[j];
					mang[j] = temp;
					temp = mang[i];
				}
			}
		}
		System.out.println("Mang duoc sap xep la ");
		for (int x : mang) {
			System.out.println(x);
		}
		
		//giam dan
		for(int i=0; i< mang.length;i++) {
			int temp = mang[i];
			for(int j = i+1; j <mang.length;j++) {
				if(temp < mang[j]) {
					mang[i] = mang[j];
					mang[j] = temp;
					temp = mang[i];
				}
			}
		}
		System.out.println("Mang duoc sap xep la ");
		for (int x : mang) {
			System.out.println(x);
		}
		
	}

}
