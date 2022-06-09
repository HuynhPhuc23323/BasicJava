package milliwatt.phuc.exception;

import milliwatt.phuc.exception.MyException;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			chia2So(1,0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getError());
		}
	}

	public static void chia2So(int a, int b) throws MyException {
		try {
			int kq = a / b;

			System.out.println(kq);
		} catch (Exception e) {
			throw new MyException("Loi chia cho khong");
		}

	}

}
