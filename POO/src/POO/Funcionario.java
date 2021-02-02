package POO;

public class Funcionario {
	
	//atributos
	private String nome;
	private int salario;
	
	//método construtor
	public Funcionario(String nome, int salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public void imprimirInfo() {
		System.out.println("O(a) funcionário(a) "+nome+" tem salário de "+salario+" reais.");
	}
	

}
