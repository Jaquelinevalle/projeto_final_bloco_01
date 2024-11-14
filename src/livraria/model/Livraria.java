package livraria.model;

public class Livraria {
	private String title;
	private String author;
	private double price;
	
	public void Book(String title, String author, double price) { 
		this.title = title; 
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title; 
	}
	public String getAuthor() { 
		return author; 
	} 
	public void setAuthor(String author) {
		this.author = author; 
	} 
	public double getPrice() { 
		return price; 
	}
	public void setPrice(double price) {
		this.price = price; 
	}
	// Método para exibir informações do livro 
	public void displayInfo() { 
	     System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price); 
	}
}

