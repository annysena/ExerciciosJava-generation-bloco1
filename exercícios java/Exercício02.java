package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
Autor: Anny
Data: 06/07
*/
public class Exercício02 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		double[] dados = new double[10]; //--> [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		double soma = 0.0, media = 0.0, maiorPontuacao = 0.0;
		
		System.out.println("Insira os valores: ");
		
		for(int contador = 0; contador <= 9; contador++) {
			dados[contador] = entrada.nextDouble();
			soma = soma + dados[contador];
			media = soma / 10;
			
			if(dados[contador] > maiorPontuacao) {
				maiorPontuacao = dados[contador];
			}
	   }
		System.out.println("\nA média aritmética dos lançamentos é: " + media);
		System.out.println("\nA maior pontuação é: " + maiorPontuacao);
}
}