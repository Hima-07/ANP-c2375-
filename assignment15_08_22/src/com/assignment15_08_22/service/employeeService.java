package com.assignment15_08_22.service;

import com.assignment15_08_22.model.employee;

public class employeeService {
	
	public void incrementSalary(employee e) {
		int salaryIncrement = e.getEmployeeSalary();
		int newSalary = e.getEmployeeSalary() + 5000;
		e.setEmployeeSalary(newSalary);
	
	}
	
	public boolean isEligibleForIncrement(employee e) {
		boolean result = false ;
		int exp = e.getEmployeeExperience();
		if (exp>2) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	public void display() {
		//System.out.println(result);
	}
}
