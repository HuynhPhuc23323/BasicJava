package milliwatt.phuc.exception;

public class XinChao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = { 1, 2 };

		try {
			System.out.println(mang[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			System.out.println("loi");
		} finally {
			//luon thuc thi du co exception hay k
			//finally phai o cuoi cung 
			System.out.println("finally");
		}
		
		System.out.println("Ket thuc");
	}

}
