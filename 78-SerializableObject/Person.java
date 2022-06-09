package milliwatt.phuc.seri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;

	public Person(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p = new Person(1);
		
		File file = new File("demo.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream  fileOutputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(p);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		Person p1 = (Person) inputStream.readObject();
		
		System.out.println(p1.getId());
		
		
	}
}
