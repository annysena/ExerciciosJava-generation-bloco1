package br.com.generation.exerciciointerface;

public class Cavalo implements Animal {

	@Override
	public void comer() {
		System.out.println("O cavalo come capim.");
	}

	@Override
	public void dormir() {
		System.out.println("O cavalo dorme em pé.");
		
	}

}
