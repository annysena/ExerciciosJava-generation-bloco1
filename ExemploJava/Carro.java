package br.com.generation.carro;

public class Carro {

	//Atributos - vari�veis 
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//M�todos
	void acelelar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}