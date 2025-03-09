package com.sgm.sync;

public class Company {
	
	int a;
	boolean b=false;
	synchronized public void produce(int a) {
		while(b) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		this.a=a;
		System.out.println("Produce = "+a);
		b=true;
		notify();
	}
	
	synchronized public int consume() {
		while(!b)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("Consume = "+a);
		b=false;
		notify();
		return a;
		
	}
}
