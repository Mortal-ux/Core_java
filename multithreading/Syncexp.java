package multithreading;

public class Syncexp {

	public static void main(String[] args) throws InterruptedException {

		
		 Counter counter = new Counter();
	        Thread thread1 = new Thread(new CounterThread(counter));
	        Thread thread2 = new Thread(new 
	        CounterThread(counter));
	        
	        thread1.start();
	        thread2.start();
	        
	        thread1.join();
	        thread2.join();
	        
	        System.out.println("Final count: " + counter.getCount());
	    }

	}


