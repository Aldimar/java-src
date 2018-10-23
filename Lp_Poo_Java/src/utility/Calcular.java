/**
 * 
 */
package utility;

import java.util.Scanner;

/**
 * @author aldimar.junior
 *
 */
public class Calcular
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		double x, y;
		char operation;
		
		System.out.println("Digite o 1� n�mero: ");
		x = in.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		y = in.nextDouble();
		System.out.println("Escolha a opera��o [+, -, /, *]: ");
		operation = in.next().charAt(0);
		
		switch(operation) 
		{
		
		case '+':
			System.out.printf("O resultado de %.2f + %.2f = %.2f", x, y, calculadora.sum(x, y));
			break;
			
		case '-':
			System.out.printf("O resultado de %.2f - %.2f = %.2f", x, y, calculadora.sub(x, y));
			break;
			
		case '/':
			System.out.printf("O resultado de %.2f / %.2f = %.2f", x, y, calculadora.div(x, y));
			break;
			
		case '*':
			System.out.printf("O resultado de %.2f * %.2f = %.2f", x, y, calculadora.mul(x, y));
			break;
			
		default:
			System.err.println("Opera��o invalida!");
			
		}
		
	}

}
