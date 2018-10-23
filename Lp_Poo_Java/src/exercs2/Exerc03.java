package exercs2;

import java.util.Scanner;

/* Fa�a um algoritmo que receba um n�mero e mostre a sua quinta parte 
 * somente quando ela for menor que cinquenta ou maior que mil. */

public class Exerc03
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, quinta_parte = 0;

		// entrada do usuario
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		quinta_parte = num / 5;

		if ((quinta_parte < 50) || (quinta_parte > 1000))
		{
			System.out.printf("O n�mero %d tem uma quinta parte menor que 50 ou maior que 1000 sendo ela: %d", num,
					quinta_parte);
		} // fim do "if"

		else
		{
			System.out.println("O n�mero inserido n�o possui uma quinta parte menor que 50 ou maior que 1000");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc03
