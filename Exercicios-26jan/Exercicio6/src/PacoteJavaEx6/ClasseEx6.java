package PacoteJavaEx6;

import java.util.Scanner;

public class ClasseEx6 {
	public static void main (String args[]) {
		int x1,x2,y1,y2;
		double d;
		
		Scanner ler = new Scanner (System.in);
			System.out.println("Entre com o valor de x1: ");
			x1 = ler.nextInt();
			System.out.println("Entre com o valor de x2: ");
			x2 = ler.nextInt();
			System.out.println("Entre com o valor de y1: ");
			y1 = ler.nextInt();
			System.out.println("Entre com o valor de y2: ");
			y2 = ler.nextInt();
			
			d = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1),2))); 
			
			System.out.printf("O valor de d é: %2.2f ",d);
			
			
	}

}
