package br.com.generation.aula01.exemplovariavel;

import java.util.Scanner;

//Autor: Anny
//Data: 01/07
public class IntroJava01 {
		
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int idadeDias, anos, meses, dias;
		
		System.out.println("Insira sua idade em anos, meses e dias.");
		
		System.out.println("Anos: ");
		anos = ler.nextInt();
		
		System.out.println("Meses: ");
		meses = ler.nextInt();
		
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		idadeDias = (anos * 365) + (meses * 30) + dias;
				
				System.out.println("Sua idade em dias é: " + idadeDias + " dias");
		
	}
}
