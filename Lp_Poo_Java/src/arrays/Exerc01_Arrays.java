package arrays;

import java.util.Scanner;

/* Criar um vetor em Java que armazene dados de três pessoas:
 * Deverão ser armazenados o nome, idade e sexo. Ao final
 * mostre os valores armazenados. */

public class Exerc01_Arrays
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + criação do vetor "tabela"
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] nome = new String[3];
		int[] idade = new int[3];
		String[] sexo = new String[3];
		
		int i;

		// entrada do usuario
		for (i = 0; i < 3; i++)
		{

			System.out.println("Digite o seu nome: ");
			nome[i]  = in.next();
			
			System.out.println("Digite sua idade: ");
			idade[i] = in.nextInt();
			
			System.out.println("Digite seu sexo: ");
			sexo[i]  = in.next();

		}

		System.out.printf("Os dados são: \n"
						+ "[NOME: %s] [IDADE: %s] [SEXO: %s]\n"
						+ "[NOME: %s] [IDADE: %s] [SEXO: %s]\n"
						+ "[NOME: %s] [IDADE: %s] [SEXO: %s]", 
						nome[0], idade[0], sexo[0], nome[1], idade[1], sexo[1], nome[2], idade[2], sexo[2]);

	} // fim do metodo main

} // fim da classe Exerc01_Arrays
