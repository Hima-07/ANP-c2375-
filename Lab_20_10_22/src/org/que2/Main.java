package org.que2;

import java.util.Scanner;

public class Main {
	
	static Scanner sObj =new Scanner(System.in);
	
	public static void main(String[] abc) {
		
		int choice;
		do {

			System.out.println("1. Add Movie ");
			System.out.println("2. Show movie details ");
			System.out.println("Enter your choice");
			choice=sObj.nextInt();
			sObj.nextLine();
			switch(choice) {
			case 1:
				if(MovietheatreView.addMovie())
					System.out.println("Movie Added Sucessfully");
				break;
			case 2:
				Movietheatre movie[]=MovietheatreView.displayMovie();
				for(Movietheatre localMovie:movie) {
					if(localMovie!=null)
					System.out.println(localMovie);
					else
						break;
				}
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}

}
