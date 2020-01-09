package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Employee;

@Service("employeeService")
public interface EmployeeService {
	
	public List<Employee> listEmployees();
	
	public Employee addNewEmployee( Employee employee);
	
	public String deleteEmployee(Long id);
	
	public Employee findEmployeeId(Long id)throws Exception;
	public List<Employee> findByDesig(String desig);
	public List<Employee> findByName(String name);
	public List<Employee> findByDeptNo(int deptNo);
	
	public Employee updateEmployee(Employee employee);

}
