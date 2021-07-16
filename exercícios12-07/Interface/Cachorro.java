package br.com.generation.exerciciointerface;

public class Cachorro implements Animal {

	@Override
	public void comer() {
		System.out.println("O cachorro come ração.");
		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro dorme deitado.");
		
	}

}
