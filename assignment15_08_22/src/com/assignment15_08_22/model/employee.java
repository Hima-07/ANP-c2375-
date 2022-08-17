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
	
	public void setEmployeeId(int eId) {
		employeeId = eId;
	}
	public char getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInt(char eInt) {
		employeeInitial = eInt;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int esalary) {
		employeeSalary = esalary; 
	}
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExerience(int eExp) {
		employeeExperience = eExp;
	}

}
