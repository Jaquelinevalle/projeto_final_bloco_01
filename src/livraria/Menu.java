package livraria;

import java.util.Scanner;

public class Menu {

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

			if (opcao == 5) {
				System.out.println("\nLivraria J.V - Aqui você encontra vários mundos");

				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro");

				break;
			case 2:
				System.out.println("O livro foi adicionado");
				break;
			case 3:
				System.out.println("Conclua seu pedido");
				break;
			case 4:
				System.out.println("A lista está aqui");

				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}
		} while (opcao != 5);

		leia.close();

	}
}
