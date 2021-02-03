package Heranca;

public class Empregado extends Pessoa {
	
	//atributos
	private int codigoSetor;
	private int salarioBase;
	private double imposto;
	private double calcularSalario;
	
	
	public Empregado(String nome, String endere�o, String telefone, int codigoSetor, int salarioBase, double imposto) {
		super(nome,endere�o,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	public double getCalcularSalario() {
		return calcularSalario;
	}

	public void setCalcularSalario(double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
	
	public double calcularSalario() {
		 
		return calcularSalario = (this.salarioBase-(this.salarioBase*this.imposto/100));
		}		 

	public void imprimirInfo() {
		System.out.println("Nome do empregado: "+getNome()+"\n"+"C�digo do setor: "+getCodigoSetor()+"\n"+"Sal�rio Base: "+getSalarioBase()+"\n"+"Imposto: "+getImposto()+"%"+"\n"+"Sal�rio: "+getCalcularSalario());
	}


}
