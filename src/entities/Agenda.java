package entities;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda(int tamanhoAgenda) {
		contatos = new Contato[tamanhoAgenda];
	}
	
	public void adicionarContato(Contato contato) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato;		
				return;
			}
			else {
				System.out.println("Sua agenda está cheia, não há espaço para adicionar mais contatos.");
			}
		}
	}
	
	public Contato buscarContato(String nome) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
				return contatos[i];
			}
		}
		return null;
	}

	public void excluirContato(String nome) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
				contatos[i] = null;
				return;
			}
		}
	}
}
