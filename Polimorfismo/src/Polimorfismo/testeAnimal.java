package Polimorfismo;

public class testeAnimal {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("P�rola",15,"corre");
		Cachorro cachorro = new Cachorro("Vick",13,"corre");
		Preguica preguica = new Preguica("Lazy",5,"sobe em �rvores");
		
		System.out.println(cavalo.Animal()+cavalo.getSom());
		System.out.println(cachorro.Animal()+cachorro.getSom());
		System.out.print(preguica.Animal()+preguica.getSom());

	}

}
