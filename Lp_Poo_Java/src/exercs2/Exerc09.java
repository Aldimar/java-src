package exercs2;

import java.util.Scanner;

/* Elaborar um programa que leia três valores para os lados de um triângulo, considerando lados como
 * A, B e C. Verificar se os lados fornecidos formam um triângulo, e se for esta condição verdadeira, deve
 * ser indicado o tipo de triângulo formado: isosceles, escaleno ou equilátero.
 * | b - c | < a < b + c
 * | a - c | < b < a + c
 * | a - b | < c < a + b */

public class Exerc09
{

	public static void main(String[] args)
	{

		// criação de um objeto scanner de nome in + declaração de variaveis
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a, b, c = 0;
		
		// entrada do usuario
		System.out.println("Digite a medida do 1º lado do triângulo: ");
		a = in.nextInt();
		System.out.println("Digite a medida do 3º lado do triângulo: ");
		b = in.nextInt();
		System.out.println("Digite a medida do 4º lado do triângulo: ");
		c = in.nextInt();
		
		if((a <= 0) || (b <= 0) || (c <= 0)) {
			System.err.println("Eviter colocar valores nulos ou negativos!");
		} // fim do "if" 1ª condição
		
		else if((a >= b + c) || (b >= c + a) || (c >= a + b)){
			System.err.println("Não é possivel criar um triângulo com esses valores!");
		} // fim do "if" 2ª condição
		
		else if((a == b) && (b == c)) {
			System.out.println("Os valores inseridos criam um triângulo equilatero! [Todos os lados e ângulos são iguais!]");
		} // fim do "if" 3ª condição
		
		else if((a == b) || (b == c) || (c == a)) {
			System.out.println("Os valores inseridos ciram um triângulo isoceles! [Dois lados são iguais!]");
		} // fim do "if" 4ª condição
		
		else {
			System.out.println("Os valores inseridos criam um triângulo escaleno! [Todos os lados e ângulos diferentes!]");
		} // fim do "else"
		
	} // fim do metodo main

} // fim da classe Exerc09
