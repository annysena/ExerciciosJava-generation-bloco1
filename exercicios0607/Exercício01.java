package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
Autor: Anny]
Data: 06/07
*/
public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] pontuacao = new double[5]; //--> [0] [1] [2] [3] [4]
		double maiorPontuacao = 0.0;
		
		System.out.println("Insira os valores de sua pontua��o: ");
		
		for(int contador = 0; contador <= 4; contador++) {
			pontuacao[contador] = entrada.nextDouble();
			
			if(pontuacao[contador] > maiorPontuacao) {
				maiorPontuacao = pontuacao[contador];
			}
		}
		System.out.println("\nSua maior pontua��o �: " + maiorPontuacao);
	}

}
