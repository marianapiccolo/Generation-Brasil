package jan29;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		//diagonal, ou seja, diagonal principal.
		
		Scanner ler = new Scanner (System.in);
		
		int[][] m1 = new int [3][3]; // matriz digitada
		int i,j,somatotal = 0, somadiagonal = 0;
		
		
		for (i=0; i<3;i++) {
			for (j=0; j<3;j++) {
				System.out.printf("Digite o valor da posição [%d][%d] da matriz: ", (i+1),(j+1));
				m1[i][j]=ler.nextInt();
				
				somatotal = somatotal + m1[i][j];
				
				if(i==j) {
					somadiagonal = somadiagonal + m1[i][j];
				}
			}
			
		}
		
		System.out.println("O valor da soma da matriz é: "+somatotal);
		System.out.println("O valor da soma da diagonal da matriz é: "+somadiagonal);
						
	}

}