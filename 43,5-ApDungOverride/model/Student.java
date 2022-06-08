package model;

import java.util.Scanner;

public class Student extends Person{
	private String clazz;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public void info() {
		super.info();
		
		System.out.println(this.clazz);
	}
	
	@Override
	public void input() {
		super.input();
		
		System.out.println("Nhap vao class");
		this.clazz = new Scanner(System.in).nextLine();
	}
}
