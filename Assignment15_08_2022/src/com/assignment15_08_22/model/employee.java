package com.assignment15_08_22.model;

public class employee {
	
	private int employeeId;
	private char employeeInitial;
	private int employeeSalary;
	private int employeeExperience;
	
	public employee() {
		
	}
	
	public employee (int empId,char empInt,int empSaly,int empExp) {
		
		employeeId = empId;
		employeeInitial = empInt;
		employeeSalary = empSaly;
		employeeExperience = empExp;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public char getEmployeeInitial() {
		return employeeInitial;
	}

	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeExperience() {
		return employeeExperience;
	}

	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
}
