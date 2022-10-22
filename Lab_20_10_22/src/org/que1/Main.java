package org.que1;

import java.util.Scanner;

public class Main {
	static double accBal;
	static String accName;
	static int accNumber;
	
	
	 static Scanner sc = new Scanner(System.in);
	 
	 public static void createAccount() {
		 
		 System.out.println("Enter Account Numnber");
			accNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Account Holder Name");
			accName = sc.nextLine();
				
			System.out.println("Enter Accont Balance");
			accBal = sc.nextDouble();
		}
		 
	 public static void setAmount(double setAmount) {
		 System.out.println("Enter the amount tobe added");
		 setAmount = sc.nextDouble();
		 accBal= accBal+setAmount;
		 System.out.println("updated amount balance : "+accBal);
		}
		public static void withDrawAmount(double withDrawAmount) {
			System.out.println("Enter withDrawAmount");
			withDrawAmount = sc.nextDouble();
			if(accBal>withDrawAmount) {
				accBal=accBal-withDrawAmount;
				System.out.println("Updated Balance : "+accBal);
			}
			else {
				System.out.println("Insufficient Fund!!!");
				System.exit(0);
			}
			
		}
		public static void display() {
			System.out.println("1.Add new Account ");
			System.out.println("2.Display Accounts Details ");
			System.out.println("3.Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				createAccount();
				System.out.println("1.Add Money");
				System.out.println("2.withDrawMoney");
				int choice2 = sc.nextInt();
				sc.nextLine();
				switch(choice2) {
				case 1:
					setAmount(accBal);
					break;
				case 2:
					withDrawAmount(accBal);
					break;
				}
				break;
			case 2:
				System.out.println("AccNumber: "+accNumber+" Account Holder Name: "+accName+" account Balance: "+accBal);
				break;
			case 3:
				System.exit(0);
				break;
				default :
				System.out.println("Invalid Input");
				
			}
			
		}
	
	public static void main(String[] arg) {
		while(true) {
			display();
		}
	}
}