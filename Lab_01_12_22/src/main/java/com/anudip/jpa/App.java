package com.anudip.jpa;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anudip.jpa.DaoImpl.BookDAOImpl;
import com.anudip.jpa.entity.Book;

public class App 
{
    public static void main( String[] args ){

    	Scanner sc = new Scanner(System.in);
    	
    	
        @SuppressWarnings("resource")
		ApplicationContext bk = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDAOImpl bdaoi = (BookDAOImpl) bk.getBean("bdao");
        
        System.out.println("----Welcome to JDBC Labrary----");
        
        do {
        	System.out.println("\n 1.Add Book \n 2.Update Book\n 3.Delete Book \n 4.Exit");
        	System.out.println("Enter Your Choice : ");
        	int choice =sc.nextInt();
          switch(choice) {
          case 1:
          	int status = bdaoi.saveBook(new Book(101,"Java ","James Ghosling ",450));
          	System.out.println(status);
          	break;
          case 2 :
          	  int status1 = bdaoi.updateBook(new Book(101,"marvels ","StanLee",999));
          	  System.out.println(status1);
          	  break;
          case 3 :
              Book b = new Book();
              b.setBookId(101);
              int status2 = bdaoi.deleteBook(b);
              System.out.println(status2);
              break;
          case 4 :
        	  System.exit(0);
              default :
              	System.out.println("Invalid Choice");
          }       	
        }while(true);
        	
    }
}
