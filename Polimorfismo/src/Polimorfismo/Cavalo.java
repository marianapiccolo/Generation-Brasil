package Polimorfismo;

public class Cavalo extends Animal {
	public Cavalo(String nome, int idade, String atividade) {
		super(nome, idade, atividade);
	}
	
	public String getSom() {
		return " ,faz iririri";
	}
	
}
