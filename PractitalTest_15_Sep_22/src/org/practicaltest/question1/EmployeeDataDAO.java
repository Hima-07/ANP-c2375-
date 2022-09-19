package org.practicaltest.question1;

public class EmployeeDataDAO {
	static EmployeeData empArray[]=new EmployeeData[5];
	public static boolean addEmployeeData(EmployeeData emp) {
		boolean result=false;
		
		for(int i=0;i<empArray.length;i++)
		{
			if(empArray[i]==null) {
				empArray[i]=emp;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static EmployeeData[] displayEmployeeDatas() {
		return empArray;
	}

}
