package br.com.generation.exercicios0207;
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Insira o 1� n�mero: ");
        numero1 = entrada.nextInt();

        System.out.println("Insira o 2� n�mero: ");
        numero2 = entrada.nextInt();

        System.out.println("Insira o 3� n�mero: ");
        numero3 = entrada.nextInt();

        if((numero1 > numero2) && (numero1 > numero3)){
            if(numero2 > numero3) {
                System.out.println("A ordem crescente �: " + numero3 + ", " + numero2 + ", " + numero1);
            }
            else //(numero3 > numero2) 
            	{
                System.out.println("A ordem crescente �: " + numero2 + ", " + numero3 + ", " + numero1);
           } 
        }

        else if(numero2 > numero3 && numero2 > numero1) {
            if(numero1 > numero3) {
                System.out.println("A ordem crescente �: " + numero3 + ", " + numero1 + ", " + numero2);
            }
            else if(numero3 > numero1) {
                System.out.println("A ordem crescente �: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        }

        else if(numero3 > numero1 && numero3 > numero2) {
            if(numero1 > numero2) {
                System.out.println("A ordem crescente �: " + numero2 + ", " + numero1 + ", " + numero3);
            }
            else if(numero2 > numero1) {
                System.out.println("A ordem crescente �: " + numero1 + ", " + numero2 + ", " + numero3);
            }
        }
    }
}