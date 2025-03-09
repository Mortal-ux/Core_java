package multithreading;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\shubh\\PCAppStore\\ui\\robots.txt");
		
		int data;
		
		try {
			
			System.out.println("Ohh Really...!");
			
		} catch (Exception e) {
			
			System.out.println("It's okk....");
		
		}
		
		while((data=file.read())!=-1) {
			
			char ch = (char) data;
			
			System.out.println(ch);
			
			
			
		}
		

	}

}
