package milliwatt.phuc.inner;

public class Animal {

	//inner class, xem no nhu 1 ham instance, k the ke thua duoc neu ngoai class chua no
	public class Dog{
		private int tuoi;
		
		public void hello() {
			System.out.println("hello");
		}
	}
	
	public class Husky extends Dog{
		
	}
	
	public static void main(String[] args) {
		Animal an = new Animal();
		
		Animal.Dog d = an.new Dog();
		
		d.hello();
	}
	
}
