package Polimorfismo;

public class Preguica extends Animal{
	public Preguica(String nomeAnimal,int idadeAnimal)
	{
		super(nomeAnimal,idadeAnimal);
	}
	public void emitirSom()
	{
		System.out.println("\nCachorro late: ZZZzzzzzzzzzzz");
	}
	public void subirEmArvores() {
		System.out.println("\nSubindo....");
	}

}
