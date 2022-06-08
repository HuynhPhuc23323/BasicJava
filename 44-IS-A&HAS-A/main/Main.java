package main;

import model.Person;
import model.DiaChi;
import model.Employee;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setTen("A");
		emp.setDiaChi(null);
		
		DiaChi diaChi = new DiaChi();
		diaChi.setTenDuong("Hanoi");
		
		emp.setDiaChi(diaChi);
		
		System.out.println(emp.getTen());
		System.out.println(emp.getDiaChi().getTenDuong());
	}
	

	
}
