package Jan28;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
		// obtemos resto = 5.
		
		int x,d;
		
		for (x=1000; x<=1999;x++) {
			d = x%11;
			if (d==5) {
				System.out.println("\nO n�mero "+x+" dividido por 11 tem resto igual a "+d);
				
			}
		}
	}

}
