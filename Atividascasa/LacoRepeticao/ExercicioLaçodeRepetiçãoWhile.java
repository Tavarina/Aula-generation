package LacoRepeticao;

import java.util.Scanner;

public class ExercicioLaçodeRepetiçãoWhile {
       public static void main(String[] args) {
    	   
    	   int idade=0, totalPessoasmenos=0, totalPessoasmais=0;
    	   
    	   Scanner leia= new Scanner(System.in);
    	   
    	  
    	   System.out.println("Digita a sua idade:");
    	   idade=leia.nextInt();
    	   
    	   while(idade!=-99) {
    		   
    		   if(idade<=21){
    			   
    			   totalPessoasmenos=totalPessoasmenos+1;

    		   }
    		   else if(idade>=50){
    			  
    			   totalPessoasmais=totalPessoasmais+1;
    		   }
    		   
    		   System.out.println("Digita a sua idade:");
        	   idade=leia.nextInt();
    		   
    		   
    	   }
    	   System.out.println("Total de pessoas com menos de 21 anos é: "+totalPessoasmenos);
    	   System.out.println("Total de pessoas com mais de 50 anos é: "+totalPessoasmais);
    	   
       }
}

//Solicitar a idade de várias pessoas e imprimir: 
//Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
