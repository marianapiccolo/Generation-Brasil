package Jan28;

import java.util.Scanner;

public class Ex5 {
	// Crie um programa que leia um número do teclado até que encontre um
	// número igual a zero. No final, mostre a soma dos números
	// digitados.
	
	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = ler.nextInt();
			soma = soma + numero;
			}
		
		while (numero != 0); 

		
		System.out.println("\nA soma é "+soma);


	}
}


