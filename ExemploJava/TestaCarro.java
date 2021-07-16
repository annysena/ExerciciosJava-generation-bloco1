package br.com.generation.carro;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.nome = "Fusca";
		carro1.marca = "Volks";
		carro1.ano = 1998;
		carro1.velocidade = 0;
		
		carro1.acelelar(30);
		System.out.println("Carro: " + carro1.nome);
		System.out.println("Velocidade: " + carro1.velocidade + "Km/h");
		
		carro1.freiar(10);
		System.out.println("Carro: " + carro1.nome);
		System.out.println("Velocidade: " + carro1.velocidade + "Km/h");
	}

}
