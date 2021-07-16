package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*3. Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
posi��o das matrizes N1 e N2.
Autor; Anny
Data: 06/07
*/
public class Exerc�cio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		
		for(int linha = 0; linha <= 3; linha++) {
			for(int coluna = 0; coluna <= 5; coluna++) {
				
				System.out.println("Insita N1: ");
				N1[linha][coluna] = entrada.nextInt();
				System.out.println("Insita N2: ");
				N2[linha][coluna] = entrada.nextInt();
				
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
		    }
		}
		for(int linha = 0; linha <= 3; linha++) {
			for(int coluna = 0; coluna <= 5; coluna++) {
				
				System.out.println("\nA matriz M1 �: " + M1[linha][coluna]);
				System.out.println("\nA matriz M2 �: " + M2[linha][coluna]);
			}
		}
	}
}