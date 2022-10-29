package pack;

import java.util.Scanner;

public class Main{
	
	static Scanner sc = new Scanner(System.in);
	static EmpOpt sqlCon = new EmpOpt();
	
	public static void mainMenu() {
	while(true) {
		System.out.println("  ");
		System.out.println("This is the table");
		System.out.println("1.create table");
		System.out.println("2.Insert Row in table");
		System.out.println("3.Exit");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice){
		case 1 :
			sqlCon.createTable();
			break;
			
		case 2 :
			sqlCon.insertInto();
			break;
			
		case 3 :
			System.exit(0);
			break;
		}
	}
	}
	public static void main(String[] args) {
		mainMenu();
	}
	
}