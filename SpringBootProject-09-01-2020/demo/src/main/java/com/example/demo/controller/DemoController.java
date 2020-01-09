package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class DemoController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String welcome()

	{
		return "index";
	}
	
	@RequestMapping("/login")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password)
	{
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("home");
		} else {
			modelAndView = new ModelAndView("index");
		}
		return modelAndView;
	}
	
	@GetMapping("/home")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/addEmp")
	public ModelAndView addEmpGet()throws Exception
	{
		ModelAndView mv=new ModelAndView("addEmp");
		Employee e=new Employee();
		mv.addObject("emp", e);
		return mv;
	}
	
	@PostMapping("/addEmp")
	public ModelAndView addEmpPost(@ModelAttribute("emp")Employee e)throws Exception
	{
		ModelAndView mv=new ModelAndView("printEmployee");
		mv.addObject("emp",employeeService.addNewEmployee(e));
		return mv;
	}
	@GetMapping("/allEmp")
	public ModelAndView allEmp()throws Exception
	{
		ModelAndView mv=new ModelAndView("allEmp");
		List<Employee> emps=employeeService.listEmployees();
		mv.addObject("emps",emps);
		return mv;
	}
	
	@GetMapping("/printEmployee")
	public ModelAndView print(@RequestParam("id")Long id)throws Exception
	{
		ModelAndView mv=new ModelAndView("printEmployee");
		return mv;
	}
	
	@GetMapping("/updateEmp")
	public ModelAndView updateEmpGet()throws Exception
	{
		ModelAndView mv=new ModelAndView("updateEmp");
		Employee e=new Employee();
		mv.addObject("emp", e);
		return mv;
	}
	
	@PostMapping("/updateEmp")
	public ModelAndView updateEmpPost(@ModelAttribute("emp")Employee e)throws Exception
	{
		ModelAndView mv=new ModelAndView("printUpdatedEmployee");
		mv.addObject("emp",employeeService.updateEmployee(e));
		return mv;
	}
	
	
	@GetMapping("deleteEmp")
	public ModelAndView deleteEmpGet()throws Exception
	{
		ModelAndView mv=new ModelAndView("deleteEmp");
		return mv;
	}
	
	@PostMapping("/deleteEmp")
	public ModelAndView deleteEmpPost(@RequestParam("id")Long id)throws Exception
	{
		ModelAndView mv=new ModelAndView("deletedEmp");
		mv.addObject("emp",employeeService.deleteEmployee(id));
		return mv;
	}
	
	@GetMapping("/findEmpId")
	public ModelAndView findById()throws Exception
	{
		ModelAndView mv=new ModelAndView("findEmpId");
		Employee e=new Employee();
		mv.addObject("emp", e);
		return mv;
	}
	

	@PostMapping("/findEmpId")
	public ModelAndView findById(@RequestParam("id")Long id)throws Exception
	{
		ModelAndView mv=new ModelAndView("printEmployeeById");
		mv.addObject("emp",employeeService.findEmployeeId(id));
		return mv;
	}
	
	@GetMapping("/findEmpByDesig")
	public ModelAndView findByDesig()throws Exception
	{
		ModelAndView mv=new ModelAndView("findEmpByDesig");
		return mv;
	}
	
	@PostMapping("/findEmpByDesig")
	public ModelAndView findByDesig(@RequestParam("desig")String desig)throws Exception
	{
		ModelAndView mv=new ModelAndView("allEmp");
		mv.addObject("emps",employeeService.findByDesig(desig));
		return mv;
	}
	
	@GetMapping("/findEmpByName")
	public ModelAndView findByName()throws Exception
	{
		ModelAndView mv=new ModelAndView("findEmpByName");
		return mv;
	}
	
	@PostMapping("/findEmpByName")
	public ModelAndView findByName(@RequestParam("name")String name)throws Exception
	{
		ModelAndView mv=new ModelAndView("allEmp");
		mv.addObject("emps",employeeService.findByName(name));
		return mv;
	}
	
	@GetMapping("/findEmpByDeptNo")
	public ModelAndView findByDeptNo()throws Exception
	{
		ModelAndView mv=new ModelAndView("findEmpByDeptNo");
		return mv;
	}
	
	@PostMapping("/findEmpByDeptNo")
	public ModelAndView findByDeptNo(@RequestParam("deptno")String deptno)throws Exception
	{
		ModelAndView mv=new ModelAndView("allEmp");
		int deptNoInt = Integer.parseInt(deptno);
		mv.addObject("emps",employeeService.findByDeptNo(deptNoInt));
		return mv;
	}
	

}
