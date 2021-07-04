package OriantacaoObjetos;

public class TestePaciente {
	
	
   public static void main(String[] args) {
	   
	   String nomeDoPaciente;
	   String sobrenomeDoPaciente;
	   int idade;
	   String cidadeDoPaciente;
	   String numeroDoRegistro;
	   String entradaDoPaciente;
	   String motivo;
	   
	
	    System.out.println("\nFicha de Internação: ");
		Pacientes pacientes = new Pacientes ("Fernanda","Dias",47,"São Roque","32345451","15/04/21","Falta de ar");
		pacientes.imprimirInfo();
		
		System.out.println("****************************");
		
		pacientes.setNomeDoPaciente("Luiza");
		pacientes.setSobrenomeDoPaciente("Fidalgo");
		pacientes.setIdade(15);
		pacientes.setCidadeDoPaciente("Campinas");
		pacientes.setNumeroDoRegistro("454981265");
		pacientes.setEntradaDoPaciente("25/07/21");
		pacientes.setMotivo("Dores no corpo");
		pacientes.imprimirInfo();
		
	System.out.println("****************************");
		
		pacientes.setNomeDoPaciente("José");
		pacientes.setSobrenomeDoPaciente("Maciel");
		pacientes.setIdade(36);
		pacientes.setCidadeDoPaciente("Campinas");
		pacientes.setNumeroDoRegistro("147112154");
		pacientes.setEntradaDoPaciente("18/10/21");
		pacientes.setMotivo("Corte profundo na perna");
		pacientes.imprimirInfo();
		
     }
}
