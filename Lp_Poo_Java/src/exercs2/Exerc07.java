package exercs2;

import java.util.Scanner;

//Fa�a um algoritmo que leia tr�s n�meros inteiros e determine qual dos tr�s � maior.

public class Exerc07
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num[] = new int[4];

		// loop para atribuir valores a array num[0, 1, 2, 3]
		for (int i = 1; i < 4; i++)
		{
			System.out.printf("Digite o %d� n�mero: ", i);
			num[i] = in.nextInt();
		}

		if ((num[1] > num[2]) && (num[1] > num[3]))
		{
			System.out.printf("O n�mero %d � o maior!", num[1]);
		} // fim do "if" 1� condi��o

		else if ((num[2] > num[1]) && (num[2] > num[3]))
		{
			System.out.printf("O n�mero %d � o maior!", num[2]);
		} // fim do "if" 2� condi��o

		else if ((num[1] == num[2]) && (num[1] == num[3]))
		{
			System.out.println("Os 3 n�mero s�o iguais!");
		} // fim do "if" 3� condi��o

		else
		{
			System.out.printf("O n�mero %d � o maior!", num[3]);
		} // fim do "else"

		System.out.printf("\nOs n�mero s�o %d, %d e %d", num[1], num[2], num[3]);

	} // fim do metodo main

} // fim da classe Exerc07
