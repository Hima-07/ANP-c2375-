package com.anudip.jpa.DaoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.anudip.jpa.Dao.BookDAO;
import com.anudip.jpa.entity.Book;

public class BookDAOImpl implements BookDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int saveBook(Book b) {
		String query = "insert into books values(' "+b.getBookId()+" ',' "+b.getBookName()+" ' , ' "+b.getBookAuthor()+" ' ,' "+b.getBookPrice()+" ')";
		return jdbcTemplate.update(query);
	}

	@Override
	public int updateBook(Book b) {
		String query = "update books set book_name = ' "+b.getBookName()+" ,'+book_Author = ' "+b.getBookAuthor()+", '+book_price =' "+b.getBookPrice()+" ' where book_id = ' "+b.getBookId()+" ' ";
		return jdbcTemplate.update(query);
	}

	@Override
	public int deleteBook(Book b) {
		String query = "delete from books  where book_id='"+b.getBookId()+"'";
		return jdbcTemplate.update(query);
	}


}
