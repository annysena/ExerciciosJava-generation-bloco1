package br.com.generation.lacorepeticao;

import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
Autor: Anny
Data: 05/07
*/
public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0, multiplo3 = 0;
		
		do {
			System.out.println("Insira um número inteiro: ");
			numero = entrada.nextInt();
		
			if(numero % 3 == 0 && numero != 0) {
				multiplo3++;
				soma = soma + numero;
			}
			
		}
		while(numero != 0);
		System.out.println("A média dos números múltiplos de 3 é: " + soma / multiplo3);
	}

}
