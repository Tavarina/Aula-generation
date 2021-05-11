package OriantacaoObjetos;

public class TesteCliente {
	/*1) Crie uma classe cliente 
	e apresente os atributos e métodos referentes esta classe,
	 em seguida crie um objeto cliente, defina as instancias
	  deste objeto e apresente as informações deste objeto no console. */

	public static void main(String[] args) {
		
		System.out.println("\nDados do cliente: ");
		Cliente cliente1 = new Cliente("Joaquim","Fernandes","São Paulo","626464",26);
		
		cliente1.imprimirInfo();
		
		System.out.println("****************************");
		
		cliente1.setNomeDoCliente("Maria");
		cliente1.setSobrenomeDoCliente("Silva");
		cliente1.setCidade("Araraquara");
		cliente1.setNumeroCadastro("255484");
		cliente1.setIdade(40);
		cliente1.imprimirInfo();
		
		System.out.println("****************************");
		
		cliente1.setNomeDoCliente("Bianca");
		cliente1.setSobrenomeDoCliente("Ramos");
		cliente1.setCidade("Sorocaba");
		cliente1.setNumeroCadastro("458715");
		cliente1.setIdade(75);
		cliente1.imprimirInfo();
		

	}

}
