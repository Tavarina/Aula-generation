package Aula1;

import java.util.Scanner;

public class ExercicioLa�oCondicional2 {
	
	public static void main(String[] args) {
		int numero=0, x=0;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero=leia.nextInt();
		
		if(numero %2==0)
				
			{
			System.out.println("\n O n�mero � par.E a raiz quadrada �: "+numero);
			Math.sqrt(numero);
			}
		
			else
				
			{
				System.out.println("\n O n�mero � �mpar.");
			}
		}
	
	
}
