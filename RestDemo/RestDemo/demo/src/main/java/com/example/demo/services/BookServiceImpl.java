package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.models.Book;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	@Override
	public Book saveBook(Book book) {
	
		return dao.update(book);
	}

	@Override
	public Book createBook(Book book) {
		
		return dao.create(book);
	}

	@Override
	public Book deleteBook(Book book) {
		
		return dao.delete(book.getBookId());
	}

	@Override
	public List<Book> getAllBooks() {		
		
		List<Book> books=dao.getAll();		
		return books;
	}

	@Override
	public Book getBook(int id) {
		
		return dao.get(id);
	}

}
