package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/myapp/api")
public class BookRestController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBooks() {		
		
		return ResponseEntity.status(200).body(bookService.getAllBooks());
		
	}
	
	
	@PostMapping("/book")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		
		return ResponseEntity.status(201).contentType(MediaType.APPLICATION_JSON).body(bookService.createBook(book));
				
	}
	
	@PutMapping("/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
		
		return ResponseEntity.status(200).body(bookService.saveBook(book));
	
		
	}
	
	@DeleteMapping("/book")
	public ResponseEntity<Book> deleteBook(@RequestBody Book book) {
		
		bookService.deleteBook(book);
		return ResponseEntity.status(200).build();		
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable(value="id") int id){
		
		return ResponseEntity.status(200).body(bookService.getBook(id));
	}
}
