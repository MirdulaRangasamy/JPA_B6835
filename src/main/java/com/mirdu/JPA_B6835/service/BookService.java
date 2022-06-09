package com.mirdu.JPA_B6835.service;

import java.util.Scanner;

import com.mirdu.JPA_B6835.dao.BookDAO;
import com.mirdu.JPA_B6835.entity.Book;

public class BookService {
	BookDAO bdao = new BookDAO();
	Scanner ip = new Scanner(System.in);
	
	public boolean addBook(int count)
	{
		while(count>0)
		{
			System.out.println("Enter the Book Details:");
			System.out.println("Enter Book ID: ");
			int bid = ip.nextInt();
			ip.nextLine();
			System.out.println("Enter Book Name: ");
			String bname = ip.nextLine();
			System.out.println("Enter the Fiction: ");
			String bfic = ip.nextLine();
			System.out.println("Enter the author name: ");
			String bauthor = ip.nextLine();
			System.out.println("Enter the cost: ");
			float bcost = ip.nextFloat();
			Book b = new Book(bid,bname,bfic,bauthor,bcost);
			bdao.addBookRecord(b);
			count--;
		}
		return true;	
	}
	
	public Book viewBook(int bid)
	{
		return bdao.getBookRecord(bid);
	}
	
	public boolean updateBook(int bid)
	{
		System.out.println("Enter the Book Details:");
		
		System.out.println("Enter Book Name: ");
		String bname = ip.nextLine();
		System.out.println("Enter the Fiction: ");
		String bfic = ip.nextLine();
		System.out.println("Enter the author name: ");
		String bauthor = ip.nextLine();
		System.out.println("Enter the cost: ");
		float bcost = ip.nextFloat();
		Book b = new Book(bid,bname,bfic,bauthor,bcost);
		bdao.updateBookRecord(b);
		return true;
	}
	
	public boolean deleteBook(int bid)
	{
		return bdao.deleteBookRecord(bid);
	}
	
}
