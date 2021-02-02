package POO;

public class Funcionario {
	
	//atributos
	private String nome;
	private int salario;
	
	//m�todo construtor
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
		System.out.println("O(a) funcion�rio(a) "+nome+" tem sal�rio de "+salario+" reais.");
	}
	

}
