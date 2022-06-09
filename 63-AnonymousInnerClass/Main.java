package milliwatt.phuc.inner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonService p = new PersonService() {
			// dau "()" duoc xem nhu 1 constructor mac dinh cua class
			// sau tu khoa new se new 1 doi tuong va doi tuong nay la Anonymous class
			// Anonymous class la class an danh k duoc dat ten
			// no se thuc thi interface PersonService
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};

		p.hello();
		
		XinChao x = new XinChao() {
		
			public void xinChao() {
				super.xinChao();
			}
			
		};
		x.xinChao();
	}

}

abstract class XinChao{
	public void xinChao() {
		System.out.println("xin chao");
	}
}
