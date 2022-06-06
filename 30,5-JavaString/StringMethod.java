package milliwatt.phuc.wrapper;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " Hello men ";
		
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		
		String s2 = s1.substring(2);
		String s3 = s1.substring(2,5);
		
		System.out.println(s2);
		System.out.println(s3);
		
		if(s2.equals(s3)) { //So sanh 2 string k phan biet hoa thuong
			System.out.println("bang nhau");
		} else {
			System.out.println("Khac nhau");
		}
		
		char c0 = s1.charAt(0);
		System.out.println(c0);
		
		int count = 0;
		for (int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i)=='e') {
				count++;
			}
		}
		System.out.println(count);
		
		int index = s1.indexOf(s2);//tim index dau tien cua S2 trong S1 hoac lastIndexOf 
		System.out.println(index);
		
		int lastIndex = s1.lastIndexOf(s2);
		System.out.println(lastIndex); 
		
		if(s1.contains(s2)) {
			System.out.println("co chua");
		}
		
	}

}
