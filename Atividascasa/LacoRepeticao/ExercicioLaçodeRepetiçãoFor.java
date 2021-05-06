package LacoRepeticao;


import java.util.Scanner;

public class ExercicioLaçodeRepetiçãoFor {
	public static void main(String[] args) {
		int num, numpar=0, numimp=0;
		
		
		Scanner leia= new Scanner(System.in);
		
		for(num=1;num<=100;num++) {
			
		System.out.println("Digite o número: ");
		num= leia.nextInt();
		
		if (num%2==0) {
			
			numpar=numpar+1;
		}
		if ((num%2==1)) {
			numimp=numimp+1;
			
		}
			}
		
		System.out.println("\nO total de números pares digitados são: "+numpar);
		System.out.println("\nE o total de números ímpares digitados são: "+numimp);
		

		
	}
}

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)


