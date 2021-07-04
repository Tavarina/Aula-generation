package Heranca;

public abstract class Animal1 {

	
	private String tipo;
	abstract public void emitirSom(String som);
	abstract public void movimento(String acao);
	
	public Animal1(String aa)
	{
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}


