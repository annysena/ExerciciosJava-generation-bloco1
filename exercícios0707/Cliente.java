package br.com.generation.orientacaoaobjetos;
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
Autor: Anny
Data: 07/07
*/
public class Cliente {
	
	//Atributos --> (nome, cpf, formaPagamento)
	String nome;
	int cpf;
	String formaPagamento;
	
	//M�todos --> (comprarRoupa, comprarSapato, comprarMoveis)
	void comprarRoupa() {
		System.out.println("A cliente est� comprando uma roupa.");
	}
	void comprarSapato() {
		System.out.println("A cliente est� comprando um sapato.");
}
	void comprarMoveis() {
		System.out.println("A cliente est� comprando m�veis.");
}
}