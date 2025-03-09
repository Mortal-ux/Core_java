package multithreading;

public class Main {
	public static void main(String[] args) {
		ReverseNo r=new ReverseNo();
		Thread t=new Thread(r);
		t.start();
		SerialNo s=new SerialNo();
		s.start();
	}

}
