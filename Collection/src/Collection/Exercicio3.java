package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercicio3 {

	public static void main(String[] args) {
		//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque.
		
		//deSTRING collection
		List<String> produto = new ArrayList<String>();
		//nomes da lista
		
		produto.add("chocolate");
		produto.add("queijo");
		produto.add("cappuccino");
		produto.add("sorvete");
		produto.add("abobrinha");
		
		if(produto.isEmpty()) {
			System.out.println("Estoque vazio");
		}
		
		else {
		
		System.out.println("***Estoque do mercado***");
		
		//imprimir dados
		System.out.println("Produtos: "+produto);
		
		//remove produto
		produto.remove("cappuccino");
		System.out.println("Lista com produto(s) removido(s)"+produto);
		
		//atualizar lista
		List<String> atualizarlista = Arrays.asList("café","leite");
		produto.addAll(atualizarlista);
		System.out.println("Lista atualizada: "+produto);
		
					
	}

}
}
