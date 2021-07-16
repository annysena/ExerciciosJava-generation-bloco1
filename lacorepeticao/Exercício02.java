package br.com.generation.lacorepeticao;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
Autor: Anny
Data: 05/07
 */

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner numeroEscolhido = new Scanner(System.in);
		
		int contador, numero = 1, contadorPar = 0, contadorImpar = 0; 
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("Insira um número: ");
			numero = numeroEscolhido.nextInt();
			
			if(numero % 2 == 0) {
				contadorPar++;
				System.out.println("Os número pares são: " + contadorPar);
			}
			else{
				contadorImpar++;
				System.out.println("Os número ímpares são: " + contadorImpar);
			}
		}
		
	  }
	}
