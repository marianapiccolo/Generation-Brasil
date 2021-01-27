package jan27;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Infantil");
		}
		
		if (idade>=15 && idade<=17) {
			System.out.println("Juvenil");
		}
		
		if (idade>=18 && idade<=25) {
			System.out.println("Adulto");
		}
		
		else if (idade<10 || idade>25) {
			System.out.println("Não se enquadra");
		}

		

	}

}
