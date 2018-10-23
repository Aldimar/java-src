package exercs2;

import java.util.Scanner;

/* Escrever se um ano informado pelo usuário é bissexto ou não. Um ano é bissexto quando é
 * (divisível por 400) ou é (divisível por 4 e não por 100). */

public class Exerc06
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int ano = 0;

		// entrada do usuario
		System.out.println("Informe um ano: ");
		ano = in.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 == 0)))
		{
			System.out.printf("O ano %d é bissexto", ano);
		} // fim do "if"

		else
		{
			System.out.println("O ano inserido não é bissexto!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc06
