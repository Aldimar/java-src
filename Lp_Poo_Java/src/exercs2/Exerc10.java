package exercs2;

import java.util.Scanner;

/* Fa�a um algoritmo que receba a matr�cula e duas notas do aluno. Calcular a m�dia e mostrar a
 * matr�cula do aluno com as seguintes mensagens de acordo com os dados a seguir:
 * M�DIA MENSAGEM M�dia > 7,0 �Aluno Aprovado�
 * M�dia = 7,0 �Aluno em Recupera��o�
 * M�dia < 7,0 �Aluno Reprovado� */

public class Exerc10
{
	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis (arrays)
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int matricula[] = new    int[5];
		double  nota1[] = new double[5]; 
		double  nota2[] = new double[5];
		double  media[] = new double[5];
		String status[] = new String[5];
		
		// entrada do usuario
		for(int i = 1; i < 5; i++) {
			System.out.printf("Digite a matricula do %d� aluno: ", i);
			matricula[i] = in.nextInt();
			System.out.printf("Digite a 1� nota do %d� aluno: ", i);
			nota1[i] = in.nextDouble();
			System.out.printf("Digite a 2� nota do %d� aluno: ", i);
			nota2[i] = in.nextDouble();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
			
			if(media[i] > 7) {
				status[i] = "Aprovado";
			} // fim do "if" 1� condi��o
			
			else if(media[i] == 7) {
				status[i] = "Recupera��o";
			} // fim do "if" 2� condi��o
			
			else {
				status[i] = "Reprovado";
			} // fim do "else"

		} // fim do loop "for"
		
		System.out.println("Gerando Tabela...");
		System.out.printf("| MATRICULA          | NOTA 1            | NOTA 2            | MEDIA            | STATUS \n"
					    + " %d                   %.1f                %.1f                %.1f               %s      \n"
					    + " %d                   %.1f                %.1f                %.1f               %s      \n"
					    + " %d                   %.1f                %.1f                %.1f               %s      \n"
					    + " %d                   %.1f                %.1f                %.1f               %s      \n",
					    matricula[1], nota1[1], nota2[1], media[1], status[1],
					    matricula[2], nota1[2], nota2[2], media[2], status[2],
					    matricula[3], nota1[3], nota2[3], media[3], status[3],
					    matricula[4], nota1[4], nota2[4], media[4], status[4]);
		
	} // fim do metodo main

} // fim da classe Exerc10
