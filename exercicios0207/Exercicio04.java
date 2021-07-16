package br.com.generation.exercicios0207;

import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
Autor:
Data: 02.07
*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero, numeroRaiz, numeroPotencia;
		
		System.out.println("Insira um número inteiro");
		numero = entrada.nextInt();
		 
		
		if(numero % 2 == 0) {
			numeroRaiz = Math.sqrt(numero);
			System.out.println("Esse número é par" + " e sua raiz quadrada é: " + numeroRaiz);
		}
		else {
			numeroPotencia = Math.pow(numero, 2);
			System.out.println("Esse número é ímpar" + " e sua pontência é: " + numeroPotencia);
		}

	}

}
