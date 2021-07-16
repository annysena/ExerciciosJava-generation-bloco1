package br.com.generation.exerciciointerface;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		cachorro1.comer();
		cachorro1.dormir();
		System.out.println();
		
		cavalo1.comer();
		cavalo1.dormir();
		System.out.println();
		
		preguica1.comer();
		preguica1.dormir();

	}

}
