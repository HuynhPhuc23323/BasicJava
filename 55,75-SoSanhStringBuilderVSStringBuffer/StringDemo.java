package milliwatt.phuc.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "hello"; //Luu trong heap
		s = s +" Trung Tam Java";//trong heap rat ton bo nho
		
		
		//Nen sd string builder de tao cau lenh
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("hello ");
		stringBuilder.append("Trung tam java"); // it ton bo nho Heap voi 2 String hon
		//nhanh hon voi String thuong va String buffer
		String s2 = stringBuilder.toString();
		
		System.out.println(s2);
		
		StringBuffer stringBuffer = new StringBuffer("hello");
		stringBuffer.append("Trung tam java");
		
		System.out.println(stringBuffer.toString());
	}

}
