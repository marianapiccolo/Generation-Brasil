package jan27;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int a,b,c, maior, menor, meio;
		
	Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextInt();

		System.out.println("\nDigite o segundo n�mero: ");
		b = ler.nextInt();

		System.out.println("\nDigite o terceiro n�mero: ");
		c = ler.nextInt();
		
		if(a>b && a>c) {
			maior = a;
			if(b>c) {
				meio = b;
				menor = c;
				}
				
				else {
					meio = c;
					menor = b;
				}
			
			System.out.println("N�meros em ordem crescente: "+menor+ " "+meio+" "+maior);
			}
			
		
		
		if(b>a && b>c) {
			maior = b;
			if(a>c) {
				meio = a;
				menor = c;}
				else {
					meio = c;
					menor = a;
				}
			
			System.out.println("N�meros em ordem crescente: "+menor+ " "+meio+" "+maior);
			}
			
		
		if(c>b && c>a) {
			maior = c;
			if(b>a) {
				meio = b;
				menor = a;}
				else {
					meio = a;
					menor = b;
				}
			
		
			System.out.println("N�meros em ordem crescente: "+menor+ " "+meio+" "+maior);
		}
		
}
}


