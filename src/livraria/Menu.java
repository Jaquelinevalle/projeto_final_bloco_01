package livraria;

import java.util.Scanner;

import livraria.controller.BookController;
import livraria.model.Ebook;
import livraria.model.Livraria;
import livraria.reporitory.BookRepository;
import livraria.util.Cores;

public class Menu {
	private static BookRepository bookRepo = new BookRepository();
	private static BookController bookcontrol = new BookController(bookRepo);
	
	
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("\nBem-vindo à Livraria J.V !");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Listar Livros");
			System.out.println("3. Fazer Pedido");
			System.out.println("4. Listar Pedidos");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");

			opcao = leia.nextInt();
			leia.nextLine();

			if (opcao == 5) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nLivraria J.V - Aqui você encontra vários mundos");

				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				addBook(leia);
				break;
			case 2:
				listBook();
				break;
			case 3:
				makeOrder(leia);
				break;
			case 4:
				listOrders();

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Saindo...");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida. Tente novamente.");

			}
		} while (opcao != 5);

		leia.close();

	}
	
	private static void addBook(Scanner scanner) {
		System.out.print("Título: ");
		scanner.skip("\\R?");
		String title = scanner.nextLine(); 
		System.out.print("Autor: ");
		String author = scanner.nextLine(); 
		System.out.print("Preço: "); 
		double price = scanner.nextDouble(); 
		scanner.nextLine();
		
		System.out.print("File Size: ");
		double fileSize = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Formato: "); 
		String format = scanner.nextLine();
		
		Livraria book = new Ebook(title, author, price, fileSize, format);
		BookController.addBook(book);
		System.out.println("Livro adicionado com sucesso!");
	}
	
	private static void listBook() {
		BookController.listBooks();
	}
	private static void makeOrder(Scanner scanner) {
	System.out.print("Título do livro para pedido: ");
	String title = scanner.nextLine();
	Livraria book = BookController.findBookByTitle(title);
	if (book != null) {
		System.out.println("Pedido realizado para o livro: " + book.getTitle()); 
		} else {
			System.out.println("Livro não encontrado.");
		}
	
	}
private static void listOrders() {
	BookController.listBooks();
}
	
	
	public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Jaqueline do Valle Costa");
			System.out.println("Jaqueline do Valle Costa  - jaquelinecosta-rj@hotmail.com");
			System.out.println("github.com/Jaquelinevalle/projeto_final_bloco_01");
			System.out.println("*********************************************************");
		}

	}

