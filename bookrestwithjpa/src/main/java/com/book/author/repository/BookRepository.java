package com.book.author.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.author.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int bookId);
	
}
