package br.com.generation.orientacaoaobjetos;

public class TestaPaciente {

	public static void main(String[] args) {
		
		//Instancia (paciente1)
				Paciente paciente1 = new Paciente();
				
				//Adicionando valores aos atributos
				paciente1.nome = "\nNome do paciente: \nJos�" + "\n\nIdade do paciente: ";
				paciente1.idade = 58;
				paciente1.consulta = "\nConsulta com o end�crinologista.";
				
				//Convocando m�todos
				paciente1.fazerFicha();
				paciente1.fazerTriagem();
				paciente1.passarConsulta();
				
				//Imprimindo
				System.out.println(paciente1.nome);
				System.out.println(paciente1.idade);
				System.out.println(paciente1.consulta);

	}

}
