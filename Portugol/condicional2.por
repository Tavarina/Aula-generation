programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
	    cadeia nome
	    real n1,n2,n3,media

	    escreva("Entre com o seu nome: ")
	    leia(nome)
	    escreva("Entre com a primeira nota: ")
	    leia(n1)
	    escreva("Entre com a segunda nota: ")
	    leia(n2)
	    escreva("Entre com a terceira nota: ")
	    leia(n3)

	    media=(n1+n2+n3)
	    limpa()
	    se (media>=7.0)
	    {
	    	escreva("Aluno: ",nome,",Parabéns você foi aprovado, com a nota:", mat.arredondar(media,2))
	    	}
	    	senao se (media>=4 e media<7)
	    	{
	    		escreva("Aluno: ",nome,",Ficou de exame, com a nota: ", mat.arredondar(media, 2))
	    	}
	  senao
	  {
	  	escreva("Aluno: ",nome,", Que pena,você foi reprovado, com a nota: ", mat.arredondar(media,2))
	    	}
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