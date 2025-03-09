package multithreading;

public class ReverseNo implements Runnable {
	public void run() {
		for(int i=50;i>=1;i--) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Reverse Number:"+i);
		}
	}

}
