package livraria.controller;

import livraria.model.Livraria;

import livraria.reporitory.BookRepository;

public class BookController {
	private static BookRepository bookRepo;
	
	public BookController(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public static void addBook(Livraria book) {
		bookRepo.addBook(book);

	}

	public void removeBook(Livraria book) {
		bookRepo.removeBook(book);
		
	}
	
	public static Livraria findBookByTitle(String title) {
		return bookRepo.findBookByTitle(title);
	}

	public static  void listBooks() {
		bookRepo.listBooks();
	   
		
	}


		
		
	}


