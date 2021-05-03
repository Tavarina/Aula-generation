programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica
	
	
	funcao inicio()
	{
		inteiro x, num,
		
		escreva("Digite um numero: ")
		leia(num)
		
		
		
    maiornum=num

		enquanto (num%2==0)
		{
			multnum= multnum * num
			se(maiornum>num)
			{
				multnum = num
			}
			escreva("\nResultado dos numeros multiplicado: ")
			
		}
		
		
			
		
		
	}
}

/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
(imprimindo o novo valor) até que ele seja maior do que 100.
Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
(x=1;x<=10;x++)
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */