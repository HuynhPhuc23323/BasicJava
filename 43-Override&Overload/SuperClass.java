package milliwatt.phuc.domain;

public class SuperClass {

	public int tong2So(int a, int b) {
		return a + b;
	}

	// overload method la ham giong nhau, doi so truyen vao la khac nhau
	public long tong2So(int a, long b) {
		return a + b;
	}

	public float tong2So(float a, float b) {
		return a + b;
	}
	
	public float tong2So(float a) {
		return a +10;
	}
	
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.tong2So(5, 5);
		sup.tong2So(5,5L); // phuong thuc 2
		sup.tong2So(5); // Phuong thuc cuoi
	}
}
