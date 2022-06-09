package milliwatt.phuc.ungdungdahinh.main;

import java.util.Scanner;

import milliwatt.phuc.ungdungdahinh.model.Person;
import milliwatt.phuc.ungdungdahinh.model.Student;
import milliwatt.phuc.ungdungdahinh.model.Teacher;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		Teacher tc = new Teacher();
		
		input(st);
		info(st);
		
		input(tc);
		info(tc);
	}
	
	public static void info(Person p) {
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		if(p instanceof Student) {
			Student st = (Student) p;
			
			System.out.println(st.getClazz());
		}
		
		if(p instanceof Teacher) {
			Teacher tc = (Teacher) p;
			
			System.out.println(tc.getFaculty());
		}
	}
	
	public static void input(Person p) {
		System.out.println("Nhap ten");
		p.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap tuoi");
		p.setAge(new Scanner(System.in).nextInt());
		if(p instanceof Student) {
			Student st = (Student) p;
			System.out.println("Nhap class");
			st.setClazz(new Scanner(System.in).nextLine());
		}
		
		if(p instanceof Teacher) {
			Teacher tc = (Teacher) p;
			System.out.println("Nhap faculty");
			tc.setFaculty(new Scanner(System.in).nextLine());
		}
	}
}
