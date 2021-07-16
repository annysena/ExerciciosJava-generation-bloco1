package br.com.generation.aula01.exemplovariavel;
//Autor: Anny
//Data: 01/07

import java.util.Scanner;

public class IntroJava08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double valorFab, valor;
		
		System.out.println("Inisira o valor de fábrica: ");
		valorFab = ler.nextDouble();
		
		valor = valorFab + (valorFab * 0.28) + (valorFab * 0.45);
		
		System.out.println("O valor total do carro é: " + valor);
	}

}
