package OriantacaoObjetos;

public class Cliente {
 /*1) Crie uma classe cliente 
	e apresente os atributos e métodos referentes esta classe,
	 em seguida crie um objeto cliente, defina as instancias
	  deste objeto e apresente as informações deste objeto no console. */
	
	private String nomeDoCliente;
	private String sobrenomeDoCliente;
    private String cidade;
    private String numeroCadastro;
    
    int idade;
    
    public Cliente(String nomeDoCliente,String sobrenomeDoCliente,String cidade,String numeroCadastro, int idade)
    {
    	this.nomeDoCliente = nomeDoCliente;
    	this.sobrenomeDoCliente = sobrenomeDoCliente;
    	this.cidade = cidade;
    	this.numeroCadastro = numeroCadastro;
    	this.idade = idade;
    	
    	
    }
    public Cliente (int idade) {
    	this.idade = idade;
    }
    public void imprimirInfo ()
    {
    System.out.println("\nNome: "+nomeDoCliente+"\nSobrenome: "+sobrenomeDoCliente+"\nCidade: "+cidade+"\nNº de cadastro: "+numeroCadastro+"\nIdade: "+idade);	
    }

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSobrenomeDoCliente() {
		return sobrenomeDoCliente;
	}
	public void setSobrenomeDoCliente(String sobrenomeDoCliente) {
		this.sobrenomeDoCliente = sobrenomeDoCliente;
	}
	public String getNumeroCadastro() {
		return numeroCadastro;
	}
	public void setNumeroCadastro(String numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}
	
}
