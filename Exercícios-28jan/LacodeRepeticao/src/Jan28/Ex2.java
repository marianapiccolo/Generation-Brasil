package Jan28;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		int numero, cont, par = 0, impar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (cont=1;cont<=10;cont++) {
			System.out.println("\nDigite um n�mero: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\nExistem "+par+" n�meros pares e "+impar+" n�meros �mpares");

	}

}
