package com.anudip.jpa.Dao;

import com.anudip.jpa.entity.Book;

public interface BookDAO {
	
	public int saveBook(Book b);
	
	public int updateBook(Book b);
	
	public int deleteBook(Book b);

}
