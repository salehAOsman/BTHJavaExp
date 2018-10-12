package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Book;

@Transactional
@Repository
public class BookDaoImpl implements BookDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Book update(Book book) {
		return em.merge(book);
	}

	@Override
	public Book create(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Book delete(int id) {
		Book book=this.get(id);
		em.remove(book);
		return null;
	}

	@Override
	public List<Book> getAll() {
		Query query = em.createQuery("SELECT b FROM Book b");
		List<Book> books = query.getResultList();
		return books;

	}

	@Override
	public Book get(int id) {
		return em.find(Book.class, id);

	}

}
