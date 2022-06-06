package milliwatt.phuc.wrapper;

public class PhepToanCongTru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0;
		i++;
		in(i);
		++i;
		in(i);
		
		//Thu nghiem
		i = 0;
		in(i++); // Sau khi chay cau lenh thi I moi bang 1
		i = 0;
		in(++i); //Cong gia tri truoc roi moi thuc thi ham IN
		//Tuong tu voi --
	}
	
	public static void in(int i) {
		System.out.println(i);
	}

}
