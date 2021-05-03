programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
	real nota1,nota2,nota3,media
	cadeia nome
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a primeira nota: ")
	     leia(nota1)
	     escreva("Digite a segunda nota: ")
	     leia(nota2)
          escreva("Digite a terceira nota: ")
	     leia(nota3)
  se(nota1<0 ou nota2<0 ou nota3<0)
  { 
  	escreva("\nPor favor coloque notas positivas ou zero...")
  }
  senao
  
{
          media = (nota1+nota2+nota3)/3
          escreva("\nNome do(a)(e) participante: ",nome)

          escreva("\nMédia aritmética foi de: ",mat.arredondar(media,2))
          se(media>=7 e media<=10)//5.5
          {
          	escreva("\nParticipante Aprovado!!")
          }
          senao se (media>=5 e media<7)
	{
          escreva("\nParticipante de Recuperação!!")
   }  
   senao se (media>=0 e media<5)
   {
   	escreva("\nParticipante Reprovado!!")
      }
      senao
      {
      	escreva("\nFavor verificar os valores digitados...")
          }
      }
 
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1042; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */