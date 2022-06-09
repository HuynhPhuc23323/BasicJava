package milliwatt.phuc.exception;

public class NgoaiLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mang = { 1, 2 };
		try {
			System.out.println(mang[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("loi " + e);
			
		} catch (Exception e) {
			//Exception la cha cua moi exception nen nam o catch cuoi hoac 1 catch nay la du
			System.out.println("Loi 2");
		}
		System.out.println("ket thuc");

	}

}
