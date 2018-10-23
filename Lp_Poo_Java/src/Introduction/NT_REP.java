package Introduction;

import java.util.Scanner;

public class NT_REP
{

	public static void main(String[] args)
	{


		double NOTA1, NOTA2, NOTA3, MEDIA;
		int NUM_FALTAS;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a 1� nota: ");
		NOTA1 = input.nextDouble();
		System.out.println("Digite a 2� nota: ");
		NOTA2 = input.nextDouble();
		System.out.println("Digite a 3� nota: ");
		NOTA3 = input.nextDouble();

		System.out.println("Digite o n�mero de faltas: ");
		NUM_FALTAS = input.nextInt();

		if (NUM_FALTAS > 18)
		{

			System.err.println("O aluno est� reprovado por faltas! [MEDIA INDISPONIVEL!]");

		}

		else
		{

			MEDIA = (NOTA1 + NOTA2 + NOTA3) / 3;

			if (MEDIA >= 7)
			{

				System.out.printf("O aluno est� aprovado! [Media = %.2f]", MEDIA);

			}

			else if ((MEDIA < 7) && (MEDIA >= 5))
			{

				System.err.printf("O aluno est� recupera��o! [Media = %.2f]", MEDIA);

			}

			else
			{

				System.err.printf("O aluno est� reprovado! [Media = %.2f]", MEDIA);

			}

		}

	}

}
