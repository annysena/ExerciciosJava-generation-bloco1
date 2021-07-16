package br.com.generation.aula01.exemplovariavel;
//Autor: Anny
//Data: 01/07

import java.util.Scanner;

public class IntroJava06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double x2, x1, y1, y2, d1, d2, distanciaP;
		
		System.out.println("Insira as cordenadas do primeiro ponto.");
		
		System.out.println("x1: ");
		x1 = ler.nextDouble();
		
		System.out.println("y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Insira as cordenadas do segundo ponto.");

		System.out.println("x2: ");
		x2 = ler.nextDouble();
		
		System.out.println("y2: ");
		y2 = ler.nextDouble();
		
		d1 = Math.sqrt(x1 - x2);
		d2 = Math.sqrt(y1 - y2);
		
		distanciaP = d1 + d2; 
		
		distanciaP = Math.sqrt(distanciaP);
		
		System.out.println("A distância entre os pontos é: " + distanciaP);
		
		
		
		
		
	}

}
