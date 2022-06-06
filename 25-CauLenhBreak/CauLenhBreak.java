package milliwatt.phuc.wrapper;

public class CauLenhBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			break; // ngung vong lap nngay khi gap
		}
		
		for (int k = 0; k<10; k++) {
			System.out.println(k);
			if(k==5) {
				break;
			}
		}
		int x = 1;
		switch(x) {
		case 1: 
			System.out.println(x);
			break;
		}
		
		for (int i = 0; i< 5; i++) {
			System.out.println("Gia tri cua i = "+i);
			for(int j = 0;j < 5;j++) {
				System.out.println("Gia tri cua j = "+j);
				break; // ngung vong lap hien tai k ngung vong lap o ngoai no
			}
		}
	}

}
