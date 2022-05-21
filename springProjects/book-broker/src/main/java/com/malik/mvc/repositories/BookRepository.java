package com.malik.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malik.mvc.models.Book;

public interface BookRepository  extends CrudRepository<Book, Long> {
    
	 List<Book> findAll();
    
}
