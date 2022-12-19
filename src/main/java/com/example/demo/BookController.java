package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.Book;



@RestController
public class BookController {
	@Autowired
	private final BookRepository repository;

	BookController(BookRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/books")
	public List<Book> getBook() {
		List<Book> books= repository.findAll();  
		return books;
	}
	

}