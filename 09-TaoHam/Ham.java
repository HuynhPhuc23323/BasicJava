
public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 15;
		
		int hieu = hieuHaiSo(x, y);
		printVariable(hieu);
		printVariable(tongHaiSo());
		xinChao();
		
		float chuViHinhTron = soPi() * 2;
		System.out.println(chuViHinhTron);
		
	}
	
	public static int tongHaiSo() {
		int x = 10;
		int y = 15;
		
		return x + y;
	}
	
	public static int hieuHaiSo(int x, int y) {
		return x - y;
	}
	// ham k co gia tri tra ve
	public static void xinChao() {
		System.out.println("xin chao");
	}
	
	public static float soPi() {
		return 3.14f;
	}
	
	public static void printVariable(int object) {
		System.out.println(object);
	}
}
