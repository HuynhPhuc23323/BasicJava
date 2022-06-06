package milliwatt.phuc.wrapper;

public class CauLenhContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for(int i = 0; i< 10; i++) {
			 if(i<5) {
				 continue;
				 //Cau lenh nay se bo qua cau lenh phia duoi no va tiep tuc vong lap
				 //Kha giong voi break nhung van tiep tuc vong lap 
				 //Chi anh huong den vong lap cua chinh no
			 }
			 System.out.println(i);
		 }
		 
		 for(int i = 0; i <5; i++) {
			 System.out.println("Gia tri cua i "+i);
			 for(int j = 0; j<5;j++) {
				 if(j>0) {
					 continue;
				 }
				 System.out.println("j = "+j);
			 }
		 }
		
	}

}
