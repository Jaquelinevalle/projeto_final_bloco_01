package livraria;

import java.util.Scanner;
import livraria.model.Ebook;
import livraria.model.Livraria;
import livraria.reporitory.*;
import livraria.reporitory.*;

import livraria.util.Cores;

public class Menu {
	private static livraria.reporitory bookRepo = new BookRepositoryImpl()
	
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {

			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "\nBem-vindo à Livraria J.V !");
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
				System.out.println(Cores.TEXT_WHITE + "Digite o nome do livro");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "O livro foi adicionado");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Conclua seu pedido");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "A lista está aqui");

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
		String title = scanner.nextLine(); 
		System.out.print("Autor: ");
		String author = scanner.nextLine(); 
		System.out.print("Preço: "); 
		double price = scanner.nextDouble(); 
		scanner.nextLine();
		
		System.out.print("File Size: ");
		double fileSize = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Format: "); 
		String format = scanner.nextLine();
		
		Livraria book = new Ebook(title, author, price, fileSize, format);
		bookRepo.addBook(book);
		System.out.println("Livro adicionado com sucesso!");
	}
	
	private static void listBook() {
		bookRepo.listBooks();
	}
	
	public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Jaqueline do Valle Costa");
			System.out.println("Jaqueline do Valle Costa  - jaquelinecosta-rj@hotmail.com");
			System.out.println("github.com/Jaquelinevalle/projeto_final_bloco_01");
			System.out.println("*********************************************************");
		}

	}

