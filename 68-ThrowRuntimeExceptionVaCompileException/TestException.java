package milliwatt.phuc.exception;

public class TestException {

	public static void main(String[] args) {
		chia(5,2);
		try {
		chia(5,0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		//testRuntime();
		try {
			testCompile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ket thuc");
		
		
		
	}
	
	
	//Runtime Exception
	public static void chia(int a,int b) {
		System.out.println(a/b);
	}
	
	public static void testRuntime() {
		throw new RuntimeException();
		//k can try catch nhung co loi xay ra khi chay chuong trinh
		//tu do phai try catch de du doan tinh huong 
	}
	
	//compile
	public static void testCompile() throws Exception {
		throw new Exception();
		//thi co the biet trc compile exception nao xay ra loi de catch
	}
}
