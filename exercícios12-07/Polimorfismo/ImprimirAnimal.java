package br.com.generation.exerciciopolimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		TestaAnimal teste = new TestaAnimal();
		
		teste.fazerAnimalComer(new Cachorro());
		teste.fazerAnimalComer(new Cavalo());
		teste.fazerAnimalComer(new Preguica());
	}

}
