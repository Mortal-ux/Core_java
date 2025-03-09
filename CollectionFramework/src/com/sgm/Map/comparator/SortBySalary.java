package com.sgm.Map.comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		long i=o1.getEmpSalary()-o2.getEmpSalary();
		
		return (int) i;
	}

}
