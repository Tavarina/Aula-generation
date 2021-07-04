package Polimorfismo;

public class Cavalo extends Animal {
	
	private String corCrina;
	public Cavalo(String nomeAnimal,int idadeAnimal)
	{
		super(nomeAnimal,idadeAnimal);
		this.corCrina =corCrina;
	}
	
	public void emitirSom()
	{
		System.out.println("\nCavalo relincha: Irrrrinn");
	}
	public void correr() {
		System.out.println("Trotando....");
	}

	public String getCorCrina() {
		return corCrina;
	}

	public void setCorCrina(String corCrina) {
		this.corCrina = corCrina;
	}
	
}
