package br.com.generation.aula01.exemplovariavel;

//Autor: Anny
//Data: 01/07

import java.util.Scanner;

public class Introjava02 {

	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int idadeDias, idadeAnos, idadeMeses;
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = idadeDias / 365;
				
		System.out.println("Sua idade em anos é: " + idadeAnos);
		
		idadeMeses = (idadeDias % 365) / 30;
		
		System.out.println("Sua idade em meses é: " + idadeMeses);
		
		idadeDias = idadeDias % 365 % 30;
				
		System.out.println("Sua idade em dias é: " + idadeDias);
	}
}
