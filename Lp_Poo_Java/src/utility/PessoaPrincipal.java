package utility;

import java.util.Scanner;

public class PessoaPrincipal
{

	public static void main(String[] args)
	{

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		// Pessoa 1
		System.out.println("Nome da 1� Pessoa: ");
		pessoa1.nome = input.next();

		System.out.println("Peso da 1� Pessoa (Kg): ");
		pessoa1.peso = input.nextDouble();

		System.out.println("Altura da 1� Pessoa (m): ");
		pessoa1.altura = input.nextDouble();
		//---------------------------------------------------------------------------------------------------------------------------//

		// Pessoa 2
		System.out.println("Nome da 2� Pessoa: ");
		pessoa2.nome = input.next();

		System.out.println("Peso da 2� Pessoa (Kg): ");
		pessoa2.peso = input.nextDouble();

		System.out.println("Altura da 2� Pessoa (m): ");
		pessoa2.altura = input.nextDouble();
		//---------------------------------------------------------------------------------------------------------------------------//
		
		System.out.printf("IMC da 1� pessoa = %.2f\n%s voc� est�: %s\n", pessoa1.calcularIMC(), pessoa1.nome, pessoa1.classificaIMC());
		System.out.println();
		System.out.printf("IMC da 2� pessoa = %.2f\n%s voc� est�: %s\n", pessoa2.calcularIMC(), pessoa2.nome, pessoa2.classificaIMC());
		
	} // Fim do metodo main

} // Fim da classe PessoaPrincipal