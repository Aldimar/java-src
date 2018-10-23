package exercs;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		double adic, num1, num2, subt, divs, mult = 0;	

		// Criação do objeto scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Primeiro num
		System.out.println("Digite o 1º numero: ");
		num1 = input.nextDouble();
		
		// Segundo num
		System.out.println("Digite o 2º numero: ");
		num2 = input.nextDouble();
		
		// Adição
		adic = num1 + num2;
		
		// Subtração
		subt = num1 - num2;
		
		// Divisão
		divs = num1 / num2;
		
		// Multiplicação
		mult = num1 * num2;
		
		// Resultado
		System.out.printf("As operações feitas com os numeros %.2f e %.2f foram:\n"
						+ "Adição: %.2f\n"
						+ "Subtração: %.2f\n"
						+ "Divisão: %.2f\n"
						+ "Multiplicação: %.2f\n", num1, num2, adic, subt, divs, mult);
				
	} // Fim do metodo main

} // Fim da classe Exerc01
