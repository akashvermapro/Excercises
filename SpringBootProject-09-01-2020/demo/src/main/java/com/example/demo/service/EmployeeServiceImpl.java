package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> listEmployees()
	{
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	
	public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
		
	}

	public Employee addNewEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
		
	}
	
	public String deleteEmployee(Long id) {
	         return employeeRepository.findById(id).map(emp -> {
	        	 employeeRepository.delete(emp);
	        	 return id+" deleted";
	         }).orElseThrow(() -> new ResourceNotFoundException("Employee Id"+id+"not found"));
	}
	
	 public Employee findEmployeeId(Long id) throws Exception 
	    {
	        Optional<Employee> employee = employeeRepository.findById(id);
	         
	        if(employee.isPresent()) {
	        return	employee.get();
	        } 
	        else 
	        {
	            throw new Exception("No employee record exist for given id");
	        }
	    }
	 
	 public List<Employee> findByDesig(String desig){
		 return employeeRepository.findByDesig(desig);
	 }
	 public List<Employee> findByName(String name){
		 return employeeRepository.findByName(name);
	 }
	 public List<Employee> findByDeptNo(int deptNo){
		 return employeeRepository.findByDeptNo(deptNo);
	 }
	
}
