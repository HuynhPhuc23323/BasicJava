package milliwatt.phuc.dto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.setHoTen("A", "B"); // de han che k cho nguoi dung biet duoc trong do chung ta xu ly nhu the nao chi co the set get thong qua ham
		
		System.out.println(p.getFullName());
	}

}
