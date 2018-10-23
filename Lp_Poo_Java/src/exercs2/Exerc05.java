package exercs2;

import java.util.Scanner;

//Faça um algoritmo que receba um número e mostre o número somente quando o número for par.

public class Exerc05
{
	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = 0;

		// entrada do usuario
		System.out.println("Digite um número: ");
		num = in.nextInt();

		if ((num % 2) == 0)
		{
			System.out.printf("O número %d é par", num);
		} // fim do "if"

		else
		{
			System.out.println("O número inserido é impar!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc05
