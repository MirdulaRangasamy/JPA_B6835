package com.mirdu.JPA_B6835;

import java.util.Scanner;

import com.mirdu.JPA_B6835.service.BookService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	BookService bs = new BookService();
		int bid;
		char ch = 'Y';
		while(ch == 'Y')
		{
		System.out.println("*********BOOK MANAGEMENT SYSTEM***********");
		System.out.println("1)Add Book\n2)View Book\n3)View Books\n4)Update Book\n5)Delete Book");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int option = ip.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("Enter the number of Books:");
				int count = ip.nextInt();
				bs.addBook(count);
				break;
			case 2:
				System.out.println("Enter the book id :");
				bid = ip.nextInt();
				System.out.println(bs.viewBook(bid));
				break;
			/*case 3:
				for(Student s:ss.viewStudents())
				{
					System.out.println(s);
				}
				break;*/
			case 4:
				System.out.println("Enter the book id :");
				bid = ip.nextInt();
				bs.updateBook(bid);
				break;
			case 5:
				System.out.println("Enter the book id :");
				bid = ip.nextInt();
				bs.deleteBook(bid);
				break;
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		System.out.println("Enter Y to continue...");
		ch = ip.next().charAt(0);
		}
		System.out.println("Thank you for using...");
    }
}
