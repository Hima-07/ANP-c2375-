package org.practicaltest.DAO;

import java.util.TreeSet;

import org.practicaltest.model.Student;

public class StudentDAO {
	
		static TreeSet<Student> studs = new TreeSet<Student>();
		
		public static boolean addStudent(Student stud) {
			boolean result=false;
				studs.add(stud);
				
				
					result=true;
			return result;
		}
		public static TreeSet<Student> displayStudents() {
						return studs;
	}
}
