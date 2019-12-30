package com.deloitte;

import java.util.Arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		emp[0]= new Employee(102,"Akash","Associate Analyst");
		emp[1]= new Employee(123,"Ajay","Android Developer");
		emp[2]= new Employee(111,"Narendra","UI Designer");
		
		System.out.println("================");
		System.out.println("Employee List sorted by Name");
		Arrays.sort(emp);
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i]);
		}
		
		System.out.println("================");
		System.out.println("Employee List sorted by Designation");
		CompareByDesignation cd=new CompareByDesignation();
		Arrays.sort(emp,cd);
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i]);
		}
		
		System.out.println("================");
		System.out.println("Employee List sorted by Id");
		CompareById ci=new CompareById();
		Arrays.sort(emp,ci);
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i]);
		}
		
	}

}
