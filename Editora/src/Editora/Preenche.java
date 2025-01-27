package Editora;

import javax.swing.JOptionPane;

public class Preenche {
	
	// Classe que inicializa o sistema para gera��o de testes
	
	// Metodo que inicializa a lista de Publica��es
	public static void publicacao(Lista listaPublic) {
				
		Publicacao publicacao = new Publicacao ();
		
		publicacao.setNome("Exodo");
		publicacao.setPeriodic("Semanal");
		publicacao.setEdicaoAtual(3);
		publicacao.setUltimaPub(8, 10, 2015);
		
		listaPublic.insereItem(publicacao);
		
		publicacao = new Publicacao ();
		
		publicacao.setNome("A Marinha");
		publicacao.setPeriodic("Mensal");
		publicacao.setEdicaoAtual(21);
		publicacao.setUltimaPub(15, 9, 2015);
		
		listaPublic.insereItem(publicacao);
		
	}
	
	// Metodo que inicializa a lista de Clientes
	public static void cliente(Lista listaCliente) {
		
		Cliente cliente = new Cliente ();
		
		cliente.setNome("Jo�o Paulo Fagundes");
		cliente.setCPF("015.658.412-66");
		cliente.setEndereco("Rua Maranh�o, 42");
		cliente.setTelefone("(31)3589-6214");
		
		listaCliente.insereItem(cliente);
		
		cliente = new Cliente ();
		
		cliente.setNome("Guilherme Avelar");
		cliente.setCPF("356.945.254-85");
		cliente.setEndereco("Rua S�o Gonsalo, 266");
		cliente.setTelefone("(31)5239-2154");
		
		listaCliente.insereItem(cliente);
	}

	// Metodo que inicializa a lista de Assinaturas
	public static void assinat(Lista listaAssinat, Lista listaCliente, Lista listaPublic) {
		
		Cliente cliente;
		Publicacao publicacao;
		Assinatura assinat;
		
		cliente = (Cliente) listaCliente.Busca("Jo�o Paulo Fagundes");
		publicacao = (Publicacao) listaPublic.Busca("Exodo");
		assinat = new Assinatura (cliente, publicacao);
		assinat.setEdicaoInicial(4);
		assinat.setNumeroAssinat(12);
		
		listaAssinat.insereItem(assinat);
		
		cliente = (Cliente) listaCliente.Busca("Jo�o Paulo Fagundes");
		publicacao = (Publicacao) listaPublic.Busca("A Marinha");
		assinat = new Assinatura (cliente, publicacao);
		assinat.setEdicaoInicial(22);
		assinat.setNumeroAssinat(6);
		
		listaAssinat.insereItem(assinat);
		
		cliente = (Cliente) listaCliente.Busca("Guilherme Avelar");
		publicacao = (Publicacao) listaPublic.Busca("Exodo");
		assinat = new Assinatura (cliente, publicacao);
		assinat.setEdicaoInicial(4);
		assinat.setNumeroAssinat(6);
		
		listaAssinat.insereItem(assinat);
	}
}
