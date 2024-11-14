package livraria.reporitory;

import livraria.model.Livraria; 
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements LivrariaRepository {
	private List<Livraria> books;
	
	public BookRepository() { 
		books = new ArrayList<>();
	}
	
	public void addBook(Livraria book) {
		books.add(book); 
		System.out.println("Book added: " + book.getTitle());
	}
	
	public void removeBook(Livraria book) { 
		if (books.remove(book)) {
			System.out.println("Book removed: " + book.getTitle()); } 
		else { 
			System.out.println("Book not found: " + book.getTitle());
		}
		}
	
	public Livraria findBookByTitle(String title) {
		for (Livraria book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book; 
				}
			}
		System.out.println("Book not found: " + title); 
		return null;
	}
	
	public void listBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available."); }
		else { 
			for (Livraria book : books) {
				book.displayInfo();
		}
		}
	}
}
