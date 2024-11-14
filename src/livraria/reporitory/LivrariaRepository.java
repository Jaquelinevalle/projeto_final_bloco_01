package livraria.reporitory;

import livraria.model.Livraria;

import java.util.ArrayList;
import java.util.List;

public interface LivrariaRepository {
	void addBook(Livraria book);
	void removeBook(Livraria book);
	Livraria findBookByTitle(String title);
	void listBooks();
}



