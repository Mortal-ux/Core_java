
public class Thread1 extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println(" REGALTOS ");
	}
	public void run() {
		Thread t= Thread.currentThreadName();
		@SuppressWarnings("unused")
		String str=t.getName();
	}

}
