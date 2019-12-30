package com.deloitte;
import java.util.Comparator;
public class CompareByDesignation implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2){
		return e1.getDesignation().compareTo(e2.getDesignation());
	}

}
