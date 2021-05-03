programa
{
	
	funcao inicio()
	{ 
		real valor[3][3],somatotal=0.0,somadiag=0.0
		inteiro linha,coluna,x=0
		
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um valor: ")
				leia(valor[linha][coluna])

				somatotal=somatotal+valor[linha][coluna]
				x++
			}
			
		}
		
		para(linha=0;linha<3;linha++)
		{
		    para(coluna=0;coluna<3;coluna++)
		{
			se(somadiag==valor[linha][coluna])
			{
				
	    somadiag= valor[0][0]+valor[1][1]+valor[2][2]
		escreva("\nValor da diagonal: ",somadiag)
			}
		
		}

		
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 7, 5}-{somatotal, 6, 19, 9}-{somadiag, 6, 33, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */