package Aula1;

import java.util.Scanner;

public class ExercicioLaçoCondicional3 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numero1=leia.nextInt();
		System.out.println("Digite o primeiro número: ");
		numero2=leia.nextInt();
		System.out.println("Digite o primeiro número: ");
		numero3=leia.nextInt();
		
	
		if(numero1>numero2 && numero1>numero3)
		{
			System.out.println("Esse é o maior número: "+numero1);
			
		}
		else if(numero2>numero1 && numero2>numero3)
		{
			System.out.println("Esse é o maior número: "+numero2);
		
		}
		else if(numero3>numero1 && numero3>numero2)
		{
			System.out.println("Esse é o maior número: "+numero3);
		}

		
	}
}