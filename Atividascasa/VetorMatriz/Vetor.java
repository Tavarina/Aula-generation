package VetorMatriz;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		
	
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.*/
		
		Scanner leia= new Scanner(System.in);
		
		
		int[] numero= new int[6];
		int somapar=0,quantimp=0,x;
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite o n�mero: ");
			numero[x]=leia.nextInt();
			
			if(numero[x]%2==0) {
				somapar=somapar+numero[x];
				
			}
			else {
				
				quantimp++;
			}
		}
		for(x=0;x<6;x++) {
			
			if(numero[x]%2==0) {
				System.out.println("\nOs n�meros pares digitados s�o: "+numero[x]);
			}
			else
			{
				
				System.out.println("\nOs n�meros �mpares digitados s�o: "+numero[x]);
				
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados �: "+somapar);
		
		System.out.println("\nA Quantidade dos n�meros �mpares digitados �: "+quantimp);
		
        }
     }