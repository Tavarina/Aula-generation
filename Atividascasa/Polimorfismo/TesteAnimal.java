package Polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cavalo cavalo = new Cavalo("Spirit", 25);
		Cachorro cachorro = new Cachorro ("kookie",10);
		Preguica preguica = new Preguica ("Jinjin",45);
		
		cavalo.correr();
		cavalo.emitirSom();
		cachorro.correr();
		cachorro.emitirSom();
		cachorro.correr();
		cachorro.emitirSom();
		
	}

}
