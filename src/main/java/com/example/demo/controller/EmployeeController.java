package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enitity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees()
	{
		 return employeeService.getAllEmployees();
	}
	
    @PutMapping("/put/{id}")
    public Employee upadateEmployee(@PathVariable int id,@RequestBody Employee employee)
    {
    	return employeeService.upDateEmployee(id, employee);
    }
    
    @DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
    	return employeeService.deleteEmployeeDetails(id);
	}
	
	
}
