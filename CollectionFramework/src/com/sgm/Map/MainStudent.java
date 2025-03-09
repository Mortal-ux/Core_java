package com.sgm.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;



public class MainStudent {

	public static void main(String[] args) {

		LinkedHashMap hm=new LinkedHashMap();
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Shubham");
		s1.setDept("Computer Science");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Aditya");
		s2.setDept("E&TC");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("Sangram");
		s3.setDept("Mechanical");
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
				
		//Collection<Student>c=hm.values();
		ArrayList <Student>al=new ArrayList<>(hm.values());
		System.out.println(hm);
		System.out.println(al);
		
		for(Student s:al){	
			System.out.println(s);
		}
		
	}

}
