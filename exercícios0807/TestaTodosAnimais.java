package br.com.generation.classeheranca;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguiça preguica1 = new Preguiça();
		
		cachorro1.setNome("Nino");
		cachorro1.setIdade(10);
		cachorro1.setEmiteSom("Sim, pode latir e rosnar");
		cachorro1.setCorre("Corre pouco");
		cachorro1.setLate("O cachorro late alto");
		
		cavalo1.setNome("Princesa");
		cavalo1.setIdade(5);
		cavalo1.setEmiteSom("Sim, relincha");
		cavalo1.setCorre("Corre rápido");
		cavalo1.setRelinchar("O cavalo relincha alto");
		
		preguica1.setNome("Bob");
		preguica1.setIdade(2);
		preguica1.setEmiteSom("Sim");
		preguica1.setCorre("Não corre");
		preguica1.setMovimentosLentos("A preguiça tem movimentos lentos");
		
		System.out.println("===Dados do Cachorro==");
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade() + " anos");
		System.out.println("Emite som: " + cachorro1.getEmiteSom());
		System.out.println("Corre: " + cachorro1.getCorre());
		System.out.println(cachorro1.getLate());
		System.out.println();
		
		System.out.println("===Dados do Cavalo==");
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade() + " anos");
		System.out.println("Emite som: " + cavalo1.getEmiteSom());
		System.out.println("Corre: " + cavalo1.getCorre());
		System.out.println(cavalo1.getRelinchar());
		System.out.println();
		
		System.out.println("===Dados do Bicho Preguiça==");
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade() + " anos");
		System.out.println("Emite som: " + preguica1.getEmiteSom());
		System.out.println("Corre: " + preguica1.getCorre());
		System.out.println(preguica1.getMovimentosLentos());

	}

}
