package exercs2;

import java.util.Scanner;

//Faça um algoritmo que leia três números inteiros e determine qual dos três é maior.

public class Exerc07
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num[] = new int[4];

		// loop para atribuir valores a array num[0, 1, 2, 3]
		for (int i = 1; i < 4; i++)
		{
			System.out.printf("Digite o %dº número: ", i);
			num[i] = in.nextInt();
		}

		if ((num[1] > num[2]) && (num[1] > num[3]))
		{
			System.out.printf("O número %d é o maior!", num[1]);
		} // fim do "if" 1ª condição

		else if ((num[2] > num[1]) && (num[2] > num[3]))
		{
			System.out.printf("O número %d é o maior!", num[2]);
		} // fim do "if" 2ª condição

		else if ((num[1] == num[2]) && (num[1] == num[3]))
		{
			System.out.println("Os 3 número são iguais!");
		} // fim do "if" 3ª condição

		else
		{
			System.out.printf("O número %d é o maior!", num[3]);
		} // fim do "else"

		System.out.printf("\nOs número são %d, %d e %d", num[1], num[2], num[3]);

	} // fim do metodo main

} // fim da classe Exerc07
