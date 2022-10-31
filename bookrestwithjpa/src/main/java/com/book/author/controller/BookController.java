package com.book.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.author.model.Book;
import com.book.author.repository.BookRepository;
import com.book.author.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
//	//get all books
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> list=this.bookService.getAllBooks();
		if(list.size()<0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(list);
		
	}
//	//get single book
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook( @PathVariable("id") int id){
		
		Book book=bookService.getBookById(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
//	//create books
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		
		Book b=null;
		try {
			b=this.bookService.addBook(book);
			System.out.println(book);
			return ResponseEntity.status(HttpStatus.CREATED).body(b);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
//	//delete book
	@DeleteMapping("books/{id}")
	public ResponseEntity<Void> deletBook(@PathVariable("id") int id){
		try {
			this.bookService.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
//	//update book
	@PutMapping("books/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable int  id) {
		this.bookService.updateBook(book, id);
		return book;
	}
	

}
