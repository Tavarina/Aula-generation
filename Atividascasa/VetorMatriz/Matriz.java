package VetorMatriz;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner leia= new Scanner(System.in);
		
		float [][] val= new float [3][3];
		float valorm=0,x;
		int cont=0,linha,coluna;
		
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("Digite um número:  ");
				val[linha][coluna]=leia.nextFloat();
				
				/*valorm=valorm+val[linha][coluna];*/
			   /* cont++;*/
			
		        }
			for(linha=0;linha<3;linha++) {
				for(coluna=0;coluna<3;coluna++) {
					
					if(val[linha][coluna]>=10) {
						 valorm=valorm+val[linha][coluna];
						 System.out.println("O total de valores acima de 10 é: "+valorm);
					}
				}
		    }	
		}
	}
}
			
	
	
	
	
	
