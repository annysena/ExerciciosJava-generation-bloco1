package br.com.generation.exercicios0207;
/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
Autor: Anny
Data: 02/07
*/
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();
		
		if((idade >= 10) && (idade <= 14)) {
			System.out.println("Você pertence a categoria infantil.");
		}
		else if((idade >= 15) && (idade <= 17)) {
			System.out.println("Você pertence a categoria juvenil.");
		}
		else if((idade >= 18) && (idade <= 25)) {
			System.out.println("Você pertence a categoria adulto.");
		}
		else {
			System.out.println("Nenuma categoria.");
		}
	}

}
