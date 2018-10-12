package com.example.demo.dao;

import java.util.List;

import com.example.demo.models.Book;

public interface BookDao {
	Book update(Book book);
	Book create(Book book);
	Book delete(int id);
	List<Book> getAll();
	Book get(int id);
}
