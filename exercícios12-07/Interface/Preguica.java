package br.com.generation.exerciciointerface;

public class Preguica implements Animal{

	@Override
	public void comer() {
		System.out.println("A pregui�a come folhas.");
		
	}

	@Override
	public void dormir() {
		System.out.println("A pregui�a dorme em �rvores.");
		
	}

}
