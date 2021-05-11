package Heranca;


public class TesteAnimal {

	public static void main(String[] args) {
		
		
		
		Cachorro cachorro = new Cachorro ("\nCachorro: Pipoca",5);
		Cavalo cavalo = new Cavalo("\nCavalo: Ben",15);
		Preguica preguica = new Preguica("\nPreguiça: JM",80);
		
		
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade());
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade());
		
		

	}

}
