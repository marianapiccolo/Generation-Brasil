package Heranca;

public class Empregado extends Pessoa {
	
	//atributos
	private int codigoSetor;
	private int salarioBase;
	private double imposto;
	private double calcularSalario;
	
	
	public Empregado(String nome, String endereço, String telefone, int codigoSetor, int salarioBase, double imposto) {
		super(nome,endereço,telefone);
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
		System.out.println("Nome do empregado: "+getNome()+"\n"+"Código do setor: "+getCodigoSetor()+"\n"+"Salário Base: "+getSalarioBase()+"\n"+"Imposto: "+getImposto()+"%"+"\n"+"Salário: "+getCalcularSalario());
	}


}
