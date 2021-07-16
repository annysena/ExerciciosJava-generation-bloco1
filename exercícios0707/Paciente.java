package br.com.generation.orientacaoaobjetos;
/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
Autor: Anny 
Data: 07/07
*/
public class Paciente {

	//Atributos --> (nome, idade, consulta)
		String nome;
		int idade;
		String consulta;
		
		//Métodos --> (fazerFicha, fazerTriagem, passarConsulta)
		void fazerFicha() {
			System.out.println("O paciente está fazendo sua ficha para ser atendido.");
		}
		void fazerTriagem() {
			System.out.println("O paciente está passando pela triagem para ser atendido.");
	}
		void passarConsulta() {
			System.out.println("O paciente está passando na consulta para saber o que tem.");
}
}