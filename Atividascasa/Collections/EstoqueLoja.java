package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá 
		 * trabalhar com Collection do tipo List do Java para manipular os dados desse estoque,
		 *  o programa deverá atender as seguintes funcionalidades:

			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list*/
              
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		
		do 
		{
			System.out.println("<----------------------------------------------->");
			System.out.println("\n(1) Para armazenar dados da lista.");
			System.out.println("\n(2) Para remover dados da lista.");
			System.out.println("\n(3) Para atualizar dados da lista.");
			System.out.println("\n(4) Para mostrar dados da lista.");
			System.out.println("\n(0) Para sair da lista.");
			System.out.println("\nDigite uma opção a seguir: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja armazenar: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que você deseja remover: ");
				String peca = leia.nextLine();
				if(estoque.contains(peca))
				{
					estoque.remove(peca);
					
				}
				else
				{
					System.out.println("\nProduto está indisponivel no estoque. ");
				}
				 break;
				 
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo produto que deseja substituir: ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
	            	estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto indisponivel no estoque.");
					
				}
				break;
				
			case 4:
				System.out.println("\n Todos os produtos armazenados são: ");
				System.out.println(estoque);
				break;
				default:
				
				System.out.println("\n Programa de armazenamento finalizado... Boa tarde!");
				
			}
		}while(op!=0);

	}

}
