package PacoteJavaEx1;

import java.util.Scanner;

public class ClasseEx1 {
	public static void main (String args[]) {
		int idadeEmDias, anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos anos, meses e dias de vida você tem: ");
		System.out.println("\nAnos");
		anos = ler.nextInt(); 
		System.out.println("\nMeses");
		meses = ler.nextInt(); 
		System.out.println("\nDias");
		dias = ler.nextInt(); 
		
		idadeEmDias = (anos*365)+(meses*30)+dias; 
		
		System.out.println("\nVocê tem "+idadeEmDias +" dias de vida"); 
	}

}
