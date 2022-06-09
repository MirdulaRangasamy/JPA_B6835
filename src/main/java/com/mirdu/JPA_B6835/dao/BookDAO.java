package com.mirdu.JPA_B6835.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mirdu.JPA_B6835.entity.Book;

public class BookDAO {
	public EntityManager getEM() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("book_pu");
    	EntityManager em = emf.createEntityManager();
    	return em;
	}
	
	public boolean addBookRecord(Book b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		return true;
	}
	
	public Book getBookRecord(int bid)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		Book b = em.find(Book.class, bid);
		em.getTransaction().commit();
		return b;
	}
	
	public boolean updateBookRecord(Book b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		Book b1 = em.find(Book.class,b.getBookID());
		b1.setBookName(b.getBookName());
		b1.setBookAuthor(b.getBookAuthor());
		b1.setBookType(b.getBookType());
		b1.setCost(b.getCost());
		em.getTransaction().commit();
		return true;
	}
	
	public boolean deleteBookRecord(int bid)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		Book b = em.find(Book.class, bid);
		em.remove(b);
		em.getTransaction().commit();
		return true;
	}
	
}
