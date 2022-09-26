package org.practicaltest.service;


import java.util.TreeSet;

import org.practicaltest.DAO.StudentDAO;
import org.practicaltest.model.Student;

public class StudentService {
	public static boolean addStudent(Student stud) {
		boolean result=false;
		StudentDAO.addStudent(stud);
		return result;
	}
	public static TreeSet<Student> displayStudents() {
		return StudentDAO.displayStudents();
	}
}
