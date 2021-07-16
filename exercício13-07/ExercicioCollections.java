package br.com.generation.exerciciocollections;

import java.util.ArrayList;

public class ExercicioCollections {

	public static void main(String[] args) {

		//Declara��o de vari�veis
		String produto = "Bolo";
		String fabricacaoProduto = "Fabrica��o: 10/07/2021";
		String validadeProduto = "Validade: 13/07/2021";
		
		//Criando ArrayList (String)
		ArrayList<String> informacoesProduto = new ArrayList<>();
		
		//Adicionando vari�veis ao ArrayList
		informacoesProduto.add(produto);
		informacoesProduto.add(fabricacaoProduto);
		informacoesProduto.add(validadeProduto);
		
		System.out.println("---------------ESTOQUE LOJA DE BOLOS-------------------");
		System.out.println();
		
		//Mostrando os itens do ArrayList
		System.out.println(informacoesProduto);
		
		System.out.println("_______________________________________________________");
		
		//Removendo itens do ArrayList
		//informacoesProduto.remove(1);
		
		System.out.println(informacoesProduto);
		
		//for each --> Tipo de for evolu�do, que percorre o ArrayList posi��o por posi��o.
		for(String i: informacoesProduto) {
			System.out.println("Informa��es do produto -> " + i);
	}
		
		//Declarando e atribuindo � posi��o das vari�veis
		String produtoNoEstoque = informacoesProduto.get(0);
		System.out.println("_______________________________________________________");
		System.out.println("O produto dispon�vel no estoque �: " + produtoNoEstoque);
		
		//for tradicional --> para percorrer o ArrayList
		System.out.println("_______________________________________________________");
		for(int i = 0; i < informacoesProduto.size(); i++) {
			System.out.println("As informa��es dispon�veis do produto s�o -> " + informacoesProduto.get(i));
		}
		//Mostrando o tamanho do ArrayList
		System.out.println("_______________________________________________________");
		System.out.println("O tamanho do ArrayList � de " + informacoesProduto.size() + " posi��es");
}
}