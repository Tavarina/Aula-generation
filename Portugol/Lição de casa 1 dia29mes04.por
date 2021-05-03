programa
{
	
	funcao inicio()
	{
		inteiro ponto[5],maiorponto=0,x

		para(x=0;x<5;x++)
		{
			escreva("\nDigite sua pontuação: ")
			leia(ponto[x])


				se(maiorponto < ponto[x])
				{
					maiorponto = ponto[x]
				}
		}
		para(x=0;x<5;x++)
		{
			escreva("\nPontuação: ",x,": ",ponto[x])
		}

		escreva("\nMaior pontuação: ",maiorponto)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */