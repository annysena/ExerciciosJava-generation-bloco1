package br.com.generation.aula01.exemplovariavel;

import java.util.Scanner;

public class IntroJava03 {
	//Autor: Anny
	//Data: 01/07

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int tSegundos, tHoras, tMinutos;
		
		System.out.println("Digite o tempo de duração em segundos: ");
		tSegundos = ler.nextInt();
		
		tHoras = tSegundos / 3600;
		
		System.out.println("O tempo de duração em horas é: " + tHoras);
		
		tMinutos = (tSegundos % 3600) / 60;
		
		System.out.println("O tempo de duração em minutos é: " + tMinutos);
		
		tSegundos = tSegundos % 3600 % 60;
				
		System.out.println("O tempo de duração em segundos é: " + tSegundos);
	}

}
