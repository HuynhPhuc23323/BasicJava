package milliwatt.phuc.docghifile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFile {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileInputStream fileInputStream = new FileInputStream(file);

		int c = fileInputStream.read();
		while (c != -1) {
			System.out.print((char)c);
			c = fileInputStream.read();
		}
		fileInputStream.close();
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		String s = "hello ";
		
		fileOutputStream.write(s.getBytes()); //de chong len du lieu cu
		
		fileOutputStream.close();
		
		
	}

}
