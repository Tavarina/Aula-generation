package LacoRepeticao;

import java.util.Scanner;

public class ExercicioLacodeRepeticaoDOWHILE {
	public static void main(String[] args) {
		
		int num,somadonum=0;
		
		Scanner leia= new Scanner(System.in);
 	   
		System.out.println("Digite um número: ");
		num=leia.nextInt();
				
				do {
					
					somadonum =somadonum + num;
					
					System.out.println("\nDigite um número: ");
					num=leia.nextInt();
				}
				while(num>=1);
				{
					
					System.out.println("\nA soma dos números são: "+somadonum);
					
				}
				
		
	}
}


/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE)
 */