package com.sgm.Map.comparator;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2)
	{
		int i=o1.getEmpId()-o2.getEmpId();
		return i;
	}
	

}
