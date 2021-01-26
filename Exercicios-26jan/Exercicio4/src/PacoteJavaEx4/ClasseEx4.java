package PacoteJavaEx4;

import java.util.Scanner;

public class ClasseEx4 {
	public static void main (String args[]) {
	int a,b,c;
	double r,s,d;
	
	Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número A:");
		a = ler.nextInt();
		System.out.println("\nDigite o número B:");
		b = ler.nextInt();
		System.out.println("\nDigite o número C:");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O valor de D é: "+d);
	
	

}
}