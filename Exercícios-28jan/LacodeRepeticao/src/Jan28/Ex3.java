package Jan28;

import java.util.Scanner;

public class Ex3 {
	
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99.

	public static void main(String[] args) {
		int idade, menor = 0, maior = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
		
		while (idade != 99 && idade >=0 || idade >= 0 && idade <=120) {
			if (idade < 21 && idade >= 0) {
				menor++;
			}
			if (idade > 50) {
				maior++;
			}
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é "+menor);
		System.out.println("\nO total de pessoas com mais de 50 anos é "+maior);

	}

}
