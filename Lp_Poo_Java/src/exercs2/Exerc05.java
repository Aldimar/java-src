package exercs2;

import java.util.Scanner;

//Fa�a um algoritmo que receba um n�mero e mostre o n�mero somente quando o n�mero for par.

public class Exerc05
{
	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = 0;

		// entrada do usuario
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		if ((num % 2) == 0)
		{
			System.out.printf("O n�mero %d � par", num);
		} // fim do "if"

		else
		{
			System.out.println("O n�mero inserido � impar!");
		} // fim do "else"

	} // fim do metodo main

} // fim da classe Exerc05
