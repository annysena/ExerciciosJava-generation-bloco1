package br.com.generation.exercicios0207;

import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
Autor:
Data: 02.07
*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero, numeroRaiz, numeroPotencia;
		
		System.out.println("Insira um n�mero inteiro");
		numero = entrada.nextInt();
		 
		
		if(numero % 2 == 0) {
			numeroRaiz = Math.sqrt(numero);
			System.out.println("Esse n�mero � par" + " e sua raiz quadrada �: " + numeroRaiz);
		}
		else {
			numeroPotencia = Math.pow(numero, 2);
			System.out.println("Esse n�mero � �mpar" + " e sua pont�ncia �: " + numeroPotencia);
		}

	}

}
