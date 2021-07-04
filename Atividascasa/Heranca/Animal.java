package Heranca;

public class Animal{
	
	/*Crie uma hierarquia de classes conforme abaixo com os 
	 * seguintes atributos e comportamentos (observe a tabela), 
	 * utilize os seus conhecimentos e distribua as 
	 * caracterÝsticas de forma que tudo o que for comum a todos 
	 * os animais fique na classe Animal: 	 */

	private String nome;
	private int idade;
	
	
	public Animal(String nomeAnimal, int idadeAnimal)
	{
		this.nome = nomeAnimal;
		this.idade = idadeAnimal;
		
	}
	
	public void emitirSom() {
		System.out.println("Emitindo som: ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
			
			
	}
		


