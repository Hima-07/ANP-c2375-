package com.anudip.lab;

import java.util.Scanner;

import com.anudip.lab.daoimpl.LibraryDAOimpl;

public class App{
	
	
    public static void main( String[] args ){
    	Scanner sc = new Scanner(System.in);
    	LibraryDAOimpl ld = new LibraryDAOimpl();
    	
        System.out.println( " --- Digital Book Library --- " );
        do {
        	System.out.println(" 1.Add new book \n 2.View Book \n 3.Update Book Data \n 4.Delete Book \n 5.Exit");
            int i = sc.nextInt();
            
            switch(i) {
            case 1:
            	ld.addBook();
            	break;
            case 2:
            	ld.getBook();
            	break;
            case 3:
            	ld.updateBook();
            	break;
            case 4:
            	ld.deleteBook();
            	break;
            case 5:
            	System.exit(0);
            	break;
            default:
            		System.out.println("Invalid Entry");
            }
        }while(true);
        
    }
}
