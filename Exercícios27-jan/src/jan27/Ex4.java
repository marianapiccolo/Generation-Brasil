package jan27;

import java.util.Scanner;

public class Ex4 {
	
	//Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado.

	public static void main(String[] args) {
	int numero;
	double raiz, potencia;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um número ");
	numero = ler.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("É par");
		raiz = Math.sqrt(numero);
		System.out.println("A raiz quadrada é: "+raiz);
	}
	
	else {
		System.out.println("É ímpar");
		potencia = Math.pow(numero,2);
		System.out.println("O número elevado ao quadrado é "+potencia);
	}

	}

}
