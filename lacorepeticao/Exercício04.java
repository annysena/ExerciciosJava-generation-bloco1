package br.com.generation.lacorepeticao;

import java.util.Scanner;

/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
Autor: Anny
Data: 05/07
*/
public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, genero, humor = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosos40Anos = 0, 
				calmos18Anos = 0, contador = 0;
		
<<<<<<< HEAD
		while(contador < 6) { //150
=======
		while(contador < 150) {
>>>>>>> 7528569f6ae12a31cf67b5a31bc246e913c46784
			System.out.println("Insira sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Insira seu gênero." + "\n1- Feminino" + "\n2- Masculino" + "\n3- Outros");
			genero = entrada.nextInt();
			System.out.println("Insira seu humor." + "\n1- Calme" + "\n2- Nervose" + "\n3- Agressive");
			humor = entrada.nextInt();
			contador++;
			
			if(humor == 1) {
				pessoasCalmas++;
			}
			if(genero == 1 && humor == 2) {
				mulheresNervosas++;
			}
			if (genero == 2 && humor == 3) {
	                homensAgressivos++;
	        }
	        if (genero == 3 && humor == 1) {
	                outrosCalmos++;
	        }
	        if (idade > 40 && humor == 2) {
	                nervosos40Anos++;
	        }
	        if (idade < 18 && humor == 1) {
	                calmos18Anos++;
	}
}
		System.out.println("O número de pessoas calmas é: " + pessoasCalmas);
        System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
        System.out.println("O número de homens agressivos é: " + homensAgressivos);
        System.out.println("O número de outros calmos: " + outrosCalmos);
        System.out.println("O número de pessoas nervosas com mais de 40 anos: " + nervosos40Anos);
        System.out.println("O número de pessoas calmas com menos de 18 anos: " + calmos18Anos);
}
}
