package OOPS;

public interface D {
	
	public abstract void M1();
	
	public abstract void M2();
	
	public abstract void M3();
	
	public static void M4() {

		System.out.println(" M4 from Class D");
		D b=new AB();
		b.M5();
	}
	
	private  void M5() {
		System.out.println("M5 from Class D");
	}

}
