package question1.main;

import java.util.Scanner;

import question1.exception.InvalidNamedException;

public class Main  {
	
	public static void main(String[] abc) throws InvalidNamedException  {
		
		Scanner sc = new Scanner(System.in);
	    while(true) {
	    	System.out.println("(eg : Nina)");
	        System.out.println("Enter your firstname");
	        String firstName = sc.nextLine().trim();
	        System.out.println("(eg : Sharma)");
	        System.out.println("Enter your lastname");
	        String LastName = sc.nextLine().trim();

	        String fullName = firstName + " " + LastName;
	        String nameArray[] = fullName.split(" ");
	        System.out.println(nameArray.length);
	        if (nameArray.length != 2) {
	            throw new InvalidNamedException(fullName);
	        }
	        String name = fullName.toUpperCase();
	        System.out.println(name);
	        for (int i = 0; i < name.length(); i++) {
	            // space
	            if (name.charAt(i) == ' ') {
	                continue;
	            }

	            if (name.charAt(i) >=
	                    'A' && name.charAt(i) <= 'Z') {
	                continue;
	            } else {
	                throw new InvalidNamedException(fullName);
	            }
	        }

	        System.out.println(fullName + " is a valid name");
	        System.out.println("do you want to continue (yes/no): " );
	        String decision = sc.nextLine().toUpperCase();
	        
	        // exit from loop
	        if(decision.equals("NO")){
	        	System.out.println("EXIT");
	            break;
	        }

	    }
	}

}
		


    

