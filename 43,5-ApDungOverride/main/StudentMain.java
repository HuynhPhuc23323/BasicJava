package main;

import model.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		
		st.setName("JMaster");
		st.setAge(30);
		st.setClazz("Java-15");
		
		st.input();
		st.info();
		
	}

}
