package org.practicaltest.question1;

public class EmployeeDataService {
	public static boolean addEmployeeData(EmployeeData emp) {
		boolean result=false;
		EmployeeDataDAO.addEmployeeData(emp);
		return result;
	}
	public static EmployeeData[] displayEmployeeDatas() {
		return EmployeeDataDAO.displayEmployeeDatas();
	}

}
