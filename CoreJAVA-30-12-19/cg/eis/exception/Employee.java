package com.cg.eis.exception;
import java.util.Scanner;
public class Employee {
	private String name;
	private  float salary;
	
	public Employee(String name,float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void validateSalary() throws EmployeeException{
		if(salary<3000.00f)
			throw new EmployeeException();
		else
			System.out.println(this);
			System.out.println("Program Terminated");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name of Employee:");
	String n = sc.nextLine();
	System.out.println("Enter Salary of Employee:");
	float s = sc.nextFloat();
	Employee e1 = new Employee(n,s);
	try{
		e1.validateSalary();
	}
	catch(EmployeeException ee){
		System.out.println(ee);
	}
}

}
