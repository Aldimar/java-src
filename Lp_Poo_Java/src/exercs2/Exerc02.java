package exercs2;

import java.util.Scanner;

/* Crie um algoritmo que receba um número e mostre o número e o seu dobro 
 * somente quando o número for maior que noventa e menor que cem. */

public class Exerc02
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num, dobro = 0;

		// entrada do usuario
		System.out.println("Digite um número: ");
		num = in.nextInt();

		dobro = num * 2;

		if ((num > 90) && (num < 100))
		{
			System.out.printf("O número %d é maior que 90, menor que 100 e o seu dobro é: %d", num, dobro);
		} // fim do "if"

		else
		{
			System.out.println("O número inserido não é maior que 90 nem menor que 100!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc02
