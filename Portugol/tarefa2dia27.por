programa
{
	
	funcao inicio()
	{
		real n, hextr, salario, salextr
		escreva("Coloque suas horas trabalhadas: ")
		leia(n)
		
		

		se (n>50)
		{
			salario= n*10
			hextr= (n*10)-50
			salextr= hextr*20
			
			escreva("Seu salário total é:R$ ",salario, "e seu salário extra é:R$ ",salextr)
		
			}
			senao
			{
				salario= 0
			     hextr= 0
			     salextr= 0
				escreva("Seu salário total é:R$ ",salario, " e seu salário extra é:R$ ",salextr)
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */