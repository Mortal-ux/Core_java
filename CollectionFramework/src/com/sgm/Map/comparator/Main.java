package com.sgm.Map.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,Employee> hm=new HashMap();
		
		Employee e1=new Employee(15,"Neha",80000,"Testing");
		
		Employee e2=new Employee();
		e2.setEmpId(10);
		e2.setName("Shraddha");
		e2.setEmpSalary(50000);
		e2.setDepartment("HR");
		
		Employee e3=new Employee();
		e3.setEmpId(12);
		e3.setName("Shruti");
		e3.setEmpSalary(30000);
		e3.setDepartment("Management");
		
		Employee e4=new Employee(18,"Priya",60000,"Training");
		
		Employee e5=new Employee(20,"Shrisadnyaa",50000,"Technician");
		
		String k1="abc";
		String k2="pqr";
		String k3="xyz";
		String k4="stu";
		String k5="lmn";

		hm.put(k1, e1);
		hm.put(k2, e2);
		hm.put(k3, e3);
		hm.put(k4, e4);
		hm.put(k5, e5);
		hm.put("hmj", new Employee(16,"Shreya",70000,"Communication"));
		
		System.out.println(hm);
		
		Collection<Employee>c=hm.values();
		
		System.out.println("----------------");
		
		for(Employee emp:c) {
			
			System.out.println(emp);
		}
		
		System.out.println("-----SortById-----");
		ArrayList<Employee>al=new ArrayList(c);
		
		Collections.sort(al, new SortById());
		
		for(Employee emp:al) {
			
			System.out.println(emp);
		}
		
		System.out.println("-----SortByName-----");
		
		Collections.sort(al, new SortByName());
		
		for(Employee emp:al) {
			
			System.out.println(emp);
		}
		
	System.out.println("-----SortBySalary-----");
		
		Collections.sort(al, new SortBySalary());
		
		for(Employee emp:al) {
			
			System.out.println(emp);
		}

	}

}
