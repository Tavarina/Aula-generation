package OriantacaoObjetos;

public class Aviao {

	/*2) Crie uma classe avi�o e apresente os atributos
	 *  e m�todos referentes esta classe, em seguida crie um objeto avi�o,
	 *   defina as instancias deste objeto e apresente as 
	 *   informa��es deste objeto no console.*/
	 
	String numeroDoVoo;
	String destino;
	String aeroporto;
	String passageiro;
	int hora;
	String minuto;
	
	public Aviao(String numeroDoVoo, String destino, String aeroporto, String passageiro, int hora, String minuto) 
	{
		this.numeroDoVoo = numeroDoVoo;
		this.destino = destino;
		this.aeroporto = aeroporto;
		this.passageiro = passageiro;
		this.hora = hora;
		this.minuto = minuto;
	}
	public Aviao (int hora) {
		
		this.hora = hora;
	}

	public void imprimirInfo () {
		
		System.out.println("\nN�mero do Voo: "+numeroDoVoo+"\nDestino: "+destino+"\nAeroporto: "+aeroporto+"\nPassageiro: "+passageiro+"\nHora: "+hora+""+minuto);
		
	}
	public String getNumeroDoVoo() {
		return numeroDoVoo;
	}
	public void setNumeroDoVoo(String numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getAeroporto() {
		return aeroporto;
	}
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
	public String getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getMinuto() {
		return minuto;
	}
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	
}
