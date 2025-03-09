package OOPS;

public abstract class A {
	int a,b,c;

	public void add() {
		
		 a=20;
		 b=10;
		 c=a+b;
		
		System.out.println("Addition of Numbers: "+c);
	}
	
	public void sub() {
		 a=20;
		 b=10;
		 c=a-b;
	System.out.println("Subtaction of Numbers: "+c);
	}
	
	
	public abstract void mul();
	
	public abstract void Div();
}
