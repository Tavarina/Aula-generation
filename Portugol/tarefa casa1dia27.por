programa
{
	
	funcao inicio()
	{
		inteiro peso, excesso, multa
		escreva("Digite o peso de tomate comprado: ")
		leia(peso)

		se (peso >50)
		{
		 excesso= peso-50
		 multa= excesso*4
		 escreva("O valor da multa a pagar é de:R$ ", multa)
		
		}
		senao
		{
			excesso= 0
			multa= excesso*4
			escreva("O valor da multa a pagar é de:R$ ", multa)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */