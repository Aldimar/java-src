package exercs2;

import java.util.Scanner;

/* Crie um algoritmo que receba um n�mero e mostre o n�mero e o seu dobro 
 * somente quando o n�mero for maior que noventa e menor que cem. */

public class Exerc02
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, dobro = 0;

		// entrada do usuario
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		dobro = num * 2;

		if ((num > 90) && (num < 100))
		{
			System.out.printf("O n�mero %d � maior que 90, menor que 100 e o seu dobro �: %d", num, dobro);
		} // fim do "if"

		else
		{
			System.out.println("O n�mero inserido n�o � maior que 90 nem menor que 100!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc02
