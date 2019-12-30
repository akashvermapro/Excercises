package com.deloitte;
import java.util.Comparator;

public class CompareById implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.getEmpId()-e2.getEmpId();
	}

}
