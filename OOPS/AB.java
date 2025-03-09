package OOPS;

public class AB implements D{
	public void M1() {
		System.out.println("M1 is From D");
	}
	public void M2() {
		System.out.println("M2 is from D");
		
	}
	public void M3() {
		System.out.println("M3 is from D");
		
	}
	public static void main(String args[]) {
		D a=new AB();
		a.M1();
		a.M2();
		a.M3();
		D.M4();
		
	}
	

}
