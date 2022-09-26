package org.practicaltest.view;

import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addStudent() {
		for(int i=0;i<3;i++) {
		System.out.println("Enter a Student Roll Number");
		int studentId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a Student Name");
		String studentName=scanner.nextLine();
		System.out.println("Enter Student Age");
		int studentAge=scanner.nextInt();
		scanner.nextLine();
		
		Student stud=new Student(studentId,studentName,studentAge);
		StudentService.addStudent(stud);
		
		}
	    return true;
	
}
		public static TreeSet<Student> displayStudents() {
			return StudentService.displayStudents();
		}
}
