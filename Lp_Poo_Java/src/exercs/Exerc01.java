package exercs;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		double adic, num1, num2, subt, divs, mult = 0;	

		// Cria��o do objeto scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Primeiro num
		System.out.println("Digite o 1� numero: ");
		num1 = input.nextDouble();
		
		// Segundo num
		System.out.println("Digite o 2� numero: ");
		num2 = input.nextDouble();
		
		// Adi��o
		adic = num1 + num2;
		
		// Subtra��o
		subt = num1 - num2;
		
		// Divis�o
		divs = num1 / num2;
		
		// Multiplica��o
		mult = num1 * num2;
		
		// Resultado
		System.out.printf("As opera��es feitas com os numeros %.2f e %.2f foram:\n"
						+ "Adi��o: %.2f\n"
						+ "Subtra��o: %.2f\n"
						+ "Divis�o: %.2f\n"
						+ "Multiplica��o: %.2f\n", num1, num2, adic, subt, divs, mult);
				
	} // Fim do metodo main

} // Fim da classe Exerc01
