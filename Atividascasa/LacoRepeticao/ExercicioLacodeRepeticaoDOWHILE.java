package LacoRepeticao;

import java.util.Scanner;

public class ExercicioLacodeRepeticaoDOWHILE {
	public static void main(String[] args) {
		
		int num,somadonum=0;
		
		Scanner leia= new Scanner(System.in);
 	   
		System.out.println("Digite um n�mero: ");
		num=leia.nextInt();
				
				do {
					
					somadonum =somadonum + num;
					
					System.out.println("\nDigite um n�mero: ");
					num=leia.nextInt();
				}
				while(num>=1);
				{
					
					System.out.println("\nA soma dos n�meros s�o: "+somadonum);
					
				}
				
		
	}
}


/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */