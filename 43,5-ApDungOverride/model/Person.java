package model;

import java.util.Scanner;

public class Person {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public void input() {
		System.out.println("Nhap vao ten");
		this.name = new Scanner(System.in).nextLine();
		
		System.out.println("Nhap vao tuoi");
		this.age = new Scanner(System.in).nextInt();
	}
	
}
