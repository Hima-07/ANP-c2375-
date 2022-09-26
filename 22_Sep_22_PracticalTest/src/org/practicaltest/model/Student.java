package org.practicaltest.model;

import java.util.Objects;

public  class Student implements Comparable<Student>{
	public int studentId;
	public String studentName;
	public int studentAge;
	

public Student(int studentId,String studentName,int studentAge){
		super();
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAge=studentAge;

}

/**
 * @return the studentId
 */
public int getStudentId() {
	return studentId;
}

/**
 * @param studentId the studentId to set
 */
public void setStudentId(int studentId) {
	this.studentId = studentId;
}

/**
 * @return the studentName
 */
public String getStudentName() {
	return studentName;
}
/**
 * @param studentName the studentName to set
 */
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
/**
 * @return the studentAge
 */
public int getStudentAge() {
	return studentAge;
}
/**
 * @param studentAge the studentAge to set
 */
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ "]";
}

@Override
public int hashCode() {
	return Objects.hash(studentAge, studentId, studentName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return studentAge == other.studentAge && studentId == other.studentId
			&& Objects.equals(studentName, other.studentName);
}
public int compareTo(Student object) {
	Student stud=(Student) object;
		return stud.getStudentName().compareTo(this.getStudentName());
}
}
