package arrays;

/* Desenvolva uma matriz 5x5 que imprima a soma de linha por
 * colunas Ex M[i][j] = i+j */

public class Exerc02_Arrays
{

	public static void main(String[] args)
	{

		// criação da matriz "matriz"
		int[][] matriz = new int[5][5];

		int i, j;

		for (i = 0; i < 5; i++)
		{

			for (j = 0; j < 5; j++)
			{
				
				matriz[i][j] = i + j;
				System.out.print(matriz[i][j] + " ");
				
			}

			System.out.println();
			
		}

	} // fim do metodo main

} //  fim da classe Exerc02_Arrays
