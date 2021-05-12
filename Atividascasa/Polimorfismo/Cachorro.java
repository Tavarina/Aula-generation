package Polimorfismo;

public class Cachorro extends Animal {
	public Cachorro(String nomeAnimal,int idadeAnimal)
	{
		super(nomeAnimal,idadeAnimal);
	}
	public void emitirSom()
	{
		System.out.println("\nCachorro late: au au au au au");
	}
	public void correr() {
		System.out.println("\nCorrendo....");
	}
}
