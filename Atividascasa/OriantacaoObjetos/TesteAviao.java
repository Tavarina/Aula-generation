package OriantacaoObjetos;

public class TesteAviao {
	
	/*2) Crie uma classe avi�o e apresente os atributos
	 *  e m�todos referentes esta classe, em seguida crie um objeto avi�o,
	 *   defina as instancias deste objeto e apresente as 
	 *   informa��es deste objeto no console.*/

	public static void main(String[] args) {
		
		String numeroDoVoo;
		String destino;
		String aeroporto;
		String passageiro;
		int hora;
		String minuto;
		
       System.out.println("\nResumo de sua viagem... ");
		Aviao aviao = new Aviao("2544-BMQ","Bruxelas, B�lgica","Zaventem","Luiza",15,":30");
		
		aviao.imprimirInfo();
		
		
		
		System.out.println("****************************");
		
		aviao.setNumeroDoVoo("3467-JJK");
		aviao.setDestino("Coreia do Sul, Seul");
		aviao.setAeroporto("Incheon");
		aviao.setPassageiro("Bernado");
		aviao.setHora(02);
		aviao.setMinuto(":00");
		aviao.imprimirInfo();
		
		System.out.println("****************************");
		
		
		aviao.setNumeroDoVoo("1245-BNY");
		aviao.setDestino("Brasil, S�o Paulo");
		aviao.setAeroporto("Congonhas");
		aviao.setPassageiro("Isabela");
		aviao.setHora(14);
		aviao.setMinuto(":15");
		aviao.imprimirInfo();
		
		System.out.println("****************************");

	}

}
