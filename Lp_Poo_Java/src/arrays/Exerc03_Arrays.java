package arrays;

public class Exerc03_Arrays
{

	public static void main(String[] args)
	{

		// criação da matriz "matriz" + pré definição de valores
		double[][] matriz = {{1.0, 2.5, 4.5},
							 {8.9, 9.0, 8.6}};

		int i, j;

		for (i = 0; i < 2; i++)
		{

			for (j = 0; j < 3; j++)
			{
					
				System.out.print(matriz[i][j] + " ");
				
			}
			
			System.out.println();

		}

	} // fim do metodo main

} //  fim da classe Exerc03_Arrays
