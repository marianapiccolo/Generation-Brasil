package jan29;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		// atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		Scanner ler = new Scanner(System.in);
		
		int[] vet=new int[5];
		int i,maior=vet[0]; 
		
		for (i=0;i<5;i++) {
			System.out.printf("\nDigite o %do n�mero", (i+1));
			vet[i] = ler.nextInt();
			
			if (vet[i]>maior ) {
				maior=vet[i];
					}
				}
	
		System.out.printf("\nA maior pontua��o � %d", maior);		
			}
			
		
		

	}

