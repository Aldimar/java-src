package exercs2;

import java.util.Scanner;

/* Elaborar um programa que leia tr�s valores para os lados de um tri�ngulo, considerando lados como
 * A, B e C. Verificar se os lados fornecidos formam um tri�ngulo, e se for esta condi��o verdadeira, deve
 * ser indicado o tipo de tri�ngulo formado: isosceles, escaleno ou equil�tero.
 * | b - c | < a < b + c
 * | a - c | < b < a + c
 * | a - b | < c < a + b */

public class Exerc09
{

	public static void main(String[] args)
	{

		// cria��o de um objeto scanner de nome in + declara��o de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a, b, c = 0;
		
		// entrada do usuario
		System.out.println("Digite a medida do 1� lado do tri�ngulo: ");
		a = in.nextInt();
		System.out.println("Digite a medida do 3� lado do tri�ngulo: ");
		b = in.nextInt();
		System.out.println("Digite a medida do 4� lado do tri�ngulo: ");
		c = in.nextInt();
		
		if((a <= 0) || (b <= 0) || (c <= 0)) {
			System.err.println("Eviter colocar valores nulos ou negativos!");
		} // fim do "if" 1� condi��o
		
		else if((a >= b + c) || (b >= c + a) || (c >= a + b)){
			System.err.println("N�o � possivel criar um tri�ngulo com esses valores!");
		} // fim do "if" 2� condi��o
		
		else if((a == b) && (b == c)) {
			System.out.println("Os valores inseridos criam um tri�ngulo equilatero! [Todos os lados e �ngulos s�o iguais!]");
		} // fim do "if" 3� condi��o
		
		else if((a == b) || (b == c) || (c == a)) {
			System.out.println("Os valores inseridos ciram um tri�ngulo isoceles! [Dois lados s�o iguais!]");
		} // fim do "if" 4� condi��o
		
		else {
			System.out.println("Os valores inseridos criam um tri�ngulo escaleno! [Todos os lados e �ngulos diferentes!]");
		} // fim do "else"
		
	} // fim do metodo main

} // fim da classe Exerc09
