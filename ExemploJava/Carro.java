package br.com.generation.carro;

public class Carro {

	//Atributos - variáveis 
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//Métodos
	void acelelar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}