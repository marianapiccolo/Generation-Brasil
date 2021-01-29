package jan29;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		// a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
        // das matrizes N1 e N2;
       // b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	   // posição das matrizes N1 e N2.
		
		Scanner ler = new Scanner (System.in); 
		
		int i,j;
		int N1[][] = new int [2][2];
		int N2[][] = new int [2][2];
		int M1[][] = new int [2][2]; //matriz soma
		int M2[][] = new int [2][2]; //matriz diferença
		
		//matriz N1:
		
		for (i=0;i<2;i++) {
			for (j=0;j<2;j++) {
				System.out.printf("Digite o valor da posição [%d][%d] da matriz N1: ", (i+1),(j+1));
				N1[i][j]=ler.nextInt();
			}
		}
		
		//matriz N2:
		
		for (i=0;i<2;i++) {
			for (j=0;j<2;j++) {
				System.out.printf("Digite o valor da posição [%d][%d] da matriz N2: ", (i+1),(j+1));
				N2[i][j]=ler.nextInt();
					}
				}
		//imrpimir matrizes
		
		//Matriz N1
		System.out.println("\nMatriz N1:");
		for (i=0;i<2;i++) {	
			System.out.println();
			for (j=0;j<2;j++) {
						System.out.printf("|%d|",N1[i][j]);
						}						
					}
		
		//Matriz N2
		System.out.println();
		System.out.println("\nMatriz N2:");
		for (i=0;i<2;i++) {	
			System.out.println();
			for (j=0;j<2;j++) {
						System.out.printf("|%d|",N2[i][j]);
						}						
					}
		//Soma e subtração M1 = N1+N2. M2 = N1-N2; 
		
		for (i=0;i<2;i++) {
			for (j=0;j<2;j++) {
				M1[i][j] = N1[i][j]+N2[i][j];
				M2[i][j] = N1[i][j]-N2[i][j];
			}
		}
		
		//Impressão das matrizes M1 e M2
		System.out.println("\nSoma - Matriz M1");
		for (i=0;i<2;i++) {
			System.out.println();
		
			for (j=0;j<2;j++) {
				System.out.printf("|%d|", M1[i][j]); 
			}
		}
	
		System.out.println("\nSubtração - Matriz M2");
		for (i=0;i<2;i++) {
			System.out.println();
			
			for (j=0;j<2;j++) {
				System.out.printf("|%d|", M2[i][j]); 
				}
		}
				
	}

}
