package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository obj1;
	
	public void setBook(BookRepository obj1) {
		this.obj1 = obj1;
	}
	
	public void addBook(String title) {
		System.out.println("Book Added");
		obj1.saveBook(title);
	}
}
