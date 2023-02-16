package application;

import java.util.Scanner;

import entities.Agenda;
import entities.Contato;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda(50);
				
		System.out.println("Bem vindo à sua agenda.");
		System.out.println("--------------------------");
		System.out.println("Selecione a opção desejada");
		System.out.println("--------------------------");
		while (true) {
			System.out.println("Selecione a opção desejada");
			System.out.println("--------------------------");
			System.out.println("1 - Adicionar contato.");
			System.out.println("2 - Buscar contato.");
			System.out.println("3 - Excluir contato.");
			System.out.println("4 - Sair da agenda.");
			int opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 1) {
				System.out.println("Adicionar contato:");
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("E-mail: ");
				String email = sc.next();
				Contato contato = new Contato(nome, email);
				agenda.adicionarContato(contato);
				System.out.println("Contato adicionado com sucesso.");
				System.out.println();
			}
			
			else if (opcao == 2) {
				System.out.println("Digite o nome do contato que deseja buscar: ");
				String nome = sc.nextLine();
				Contato contato = agenda.buscarContato(nome);
				if (contato != null) {
					System.out.println("Contato encontrado: " + contato);
					System.out.println();
				}
				else {
					System.out.println("Contato não encontrado.");
					System.out.println();
				}
				
			}
			
			else if (opcao == 3) {
				System.out.println("Digite o nome do contato que deseja excluir: ");
				String nome = sc.nextLine();
				agenda.excluirContato(nome);
				System.out.println("Contato excluido com sucesso.");
				System.out.println();
			}
			
			else if (opcao == 4) {
				System.out.println("Até mais.");
				break;
			}
			
			else {
				System.out.println("Opção inválida.");
			}
			
		}

	}

}
