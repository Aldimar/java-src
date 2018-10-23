package arrays;

/* Criar um vetor em Java que leia dois vetores de 3 posições e
 * faça a soma dos elementos de mesmo índice, colocando o
 * resultado em um terceiro vetor. Mostre o vetor resultante. */

public class Exerc04_Arrays
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + criação dos vetor "vetor1" "vetor2" e "vtSoma"
		double[] vetor1 =
		{ 1.0, 2.5, 4.5 };

		double[] vetor2 =
		{ 8.9, 9.0, 8.6 };

		double[] vtSoma = new double[3];

		int i;

		for (i = 0; i < 3; i++)
		{
				
				vtSoma[i] = vetor1[i] + vetor2[i]; 
				
				System.out.printf("%.1f + %.1f = %.1f", vetor1[i], vetor2[i], vtSoma[i]);
				System.out.println();
		
		}

	} // fim do metodo main

} //  fim da classe Exerc04_Arrays
