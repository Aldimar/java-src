package exercs2;

import java.util.Scanner;

/* Faça um algoritmo que receba a matrícula e duas notas do aluno. Calcular a média e mostrar a
 * matrícula do aluno com as seguintes mensagens de acordo com os dados a seguir:
 * MÉDIA MENSAGEM Média > 7,0 “Aluno Aprovado”
 * Média = 7,0 “Aluno em Recuperação”
 * Média < 7,0 “Aluno Reprovado” */

public class Exerc10
{
	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis (arrays)
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int matricula[] = new    int[5];
		double  nota1[] = new double[5]; 
		double  nota2[] = new double[5];
		double  media[] = new double[5];
		String status[] = new String[5];
		
		// entrada do usuario
		for(int i = 1; i < 5; i++) {
			System.out.printf("Digite a matricula do %dº aluno: ", i);
			matricula[i] = in.nextInt();
			System.out.printf("Digite a 1º nota do %dº aluno: ", i);
			nota1[i] = in.nextDouble();
			System.out.printf("Digite a 2º nota do %dº aluno: ", i);
			nota2[i] = in.nextDouble();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
			
			if(media[i] > 7) {
				status[i] = "Aprovado";
			} // fim do "if" 1ª condição
			
			else if(media[i] == 7) {
				status[i] = "Recuperação";
			} // fim do "if" 2ª condição
			
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
