package Heranca;


public class testeEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado = new Empregado("Marcos","RuaBela","38759403",2,1000,20);		
		
		empregado.calcularSalario();
		empregado.imprimirInfo();
		
	}

}
