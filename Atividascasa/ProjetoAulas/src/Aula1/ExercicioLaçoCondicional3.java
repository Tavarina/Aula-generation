package Aula1;

import java.util.Scanner;

public class ExercicioLa�oCondicional3 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1=leia.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		numero2=leia.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		numero3=leia.nextInt();
		
	
		if(numero1>numero2 && numero1>numero3)
		{
			System.out.println("Esse � o maior n�mero: "+numero1);
			
		}
		else if(numero2>numero1 && numero2>numero3)
		{
			System.out.println("Esse � o maior n�mero: "+numero2);
		
		}
		else if(numero3>numero1 && numero3>numero2)
		{
			System.out.println("Esse � o maior n�mero: "+numero3);
		}

		
	}
}