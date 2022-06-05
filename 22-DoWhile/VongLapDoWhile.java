package milliwatt.phuc.wrapper;

public class VongLapDoWhile {

	public static void main(String[] args) {
		int i = 0;
		// Lam roi kiem tra dieu kien
		do {
			System.out.println(i);
			i++;
		} while (i < 5);

		System.out.println("Ket thuc");

		int[] x = { 1, 2, 3, 4, 5 };
		int index = 0;
		do {
			System.out.println(x[index]);
			index++;
		} while (index < x.length);
	}

}
