package jan29;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		//quantas foram as ocorr�ncias da maior pontua��o.

		Scanner ler = new Scanner (System.in);
		
		int[] dado = new int[10];
		int i, soma = 0, contmaior = 0;
		float media;
		
		for (i=0;i<10;i++) {
			
			while (dado[i]<=0 || dado[i]>6) {
				System.out.printf("\nDigite o valor do lan�amento %d: ",(i+1));
				dado[i] = ler.nextInt();
			}
	
			soma = soma + dado[i];
			
			if(dado[i]==6) {
				contmaior++;
			}
		}
		
		for (i=0;i<10;i++) {
			System.out.printf("\nLan�amento[%d] = %d\n", (i+1), dado[i]);
		}
		media = soma/10;
		System.out.println("A m�dia foi de "+media);
		System.out.printf("\nTivemso %d lan�amento com o maior valor (6)", contmaior);
		
	}

}
