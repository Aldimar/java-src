package Introduction;

import java.util.Scanner;

public class NT_REP_REFAC
{

	public static void main(String[] args)
	{

		double NOTAS, TOTAL = 0, MEDIA;
		int NUM_FALTAS;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		for (int i = 1; i < 4; i++)
		{
			System.out.printf("Digite a %dª nota: ", i);
			NOTAS = input.nextDouble();

			TOTAL = NOTAS + TOTAL;
		}

		System.out.println("Digite o número de faltas: ");
		NUM_FALTAS = input.nextInt();

		if (NUM_FALTAS > 18)
		{

			System.err.println("O aluno está reprovado por faltas! [MEDIA INDISPONIVEL!]");

		}

		else
		{

			MEDIA = TOTAL / 3;

			if (MEDIA >= 7)
			{

				System.out.printf("O aluno está aprovado! [Media = %.2f]", MEDIA);

			}

			else if ((MEDIA < 7) && (MEDIA >= 5))
			{

				System.err.printf("O aluno está de recuperação! [Media = %.2f]", MEDIA);

			}

			else
			{

				System.err.printf("O aluno está reprovado! [Media = %.2f]", MEDIA);

			}

		}

	}

}
