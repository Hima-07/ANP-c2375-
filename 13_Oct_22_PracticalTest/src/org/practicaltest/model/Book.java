package org.practicaltest.model;

import java.util.Objects;

public class Book {
private String bookID;
private static String title;
private String author;
private String category;
private float price;
public Book() {
	super();
}
public Book(String bookID, String title, String author, String category, float price) {
	super();
	this.bookID = bookID;
	this.title = title;
	this.author = author;
	this.category = category;
	this.price = price;
}
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
	this.bookID = bookID;
}
public static String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category + ", price="
			+ price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(author, bookID, category, price, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(author, other.author) && Objects.equals(bookID, other.bookID)
			&& Objects.equals(category, other.category)
			&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && Objects.equals(title, other.title);
}



}