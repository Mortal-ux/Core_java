package com.sgm.sync;

public class Consume extends Thread{
	Company c;
	public Consume(Company c) {
		
		this.c=c;
	}
	public void run() {
		for(int i=1;i<=10;i++)
		c.consume();
		
	}
}
