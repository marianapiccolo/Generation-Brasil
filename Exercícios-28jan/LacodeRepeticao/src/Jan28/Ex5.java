package Jan28;

import java.util.Scanner;

public class Ex5 {
	// Crie um programa que leia um n�mero do teclado at� que encontre um
	// n�mero igual a zero. No final, mostre a soma dos n�meros
	// digitados.
	
	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um n�mero: ");
			numero = ler.nextInt();
			soma = soma + numero;
			}
		
		while (numero != 0); 

		
		System.out.println("\nA soma � "+soma);


	}
}


