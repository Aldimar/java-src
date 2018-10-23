package exercs2;

import java.util.Scanner;

/* Escrever se um ano informado pelo usu�rio � bissexto ou n�o. Um ano � bissexto quando �
 * (divis�vel por 400) ou � (divis�vel por 4 e n�o por 100). */

public class Exerc06
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int ano = 0;

		// entrada do usuario
		System.out.println("Informe um ano: ");
		ano = in.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 == 0)))
		{
			System.out.printf("O ano %d � bissexto", ano);
		} // fim do "if"

		else
		{
			System.out.println("O ano inserido n�o � bissexto!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc06
