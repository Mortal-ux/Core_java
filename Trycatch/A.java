package Trycatch;

public class A {
	
	public static void main(String args[]) {
		System.out.println("program starts");
		try {
			String s=null;
			System.out.println(s.charAt(2));
		}
		catch(Exception  e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("String is null");
		}
		System.out.println("program end");
	}
}
