package com.book.author.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.author.model.Book;
import com.book.author.repository.BookRepository;

@Component
public class BookService {
   
	@Autowired
	private BookRepository bookRepository;
	
	//get all Book data
	public List<Book> getAllBooks(){
		List<Book>list=(List<Book>)this.bookRepository.findAll();
		return list;
		
	}
//	//get single Book data
	public Book getBookById(int id) {
		Book book=null;
		try {
			book= this.bookRepository.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
		
	}
//	//create Book data
	public Book addBook(Book b) {
		Book result=this.bookRepository.save(b);
		return result;
		
	}
//	//delete book 
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
//		list=list.stream().filter(book->{
//		if(book.getId()!=id) {
//			return true;
//		}else {
//			return false;
//		}
//	}).collect(Collectors.toList());
}
	
	//update book
  public void updateBook(Book book,int id) {
  	book.setId(id);
  	bookRepository.save(book);
  }
  }