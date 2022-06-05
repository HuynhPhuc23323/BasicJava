package milliwatt.phuc.wrapper;

public class Mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 10;
		int x2 = 15;
		int x3 = 20;
		
		int[] mangX = new int[3]; // k khuyen dung int mangX[] = new int[3];
		mangX[0] = 10;
		mangX[1] = 15;
		mangX[2] = 20;
		
		System.out.println(mangX[2]+mangX[1]);
		
		long[]mangLong = {4,5,6,7,8};
		System.out.println(mangLong[4]);
		
		System.out.println(mangLong.length);
	}

}
