package VetorMatriz;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		
	
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.*/
		
		Scanner leia= new Scanner(System.in);
		
		
		int[] numero= new int[6];
		int somapar=0,quantimp=0,x;
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite o número: ");
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
				System.out.println("\nOs números pares digitados são: "+numero[x]);
			}
			else
			{
				
				System.out.println("\nOs números ímpares digitados são: "+numero[x]);
				
			}
		}
		System.out.println("\nA soma dos números pares digitados é: "+somapar);
		
		System.out.println("\nA Quantidade dos números ímpares digitados é: "+quantimp);
		
        }
     }