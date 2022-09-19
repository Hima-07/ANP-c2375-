package org.practicaltest.question1;
import java.util.Scanner;
public class EmployeeDataMain {
static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. See EmployeeData Menu Options");
		System.out.println("2. Display All EmployeeDatas");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(EmployeeDataView.addEmployeeData())
				System.out.println("EmployeeData Added Sucessfully");
			break;
		case 2:
			EmployeeData book[]=EmployeeDataView.displayEmployeeDatas();
			for(EmployeeData localEmployeeData:book) {
				if(localEmployeeData!=null)
				System.out.println(localEmployeeData);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			
			System.out.println("1. Add Employee Data");
			System.out.println("2. Exit ");
			System.out.println("Enter your choice");
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
