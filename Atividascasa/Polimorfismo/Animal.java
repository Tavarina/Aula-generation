package Polimorfismo;

public abstract class Animal {
 private String nome;
 private int idade;
 
 public Animal(String nomeAnimal, int idadeAnimal) {
	 this.idade = idadeAnimal;
	 this.nome = nomeAnimal;
 }
 public abstract void emitirSom(); 
}
