programa
{
	inclua biblioteca Matematica -->mat
	inclua biblioteca Util
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media,mediageral,somamedia=0
		inteiro x,numparticipante

		escreva("\nPor favor, entre com a quantidade de participantes: ")
		leia(numparticipante)//10

		para(x=1;x<=numparticipante;x++)//x+1 x-->x=x-1
		{
			escreva("\n Entre com a primeira nota: ")
			leia(nota1)
			escreva("\n Entre com a segunda nota: ")
			leia(nota2)
			escreva("\n Entre com a terceira nota: ")
			leia(nota3)

			media = (nota1+nota2+nota3)

			escreva("\nMédia do ",x,"o.a.e. Participante: ", mat.arredondar(media,2))
			
			
			se(media>=7 e media<=10)
			{
				escreva("\nParticipante Aprovado!!")

			}

			somamedia= somamedia+ media
			
			}
			limpa()
			mediageral=somamedia

			escreva("\nMédia geral: ")
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 734; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */