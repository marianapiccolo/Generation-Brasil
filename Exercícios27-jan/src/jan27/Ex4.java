package jan27;

import java.util.Scanner;

public class Ex4 {
	
	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	//�mpar exiba o n�mero elevado ao quadrado.

	public static void main(String[] args) {
	int numero;
	double raiz, potencia;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um n�mero ");
	numero = ler.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("� par");
		raiz = Math.sqrt(numero);
		System.out.println("A raiz quadrada �: "+raiz);
	}
	
	else {
		System.out.println("� �mpar");
		potencia = Math.pow(numero,2);
		System.out.println("O n�mero elevado ao quadrado � "+potencia);
	}

	}

}
