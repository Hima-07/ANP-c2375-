package com.anudip.main;

import java.util.Scanner;

import com.anudip.que1.SwappingVariable;
import com.anudip.que2.InsertingElements;

public class Main {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		SwappingVariable sn = new SwappingVariable();

		InsertingElements in = new InsertingElements();
		
		System.out.println("Select any One \n1.Swapping Numbers from the List \n2.Inserting Element at First Position");
		int choice = sc.nextInt();
				
		do {
			switch(choice){
			case 1:
					sn.Que1();
					System.exit(0);
				break;
			case 2 :
				in.Que2();
				System.exit(0);
				break;
			}

		}while(true);
		
			
	}

}
