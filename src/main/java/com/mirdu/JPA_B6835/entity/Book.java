package com.mirdu.JPA_B6835.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookID;
	private String bookName;
	private String bookType;
	private String bookAuthor;
	private float cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookID, String bookName, String bookType, String bookAuthor, float cost) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookAuthor = bookAuthor;
		this.cost = cost;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookType=" + bookType + ", bookAuthor="
				+ bookAuthor + ", cost=" + cost + "]";
	}
	
	
}
