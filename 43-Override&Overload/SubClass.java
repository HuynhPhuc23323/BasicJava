package milliwatt.phuc.domain;

public class SubClass extends SuperClass{
	
	//Override k bat buoc ghi, la viet lai 1 ham cua class cha
	@Override
	public float tong2So(float a) {
		return a+20;
	}
	//Cung la Override nhung k co @Override nen co
	public int tong2So(int a, int b) {
		return a+b+10;
	}
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		
		System.out.println(sub.tong2So(5, 5));
		
		SuperClass sup = new SuperClass();
		
		System.out.println(sup.tong2So(5,5));
	}
	
}
