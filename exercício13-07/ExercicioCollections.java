package br.com.generation.exerciciocollections;

import java.util.ArrayList;

public class ExercicioCollections {

	public static void main(String[] args) {

		//Declaração de variáveis
		String produto = "Bolo";
		String fabricacaoProduto = "Fabricação: 10/07/2021";
		String validadeProduto = "Validade: 13/07/2021";
		
		//Criando ArrayList (String)
		ArrayList<String> informacoesProduto = new ArrayList<>();
		
		//Adicionando variáveis ao ArrayList
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
		
		//for each --> Tipo de for evoluído, que percorre o ArrayList posição por posição.
		for(String i: informacoesProduto) {
			System.out.println("Informações do produto -> " + i);
	}
		
		//Declarando e atribuindo à posição das variáveis
		String produtoNoEstoque = informacoesProduto.get(0);
		System.out.println("_______________________________________________________");
		System.out.println("O produto disponível no estoque é: " + produtoNoEstoque);
		
		//for tradicional --> para percorrer o ArrayList
		System.out.println("_______________________________________________________");
		for(int i = 0; i < informacoesProduto.size(); i++) {
			System.out.println("As informações disponíveis do produto são -> " + informacoesProduto.get(i));
		}
		//Mostrando o tamanho do ArrayList
		System.out.println("_______________________________________________________");
		System.out.println("O tamanho do ArrayList é de " + informacoesProduto.size() + " posições");
}
}