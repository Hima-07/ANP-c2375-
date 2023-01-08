package com.anudip.projt1.service;

import java.util.List;

import com.anudip.projt1.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee empl);
	
	Employee getEmployeebyID(Long id);
	
	Employee updateEmployee(Employee empl);

	void deleteEmployeeById(Long id);
}
