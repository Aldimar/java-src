package exercs2;

import java.util.Scanner;

/* Elabore um algoritmo que receba um número e mostre o número e o 
 * sêxtuplo somente quando o número for maior que noventa. */

public class Exerc04
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, sextuplo = 0;

		// entrada do usuario
		System.out.println("Digite um número: ");
		num = in.nextInt();

		sextuplo = num * 6;

		if (num > 90)
		{
			System.out.printf("O número %d é maior que 90 e seu sextuplo é: %d", num, sextuplo);
		} // fim do "if"

		else
		{
			System.out.println("O número inserido não é maior que 90!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc04
