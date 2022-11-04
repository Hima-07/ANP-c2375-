package com.anudip.lab.daoimpl;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.lab.config.HibernateUtil;
import com.anudip.lab.dao.LibraryDAO;
import com.anudip.lab.entity.Library;

public class LibraryDAOimpl implements LibraryDAO {
	
	Scanner sc =new Scanner(System.in);
	
	public void addBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			int bid;
			String bname,aname;
			double bprice;
			System.out.println("Enter the Book Id");
			bid =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Book Name");
			bname =sc.nextLine();
			
			System.out.println("Enter Author Name");
			aname = sc.nextLine();
			
			System.out.println("Enter Price of Book");
			bprice = sc.nextLong();
			
			Library lb = new Library();
			
			lb.setBookId(bid);
			lb.setBookName(bname);
			lb.setBookAuthor(aname);
			lb.setBookPrice(bprice);
			
			session.save(lb);
			t.commit();
			
			System.out.println("Book Added Successfully");
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void getBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter the Book Id, you like to Read");
			int i = sc.nextInt();
			sc.nextLine();
			Library lb = session.get(Library.class, i);
			System.out.println("BookId= "+lb.getBookId()+" BookName = "+lb.getBookName()+" AuthorName = "
			+lb.getBookAuthor()+"BookPrice = "+lb.getBookPrice());
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter the book id, you want to Update");
			int i = sc.nextInt();
			sc.nextLine();
			Library lb = session.get(Library.class, i);
			System.out.println("Enter new price of Book for BookId"+i);
			double nprc =  sc.nextDouble();
			sc.nextLine();
			lb.setBookPrice(nprc);
			session.update(lb);
			t.commit();
			System.out.println("Updated Successfully");
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void deleteBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter the Book Id, you want to Delete");
			int i = sc.nextInt();
			Library lb = session.get(Library.class, i);
			session.delete(lb);
			t.commit();
			System.out.println("Deleted Successfully");
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

}
