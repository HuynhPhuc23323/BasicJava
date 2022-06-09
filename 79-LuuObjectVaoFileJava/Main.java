package milliwatt.phuc.luufile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Person p1 = new Person(1,"A");
		
		File file = new File("test.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(p1);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Luu thanh cong");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Person p = (Person) objectInputStream.readObject();
		
		System.out.println(p.getId() + p.getTen());
				
		
		
	}

}
