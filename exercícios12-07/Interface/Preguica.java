package br.com.generation.exerciciointerface;

public class Preguica implements Animal{

	@Override
	public void comer() {
		System.out.println("A preguiça come folhas.");
		
	}

	@Override
	public void dormir() {
		System.out.println("A preguiça dorme em árvores.");
		
	}

}
