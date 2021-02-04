package Polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade, String atividade) {
		super(nome,idade,atividade);
	}
	
	public String getSom() {
		return " ,faz au au";
	}

}
