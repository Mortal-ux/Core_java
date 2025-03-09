package com.sgm.Map;

public class Student {

	private int Rollno;
	private String name;
	private String dept;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	

}
