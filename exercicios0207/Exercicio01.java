package br.com.generation.exercicios0207;

import java.util.Scanner;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
//Autor: Anny
//Data: 02/07
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3, numeroMaior;
		
		System.out.println("Insira o 1º número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Insira o 2º número: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Insira o 3º número: ");
		numero3 = entrada.nextInt();
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("O maior número é: " + numero1);
		}
		else if((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("O maior número é: " + numero2);
		}
		else if((numero3 > numero1) && (numero3 > numero2)) {
			System.out.println("O maior número é: " + numero3);
		}
		
	}

}
