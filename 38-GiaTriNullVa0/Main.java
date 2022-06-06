package milliwatt.phuc.domain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		float k = 0.0f; 
		
		Phim phim = null;//ko mang gia tri nao ca. Chua tro doi tuong nay den HEAP nao ca.
		//phim duoc luu trong STACK, va bien phim nay k sd cac ham cua doi tuong Phim duoc
		
		//phim.setTen("A"); 
		//Truy cap pointer rong nen Ten chi duoc bang rong
		
		phim = new Phim(); // Tro den vung nho doi tuong Phim trong HEAP nen setTen duoc
		phim.setTen("A");
	}

}
