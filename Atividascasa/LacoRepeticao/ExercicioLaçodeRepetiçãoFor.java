package LacoRepeticao;


import java.util.Scanner;

public class ExercicioLa�odeRepeti��oFor {
	public static void main(String[] args) {
		int num, numpar=0, numimp=0;
		
		
		Scanner leia= new Scanner(System.in);
		
		for(num=1;num<=100;num++) {
			
		System.out.println("Digite o n�mero: ");
		num= leia.nextInt();
		
		if (num%2==0) {
			
			numpar=numpar+1;
		}
		if ((num%2==1)) {
			numimp=numimp+1;
			
		}
			}
		
		System.out.println("\nO total de n�meros pares digitados s�o: "+numpar);
		System.out.println("\nE o total de n�meros �mpares digitados s�o: "+numimp);
		

		
	}
}

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)


