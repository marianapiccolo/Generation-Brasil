package jan27;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a, b, c, maior; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextInt();

		System.out.println("\nDigite o segundo n�mero: ");
		b = ler.nextInt();

		System.out.println("\nDigite o terceiro n�mero: ");
		c = ler.nextInt();
		
		
		if (a>b && a >c) {
			
			System.out.println("\nO maior n�mero �: "+a);
		}
		if (b>a && b >c) {
			System.out.println("\nO maior n�mero �: "+b);
		}
		
		if (c>a && c >b) {
			System.out.println("\nO maior n�mero �: "+c);
		}
		
	
	}

}
