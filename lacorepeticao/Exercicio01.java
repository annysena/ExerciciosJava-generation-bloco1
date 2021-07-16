package br.com.generation.lacorepeticao;

/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
Autor: Anny
Data: 05/07
*/

public class Exercicio01 {

	public static void main(String[] args) {
		
		int contador;
		
		for(contador = 1000; contador <= 1999; contador++) {
			if(contador % 11 == 5) {
				System.out.println(contador);
		}
	}
}
}
