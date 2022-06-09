package milliwatt.phuc.domain;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Person p = new Employee(); // Da hinh, 1 doi tuong con co 1 class cha tuc la dung doi tuong cha cho 1 doi tuong con;
		
		emp.setName("A");
		emp.setLuong(4.5);
		
		p.setName("B");
		//p.setLuong(4.4); Trong Class Person k the goi ham set luong, nhung trong employee co ham set luong
		
		
		
		emp.thongTin(); // goi ngay ham thongtin o class employee
		//Trong compile time thi nhung ham nao trong class cha (Person) nhung k the goi ham o class con (employee) tu class cha o compile time duoc
		//Trong run time thi no se chay ham tren doi tuong thuc thu cua no, tuc la p o day la Employee k con la Person nua vi vay p.thongTin() no se cho kq la "class con"
		p.thongTin(); 
		// deu cho ve ket qua la class con
		
		Person person = new Person();
		person.thongTin();
		
	}
}
