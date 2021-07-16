package br.com.generation.aula01.exemplovariavel;
//Autor: Anny
//Data: 01/07

import java.util.Scanner;

public class IntroJava07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, ee, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		ee = ler.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = ler.nextDouble();
		
		x = ((c * ee - b * f) / (a * ee - b * d));
		y = ((a * f - c * d) / (a * ee - b * d));
		
		System.out.println("O valor de Y é: " + y + " e o valor de X é: " + x);

	}

}
