programa
{
	
	funcao inicio()
	{ 
		inteiro lancamento[10],somalanc=0,maiorlanc=0,x, contlanc=0
		real medialanc

		para(x=0;x<10;x++)
		escreva("\nLançamento: ")
		leia(lancamento[x])

		somalanc= somalanc + lancamento[x]
		
		se(maiorlanc <=lancamento[x])
	{
		maiorlanc=lancamento[x]
	   }
	}
	medialanc = somalanc / 10
	
	para(x=0;x<10;x++)
	{ 
		se(maiorlanc == lancamento[x])
		{
			contlanc++
		}
	}
	
	escreva("\nMédia de lançamentos: ",medialanc)
	escreva("\nQuantidade do maior lançamentos: ",contlanc)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */