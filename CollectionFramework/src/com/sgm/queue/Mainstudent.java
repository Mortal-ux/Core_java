package com.sgm.queue;

import java.util.*;

public class Mainstudent {

	public static void main(String[] args) {
		
		ArrayDeque <Student>ad=new ArrayDeque();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Shubham");
		s1.setDept("Computer Science");
		
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Sangram");
		s2.setDept("Civil");
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Adarsh");
		s3.setDept("E&TC");
		
		ad.add(s1);
		ad.add(s2);
		ad.add(s3);
		
		System.out.println(ad);
		
		for(Student o:ad) {
			
			System.out.println(o);
		}



	}

}
