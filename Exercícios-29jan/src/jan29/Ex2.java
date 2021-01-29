package jan29;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		//imprima a média aritmética dos lançamentos, contabilize e apresente também
		//quantas foram as ocorrências da maior pontuação.

		Scanner ler = new Scanner (System.in);
		
		int[] dado = new int[10];
		int i, soma = 0, contmaior = 0;
		float media;
		
		for (i=0;i<10;i++) {
			
			while (dado[i]<=0 || dado[i]>6) {
				System.out.printf("\nDigite o valor do lançamento %d: ",(i+1));
				dado[i] = ler.nextInt();
			}
	
			soma = soma + dado[i];
			
			if(dado[i]==6) {
				contmaior++;
			}
		}
		
		for (i=0;i<10;i++) {
			System.out.printf("\nLançamento[%d] = %d\n", (i+1), dado[i]);
		}
		media = soma/10;
		System.out.println("A média foi de "+media);
		System.out.printf("\nTivemso %d lançamento com o maior valor (6)", contmaior);
		
	}

}
