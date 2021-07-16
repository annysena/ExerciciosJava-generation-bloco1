package br.com.generation.orientacaoaobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Instancia (cliente1)
		Cliente cliente1 = new Cliente();
		
		//Adicionando valores aos atributos
		cliente1.nome = "\nNome do cliete: \nMaria" + "\n\nCPF do cliente: ";
		cliente1.cpf = 1112223334;
		cliente1.formaPagamento = "\nForma de pagamento: \ndinheiro";
		
		//Convocando métodos
		cliente1.comprarRoupa();
		cliente1.comprarSapato();
		cliente1.comprarMoveis();
		
		//Imprimindo
		System.out.println(cliente1.nome);
		System.out.println(cliente1.cpf);
		System.out.println(cliente1.formaPagamento);

	}

}
