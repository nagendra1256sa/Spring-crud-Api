package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enitity.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {
	 @Autowired
	 private  EmployeeRepository employeeRepository;
	 
	
//	 public EmployeeService(EmployeeRepository employeeRepository)
//	 {
//		 this.employeeRepository=employeeRepository;
//	 }
	 
	 public List<Employee> getAllEmployees()
	 {
		 return employeeRepository.findAll();
	 }
	 
	 public Employee addEmployee(Employee employee)
	 {
		 return employeeRepository.save(employee);
  }
	 public Employee upDateEmployee(int id,Employee employee)
	 {
		 Employee exititngEmployee=employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id"+id));
		 exititngEmployee.setFirstName(employee.getFirstName());
		 exititngEmployee.setLastName(employee.getLastName());
		 exititngEmployee.setDOB(employee.getDOB());
		 exititngEmployee.setGender(employee.getGender());
		 exititngEmployee.setEmail(employee.getEmail());
		 exititngEmployee.setMartialStatus(employee.getMartialStatus());
		 exititngEmployee.setDepartment(employee.getDepartment());
		 exititngEmployee.setExperience(employee.getExperience());
		 exititngEmployee.setState(employee.getState());
		 exititngEmployee.setPincode(employee.getPincode());
		 exititngEmployee.setAddress(employee.getAddress());
		 exititngEmployee.setPhoneNumber(employee.getPhoneNumber());
		 return employeeRepository.save(exititngEmployee);
	 }
	 public String deleteEmployeeDetails(int id)
	 {
		 Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"+id));
		 employeeRepository.delete(existingEmployee);
		 return "Employee "+id+ " has been deleted";
	 }
}
