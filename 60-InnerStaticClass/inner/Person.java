package milliwatt.phuc.inner;

public class Person {

	//inner static class
	//Co the thay doi quan ly truy cap, va lam moi thu nhu class bth
	public static class Kid{
		public void hello() {
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		Person.Kid kid = new Person.Kid();
		
		kid.hello();
	}
}
