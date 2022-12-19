package com.example.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {
	@Id
	private Long id; 
	private final String title;
    private final String author;

	public Book(long id, String title, String author) {
		this.id = id;
		this.title = title;
        this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}    
}