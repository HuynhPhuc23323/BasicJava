package milliwatt.phuc.javaoop;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(); //constructor mac dinh
		book1.setTen("A");
		book1.setMoTa("A");
		book1.setGia(4.5);
		
		Book book2 = new Book(4.6);
		System.out.println(book2.getGia());
		
		Book book3 = new Book("A3", "A");
		System.out.println(book3.getTen());
		
		Book book4 = new Book("A4","B",5.4);
		System.out.println(book4.getTen());
		
		Book book5 = new Book(book4);
		System.out.println(book5.getTen());
		
	}

}
