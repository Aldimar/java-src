package exercs2;

import java.util.Scanner;

/* Faça um algoritmo que receba um número e mostre a sua quinta parte 
 * somente quando ela for menor que cinquenta ou maior que mil. */

public class Exerc03
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, quinta_parte = 0;

		// entrada do usuario
		System.out.println("Digite um número: ");
		num = in.nextInt();

		quinta_parte = num / 5;

		if ((quinta_parte < 50) || (quinta_parte > 1000))
		{
			System.out.printf("O número %d tem uma quinta parte menor que 50 ou maior que 1000 sendo ela: %d", num,
					quinta_parte);
		} // fim do "if"

		else
		{
			System.out.println("O número inserido não possui uma quinta parte menor que 50 ou maior que 1000");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc03
