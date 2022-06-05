package milliwatt.phuc.wrapper;

import javax.security.auth.x500.X500Principal;

public class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		//Check dieu kien roi lam
		while (i<5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Ket thuc ");
		
		int[] arr= {1,2,3,4,5};
		int index = 0;
		while (index < arr.length) {
			System.out.println(arr[index]);
			index++;
			
		}
	}

}
