package POO;

public class Paciente {
	//atributos
	private String Nome;
	private int Idade;
	private String Doenca;
	
	//método construtor
	public Paciente(String Nome, int Idade, String Doenca) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Doenca = Doenca;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getDoenca() {
		return Doenca;
	}

	public void setDoenca(String doenca) {
		Doenca = doenca;
	}
	
	public void imprimirInfo() {
		System.out.println("O paciente "+Nome+" de "+Idade+" anos tem "+Doenca);
	}
	

}
