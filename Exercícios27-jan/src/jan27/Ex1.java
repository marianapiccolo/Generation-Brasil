package jan27;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a, b, c, maior; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = ler.nextInt();

		System.out.println("\nDigite o segundo número: ");
		b = ler.nextInt();

		System.out.println("\nDigite o terceiro número: ");
		c = ler.nextInt();
		
		
		if (a>b && a >c) {
			
			System.out.println("\nO maior número é: "+a);
		}
		if (b>a && b >c) {
			System.out.println("\nO maior número é: "+b);
		}
		
		if (c>a && c >b) {
			System.out.println("\nO maior número é: "+c);
		}
		
	
	}

}
