programa
{
	inclua biblioteca Matematica-->mat

	funcao inicio()
	{
	inteiro diasvividos, dia, mes, ano

	escreva("Entre com o seu total de dias vivídos: ")
	leia(diasvividos)

	ano=diasvividos/365
	mes= (diasvividos%365)/30
	dia= (diasvividos%365)%30

	escreva("Você tem: ",dia,"dias(s), ",mes," mes(es) e ",ano,"ano(s) de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */