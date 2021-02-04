package Polimorfismo;

public class Preguica extends Animal {
	
	public Preguica (String nome, int idade, String atividade) {
		super(nome,idade,atividade);
	}
	
	public String getSom() {
		return " ,faz aaa";
	}

}
