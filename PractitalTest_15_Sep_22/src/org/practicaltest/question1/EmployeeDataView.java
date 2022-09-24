package org.practicaltest.question1;

import java.util.Scanner;

public class EmployeeDataView {
	static Scanner scanner=new Scanner(System.in);
public static boolean addEmployeeData() {
	
	System.out.println("Enter a employee id");
	String employeeId=scanner.nextLine();
	System.out.println("Enter a employee name");
	String employeeName=scanner.nextLine();
	System.out.println("Enter Employee Joining Date");
	String employeeJoiningDate=scanner.nextLine();
	
	EmployeeData employee=new EmployeeData(employeeId,employeeName,employeeJoiningDate);
	EmployeeDataService.addEmployeeData(employee);
	return true;
}

	public static EmployeeData[] displayEmployeeDatas() {
		return EmployeeDataService.displayEmployeeDatas();
	}

}
