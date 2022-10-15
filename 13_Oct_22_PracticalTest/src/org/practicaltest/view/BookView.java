package org.practicaltest.view;
import java.util.ArrayList;
import java.util.Scanner;


import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;
import org.practicaltest.service.BookService;
public class BookView {
static Scanner sc = new Scanner(System.in);
static ArrayList<Book> bookset = new ArrayList<>();
public static boolean addBook() {
	System.out.println("Enter book id");
	String bookidString = sc.next();
	try {
		bookid(bookidString);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Enter book title");
	String titleString = sc.next();
	System.out.println("Enter book's author name");
	String authorString = sc.next();
	System.out.println("Enter book's category");
	String categoryString = sc.next();
	try {
		category(categoryString);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Enter book price");
	 float price = sc.nextFloat();
	 try {
		checkprice(price);
		
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 
	 
	Book book = new Book(bookidString, titleString, authorString, categoryString, price);
	 BookService.addBook(book);
	 return true;
	}
public static void checkprice(float price) throws InvalidPriceException {
	if(price>0) {
		System.out.println(price);
	}
	else {
		throw new InvalidPriceException("Not a valid price");
	}
}
public static void category(String categoryString) throws InvalidCategoryExceptin {
	 if(categoryString=="Science"||categoryString=="Fiction"||categoryString=="Technology"||categoryString=="Others") {
		 System.out.println(categoryString);
	 }
	 else{
		 throw new InvalidCategoryExceptin("Not valid categeory");
	 }
		 
}


public static void bookid(String bookidString) throws InvalidBookidException {
	if(bookidString.length()==4&&bookidString.charAt(0)=='B') {
		System.out.println(bookidString);
	}
	else {
		throw new InvalidBookidException(bookidString);
	}
	 
}


public static ArrayList<Book> displayBook(){
	return BookService.displayBook();
}
}