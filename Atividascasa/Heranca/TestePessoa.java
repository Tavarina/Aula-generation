package Heranca;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica",65646);
		Funcionario pedro = new Funcionario ("Pedro",5646,"T.I");
		Pessoa maria = new Funcionario ("Maria",56546,"Inform�tica");
		Pessoa jose = new Coordenador("Jos�",64645,"Medicina");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
