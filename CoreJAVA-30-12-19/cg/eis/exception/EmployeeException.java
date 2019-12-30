package com.cg.eis.exception;

public class EmployeeException extends Exception{
	public String toString(){
		return "Salary of employee should be greater than 3000.00";
	}
}
