package exercs2;

import java.util.Scanner;

/* Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes
 * categorias:
 * Infantil A = 5 a 7 anos
 * Infantil B = 8 a 11 anos
 * Juvenil A = 12 a 13 anos
 * Juvenil A = 14 a 17 anos
 * Adultos = Maiores de 18 anos */

public class Exerc08
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int idade = 0;
		
		// entrada do usuario
		System.out.println("Digite a idade do nadador: ");
		idade = in.nextInt();
		
		switch(idade) {
		case 5: case 6: case 7:
			System.out.println("O nadador pertence a turma Infatil A [5 a 7 anos]!");
			break;
			
		case 8: case 9: case 10: case 11:
			System.out.println("O nadador pertence a turma Infantil B [8 a 11 anos]!");
			break;
			
		case 12: case 13:
			System.out.println("O nadador pertence a turma Juvenil A [12 a 13 anos]!");
			break;
			
		case 14: case 15: case 16: case 17:
			System.out.println("O nadador pertence a turma Juvenil B [14 a 17 anos]!");
			break;
			
		default:
			System.out.println("O nadador pertence a turma Adultos [Maiores de 18 anos]!");
			break;
			
		} // fim do "switch - case"

	} // fim do metodo main

} // fim da classe Exerc08
