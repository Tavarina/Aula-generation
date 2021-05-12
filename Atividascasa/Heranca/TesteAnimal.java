package Heranca;


public class TesteAnimal {

	public static void main(String[] args) {
		
		
		
		Cachorro cachorro = new Cachorro ("\nCachorro",5);
		Cavalo cavalo = new Cavalo("\nCavalo",15);
		Preguica preguica = new Preguica("\nPreguiça",80);
	  Animal animal = null;
		
	       preguica.emitirSom();
	       preguica.subirEmArvores();
	       cachorro.correr();
	       cachorro.emitirSom();
	       cavalo.correr();
	       cavalo.emitirSom();
	  
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade());
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade());
		
		
		
		
		/*int n= (int)(Math.random()*3.0);
		System.out.println("\nEsse animal: "+n);
		switch(n)
		{
		case 0: animal = cachorro; break;
		case 1: animal = cavalo; break;
		case 2: animal = preguica; break;
		default: System.out.println("Não temos informação sobre esse animal.");
		
		}*/
		
		

	}

}
