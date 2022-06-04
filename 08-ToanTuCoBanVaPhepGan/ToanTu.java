
public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 14;
		
		int tong = x + y;
		int hieu = y - x;
		int tich = x * y;
		int thuong = x / y;
		int du = y % x;
		
		System.out.println(tong);
		System.out.println(hieu);
		System.out.println(tich);
		System.out.println(thuong);
		System.out.println(du);
		
		// so thuc
		float f1 = 3.6f;
		float f2 = 4.6f;
		
		float tongf = f1 + f2;
		System.out.println(tongf);
		
		//nang kieu trong java
		byte b = 4;
		short s = 67;
		int i = 100;
		long k = 400L;
		
		long tongL = k + i + s + b;
		int tongI = i + s + b; //khong the + k vi kieu long lon hon int
		
		int tongK = (int)k + i + s + b;
		
		double d1 = 4.5;
		double tongD = d1 + k;
		
		long tongD1 = (long)d1 + k; //d1 = 4.5 bi ep xuong d1 = 4
		System.out.println(tongD1);
		
		// phep gan
		
		int t = 10;
		t = t + 5; // t += 5;
		System.out.println(t);
		
		t += 5;
		System.out.println(t);
		t -=5;
		System.out.println(t);
		t /= 5;
		t *= 5; 
	}

}
