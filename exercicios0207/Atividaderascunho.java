package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Atividaderascunho {

/*
3-2-1 feito
3-1-2 feito
2-3-1 feito
2-1-3 feito
1-2-3 feito
1-3-2 feito
*/
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;

        System.out.println("Insira o 1� n�mero: ");
        numero1 = entrada.nextInt();

        System.out.println("Insira o 2� n�mero: ");
        numero2 = entrada.nextInt();

        System.out.println("Insira o 3� n�mero: ");
        numero3 = entrada.nextInt();
        
        //3-2-1 e 3-1-2
        if(numero3 < numero2 && numero3 < numero1) {
        	if(numero2 < numero1) {
        		System.out.println("A ordem crescente �: " + numero3 + ", " + numero2 + ", " + numero1);
        	}
        	else if(numero1 < numero2) {
        		System.out.println("A ordem crescente �: " + numero3 + ", " + numero1 + ", " + numero2);
        	}
        }
        //2-3-1 e 2-1-3
        if(numero2 < numero1 && numero2 < numero3) {
        	if(numero3 < numero1) {
        		System.out.println("A ordem crescente �: " + numero2 + ", " + numero3 + ", " + numero1);
        	}
        	else if(numero1 < numero3) {
        		System.out.println("A ordem crescente �: " + numero2 + ", " + numero1 + ", " + numero3);
        	}
        }
        //1-2-3 e 1-3-2
        if(numero1 < numero2 && numero1 < numero3) {
        	if(numero2 < numero3) {
        		System.out.println("A ordem crescente �: " + numero1 + ", " + numero2 + ", " + numero3);
        	}
        	else if(numero3 < numero2) {
        		System.out.println("A ordem crescente �: " + numero1 + ", " + numero3 + ", " + numero2);
        	}
        }
    }
}
