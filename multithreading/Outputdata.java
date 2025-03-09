package multithreading;

import java.io.FileOutputStream;
import java.io.IOException;

public class Outputdata {

	public static void main(String[] args) throws IOException{

		String data = " Hello World ";
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\shubh\\PCAppStore\\ui\\robots.txt");
		
		System.out.println(" Hello Shubham....!");
		byte[] bte = data.getBytes();
		
		file.write(bte);
		
		System.out.println(" Data Inserted Successfully ");
		
	}

}















