package milliwatt.phuc.domain;

public class Main {

	public static void main(String[] args) {
		
		long x = 10;
		int i = (int)x;
		
		Worker w =new Worker();
		Employee e  = new Worker();
		Person p = new Worker();
		Object obj = new Worker();
		
		w.luong();
		//e.luong(); k thuc thi duoc
		Worker k1 = (Worker)e;
		k1.luong();
		((Worker)p).luong(); //ep kieu tu kieu cha ve kieu con
		
		((Employee) obj).toString();
		// mac du obj la kieu Worker, nhung co the ep xuong Employee vi Worker la con cua Employee vi vay co the ep kieu cha cua no
	
		
	}
}
