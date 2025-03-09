package com.sgm.Map.comparator;

public class Employee {
	
	private int empId;
	private String name;
	private long empSalary;
	private String department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int empId, String name, long empSalary, String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.empSalary = empSalary;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empSalary=" + empSalary + ", department=" + department
				+ "]";
	}
	
	
	

}
