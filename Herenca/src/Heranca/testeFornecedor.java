package Heranca;

public class testeFornecedor {

	public static void main(String[] args) {
		int valorCredito=0; 
		int valorDivida=0;
		
		//instancia
		Fornecedor fornecedor1 = new Fornecedor("Mario","Rua21","37845903",1000,400);
		
		//nome, endere�o e telefone
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndere�o());
		System.out.println(fornecedor1.getTelefone());
				
		//saidas
		System.out.println(fornecedor1.getValorCredito());
		System.out.println(fornecedor1.getValorDivida());
			
	
		//Diferenca valor cr�dito e valor d�vida
		System.out.println(fornecedor1.obterSaldo(valorCredito, valorDivida));

	}

}
