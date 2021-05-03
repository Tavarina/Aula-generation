programa
{
      inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	inteiro totalemsegundos, segundos, horas, minutos

		escreva("Entre com o total de segundos do evento: ")
		leia(totalemsegundos)
         

		horas= totalemsegundos/3600
		minutos= (totalemsegundos%3600)/60
		segundos= (totalemsegundos%60)/60

		escreva("O tempo de duração do evento na fábrica é de:  ", horas, " horas ", minutos, " minutos e " ,segundos, " segundos")
	


	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */