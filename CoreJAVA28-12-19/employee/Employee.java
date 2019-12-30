package com.deloitte;


public class Employee implements Comparable{
	private int empId;
	private String empName;
	private String designation;
	
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + "]";
	}
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		String desg1=this.getEmpName();
		String desg2=e.getEmpName();
		
		
		return desg1.compareTo(desg2);
	}
	
	

}
