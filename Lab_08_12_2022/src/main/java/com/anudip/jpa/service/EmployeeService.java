package com.anudip.jpa.service;

import java.util.List;

import com.anudip.jpa.entity.Employee;

public interface EmployeeService {
	
	//Method for save Employee into table
	Employee saveEmployee(Employee emp);
	
	//Method for fetching Employee by eId
	Employee getByIdEmployee(long eId);
	
	//Method for fetching all Employee
	List<Employee> getallEmployees();
	
	//Method for Updating Employee by eId
	Employee updateByIdEmployee(Employee emp, long eId);
	
	//Method for deleting Employee by eId
	void deleteByIdEmployee( long eId);

}
