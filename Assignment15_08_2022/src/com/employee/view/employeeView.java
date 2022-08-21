package com.employee.view;


import com.assignment15_08_22.model.employee;
import com.assignment15_08_22.service.employeeService;

public class employeeView {
	
public static void main(String[] abc) {
		
		employee employee1 = new employee(1,'C',20000,3);
		employeeService empService1 = new employeeService();
		boolean value = empService1.isEligibleForIncrement(employee1);
		if(value) {
			empService1.incrementSalary(employee1);
			
		}
		System.out.println("The Salary After Checking the Experience :");
		System.out.println(employee1.getEmployeeSalary());
		
	}


}
