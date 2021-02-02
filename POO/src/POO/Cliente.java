package POO;

public class Cliente {
	//declaração dos atributos da classe
	private String primeiroNome;
	private String ultimoNome;
	private String produto;
	private int preco;
	
	// método construtor
	public Cliente(String primeiro, String ultimo, String produto, int preco) {
		this.primeiroNome = primeiro;
		this.ultimoNome = ultimo;
		this.produto = produto;
		this.preco = preco;
	}
	
		
	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public void imprimirInfo()
	{
		System.out.println("O cliente "+primeiroNome+" "+ ultimoNome+ " " +"comprou o pruduto "+produto+" com o preco de "+preco+" reais.");
	}


}
