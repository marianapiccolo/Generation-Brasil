package Jan28;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		int numero, cont, par = 0, impar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (cont=1;cont<=10;cont++) {
			System.out.println("\nDigite um número: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\nExistem "+par+" números pares e "+impar+" números ímpares");

	}

}
