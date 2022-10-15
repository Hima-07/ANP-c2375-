package org.practicaltest.dao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Book;
import org.practicaltest.view.BookView;


public class BookDAO {
	static Scanner sc = new Scanner(System.in);
static ArrayList<Book> bookset = new ArrayList<>();
public static boolean addBook(Book book) {
	boolean result = false;
	
		bookset.add(book);
		result = true;
		
	return result;
	}

public static void searchByTitle() {
	System.out.println("Enter book title");
	String titleString1 = sc.next();
    for(Book b : bookset){
        if(titleString1.equalsIgnoreCase(Book.getTitle())){
           System.out.println("Book is avaliable");
        }
        else {
    System.out.println("Book is not avalible");
        }
    }
}

public static void searchByAuthor() {
	System.out.println("Enter book author name");
	String authorString1 = sc.next();
    for(Book b : bookset){
        if(authorString1.equalsIgnoreCase(Book.getAuthor())){
           System.out.println("Book is avaliable");
        }
        else {
    System.out.println("Book is not avalible");
        }
    }
}


public static ArrayList<Book> displayBook() {
	return bookset;
}


}