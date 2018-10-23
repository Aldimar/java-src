package exercs2;

import java.util.Scanner;

/* Escreva um algoritmo que receba um n�mero e mostre a sua 
 * metade somente quando ela for maior que cinquenta. */

public class Exerc01
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, metade = 0;

		// entrada do usuario
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		metade = num / 2;

		if (metade > 50)
		{
			System.out.printf("O n�mero %d tem uma metade maior que 50 sendo ela: %d", num, metade);
		} // fim do "if"

		else
		{
			System.out.println("O n�mero inserido n�o possui uma metade maior que 50!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc01
