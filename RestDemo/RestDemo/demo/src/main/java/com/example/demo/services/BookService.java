package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;

@Service
public interface BookService {
	
	Book saveBook(Book book);
	Book createBook(Book book);
	Book deleteBook(Book book);
	List<Book>getAllBooks();
	Book getBook(int id);
}
