package com.sgm.sync;

public class Main {

	public static void main(String[] args) {

		Company com=new Company();
		Produce p=new Produce(com);
		Consume c=new Consume(com);
		
		p.start();
		c.start();
		
	}

}
