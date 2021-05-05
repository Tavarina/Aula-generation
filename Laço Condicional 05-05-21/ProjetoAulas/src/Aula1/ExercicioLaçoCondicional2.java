package Aula1;

import java.util.Scanner;

public class ExercicioLaçoCondicional2 {
	
	public static void main(String[] args) {
		int numero=0, x=0;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero=leia.nextInt();
		
		if(numero %2==0)
				
			{
			System.out.println("\n O número é par.E a raiz quadrada é: "+numero);
			Math.sqrt(numero);
			}
		
			else
				
			{
				System.out.println("\n O número é ímpar.");
			}
		}
	
	
}
