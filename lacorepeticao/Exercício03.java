package br.com.generation.lacorepeticao;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
Autor: Anny
Data: 05/07
*/
public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, total21Anos = 0, total50Anos = 0;
		
		while(idade != -99) {
			System.out.println("Insira sua idade: ");
			idade = entrada.nextInt();
			
			if(idade > 0 && idade <= 21) {
				System.out.println("Idade é menor que 21 anos.");
				total21Anos++;
			}
			
			if(idade > 50) {
				System.out.println("Idade é maior que 50 anos.");
				total50Anos++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + total21Anos);
		System.out.println("O total de pessoas com mais de 50 anos é: " + total50Anos);

	}
}
