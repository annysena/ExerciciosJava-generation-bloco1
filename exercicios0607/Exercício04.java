package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
Autor; Anny
Data: 06/07
*/
public class Exercício04 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		double[][] valorMatriz = new double[3][3];
		double soma = 0, somaDiagonal = 0.0;
		
		for(int linha = 0; linha <= 2; linha++) {
			for(int coluna = 0; coluna <= 2; coluna++) {
				
				System.out.println("Insira o valor da matriz: ");
				valorMatriz[linha][coluna]= entrada.nextDouble();
				soma = soma + valorMatriz[linha][coluna];						
		}
	}
			somaDiagonal = valorMatriz[0][0] + valorMatriz[1][1] + valorMatriz[2][2];
			
			System.out.println("\nA soma do valor da matriz é: " + soma);
			System.out.println("\nA soma dos valores da primeira diagonal é: " + somaDiagonal);
	}
}