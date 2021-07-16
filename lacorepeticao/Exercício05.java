package br.com.generation.lacorepeticao;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
Autor: Anny
Data: 05/07
*/
public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Insira um número: ");
			numero = entrada.nextInt();
			soma = soma + numero;
		}
		while(numero != 0);
		System.out.println("A soma dos números é: " + soma);
	}

}
