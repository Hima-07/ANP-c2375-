package org.practicaltest.question1;

import java.util.Objects;

public class EmployeeData {
	public String employeeId;
	public String employeeName;
	public String employeeJoiningDate;

public EmployeeData(String employeeId,String employeeName,String employeeJoiningDate){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeJoiningDate=employeeJoiningDate;

}

public String getEmployeeId() {
	return employeeId;
}


public void setEmployeeid(String employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}


public String getEmployeeDate() {
	return employeeJoiningDate;
}

public void setEmployeeDate(String employeeJoiningDate) {
	this.employeeJoiningDate = employeeJoiningDate;
}

@Override
public String toString() {
	return "EmployeeData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeJoiningDate="
			+ employeeJoiningDate + "]";
}

@Override
public int hashCode() {
	return Objects.hash(employeeJoiningDate, employeeName, employeeId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeData other = (EmployeeData) obj;
	return Objects.equals(employeeJoiningDate, other.employeeJoiningDate) && Objects.equals(employeeName, other.employeeName)
			&& Objects.equals(employeeId, other.employeeId);
}	}
