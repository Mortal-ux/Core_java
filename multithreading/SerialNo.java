package multithreading;

public class SerialNo extends Thread {
	public void run(){
		for(int j=1;j<=50;j++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Serial Numbers:"+j);
		}
		
	}

}
