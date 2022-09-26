package org.practicaltest.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;

public class StudentMain {

	static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. Enter Student info");
		System.out.println("2. Display All Students");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(StudentView.addStudent())
				System.out.println("Student Added Sucessfully");
			break;
		case 2:
			TreeSet<Student> stu=StudentView.displayStudents();			
			Iterator<Student> it = stu.iterator();
				while(it.hasNext())
					System.out.println(it.next());
		
			break;
			default: 
				System.out.println("Not a valid input");}
		}
		
	
	public static void main(String[] args) {
		
		int choice;
		do {
			
			System.out.println("1.Start Application");
			System.out.println("2. Exit ");
		
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}
}
