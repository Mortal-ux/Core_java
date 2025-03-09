package Trycatch;

public class AB {

	public static void main(String[] args) {
		try {
			int a=20; int b=0;
			int c=a/b;
			System.out.println(c);
			String n=null;
			System.out.println(n.length());
		}
		catch(ArithmeticException a) {
			System.out.println("cannot devide by zero ");
		}
		catch(NullPointerException e) {
			System.out.println("cannot find length");
		}
		catch(Exception e) {
			
		}
	}

}
