package OriantacaoObjetos;

public class Pacientes {
	/*7) Crie uma classe
	 *  paciente e apresente os atributos e 
	 *  métodos referentes esta classe, em seguida crie 
	 *  um objeto paciente, defina as instancias deste objeto 
	 *  e apresente as informações deste objeto no console.*/
	
	private String nomeDoPaciente;
	private String sobrenomeDoPaciente;
    private String cidadeDoPaciente;
    private String numeroDoRegistro;
    private String entradaDoPaciente;
    private String motivo;
    int idade;
	
    
    public Pacientes(String nomeDoPaciente,String sobrenomeDoPaciente,int idade,String cidadeDoPaciente,String numeroDoRegistro,String entradaDoPaciente, String motivo) {
    	
    }
    public Pacientes (int idade) {
    	this.idade = idade;
    }
    public void imprimirInfo ()
    {
    System.out.println("\nNome: "+nomeDoPaciente+"\nSobrenome: "+sobrenomeDoPaciente+"\nIdade do paciente: "+idade+"\nCidade: "+cidadeDoPaciente+"\nNº de Registro: "+numeroDoRegistro+"\nEntrada do Paciente: "+entradaDoPaciente+ "\nMotivo: "+motivo);	
    
}
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}
	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}
	public String getSobrenomeDoPaciente() {
		return sobrenomeDoPaciente;
	}
	public void setSobrenomeDoPaciente(String sobrenomeDoPaciente) {
		this.sobrenomeDoPaciente = sobrenomeDoPaciente;
	}
	public String getCidadeDoPaciente() {
		return cidadeDoPaciente;
	}
	public void setCidadeDoPaciente(String cidadeDoPaciente) {
		this.cidadeDoPaciente = cidadeDoPaciente;
	}
	public String getNumeroDoRegistro() {
		return numeroDoRegistro;
	}
	public void setNumeroDoRegistro(String numeroDoRegistro) {
		this.numeroDoRegistro = numeroDoRegistro;
	}
	public String getEntradaDoPaciente() {
		return entradaDoPaciente;
	}
	public void setEntradaDoPaciente(String entradaDoPaciente) {
		this.entradaDoPaciente = entradaDoPaciente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
    
}
