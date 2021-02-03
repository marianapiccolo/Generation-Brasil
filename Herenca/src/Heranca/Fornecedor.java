package Heranca;

public class Fornecedor extends Pessoa {
	
	//atributos
	private int valorCredito;
	private int valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, int valorCredito, int valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	public int getValorCredito() {
		return valorCredito;
	}




	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}




	public int getValorDivida() {
		return valorDivida;
	}




	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}




	//metodo obter saldo
	public int obterSaldo(int valorCredito, int valorDivida) {
		return  (this.valorCredito-this.valorDivida);
		}
	}

