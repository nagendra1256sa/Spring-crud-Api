package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
