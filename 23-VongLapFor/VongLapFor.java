package milliwatt.phuc.wrapper;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class VongLapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("--");
		
		int x = 0;
		for(;x < 5;) {
			System.out.println(x);
			x+=3;
		}
		
		for ( int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		for(int i = 5; i>0 ; i--) {
			System.out.println(i);
		}
		
		int[] arrX = {1,2,3,4,5,6};
		for(int i = 0; i < arrX.length; i ++) {
			System.out.println(arrX[i]);
		}
	}

}
