package exercs2;

import java.util.Scanner;

/* Elabore um algoritmo que receba um n�mero e mostre o n�mero e o 
 * s�xtuplo somente quando o n�mero for maior que noventa. */

public class Exerc04
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, sextuplo = 0;

		// entrada do usuario
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		sextuplo = num * 6;

		if (num > 90)
		{
			System.out.printf("O n�mero %d � maior que 90 e seu sextuplo �: %d", num, sextuplo);
		} // fim do "if"

		else
		{
			System.out.println("O n�mero inserido n�o � maior que 90!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc04
